import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Класс, представляющий узел дерева Хаффмана.
 */
class HuffmanNode implements Comparable<HuffmanNode> {
    byte value;
    int frequency;
    HuffmanNode leftChild = null;
    HuffmanNode rightChild = null;

    HuffmanNode(byte value, int frequency) {
        this.value = value;
        this.frequency = frequency;
    }

    HuffmanNode(byte value, int frequency, HuffmanNode left, HuffmanNode right) {
        this.value = value;
        this.frequency = frequency;
        this.leftChild = left;
        this.rightChild = right;
    }

    @Override
    public int compareTo(HuffmanNode other) {
        return Integer.compare(this.frequency, other.frequency);
    }

    boolean isLeaf() {
        return this.leftChild == null && this.rightChild == null;
    }
}

/**
 * Основной класс для кодирования и декодирования файлов с использованием алгоритма Хаффмана.
 */
public class Huffman {
    // Карта для хранения кодов Хаффмана
    private static final Map<Byte, String> codeMap = new HashMap<>();

    /**
     * Метод для кодирования байтового массива и записи результата в файл.
     *
     * @param inputBytes      Входные байты для кодирования.
     * @param outputFilePath  Имя выходного файла.
     * @throws IOException Если происходит ошибка ввода/вывода.
     */
    public static void encode(byte[] inputBytes, String outputFilePath) throws IOException {
        // Построение частотного дерева Хаффмана
        HuffmanNode root = buildFrequencyTree(inputBytes);
        // Генерация кодов Хаффмана
        generateCodes(root, "");

        // Кодирование входных байтов
        StringBuilder encodedBuilder = new StringBuilder();
        for (byte b : inputBytes) {
            String code = codeMap.get(b);
            if (code == null) {
                throw new IllegalArgumentException("Byte " + b + " not found in codeMap.");
            }
            encodedBuilder.append(code);
        }

        // Запись кодовой таблицы и закодированных данных в файл
        writeEncodedFile(outputFilePath, encodedBuilder.toString());
    }

    /**
     * Метод для декодирования файла и записи результата в выходной файл.
     *
     * @param inputFilePath  Имя входного закодированного файла.
     * @param outputFilePath Имя выходного декодированного файла.
     * @throws IOException Если происходит ошибка ввода/вывода.
     */
    public static void decode(String inputFilePath, String outputFilePath) throws IOException {
        try (FileInputStream fis = new FileInputStream(inputFilePath);
             FileOutputStream fos = new FileOutputStream(outputFilePath)) {
            // Загрузка кодовой таблицы из файла
            loadCodeMap(fis);
            // Чтение закодированных данных
            String encodedData = readEncodedData(fis);
            // Декодирование данных
            byte[] decodedBytes = decodeData(encodedData);
            // Запись декодированных байтов в выходной файл
            fos.write(decodedBytes);
        }
    }

    /**
     * Метод для построения дерева Хаффмана на основе частоты байтов.
     *
     * @param bytes Входные байты.
     * @return Корень дерева Хаффмана.
     */
    private static HuffmanNode buildFrequencyTree(byte[] bytes) {
        Map<Byte, Integer> frequencyMap = new HashMap<>();
        for (byte b : bytes) {
            frequencyMap.put(b, frequencyMap.getOrDefault(b, 0) + 1);
        }

        PriorityQueue<HuffmanNode> priorityQueue = new PriorityQueue<>();
        for (Map.Entry<Byte, Integer> entry : frequencyMap.entrySet()) {
            priorityQueue.add(new HuffmanNode(entry.getKey(), entry.getValue()));
        }

        while (priorityQueue.size() > 1) {
            HuffmanNode first = priorityQueue.poll();
            HuffmanNode second = priorityQueue.poll();
            HuffmanNode merged = new HuffmanNode((byte) 0, first.frequency + second.frequency, first, second);
            priorityQueue.add(merged);
        }

        return priorityQueue.peek();
    }

    /**
     * Рекурсивный метод для генерации кодов Хаффмана.
     *
     * @param node        Текущий узел дерева.
     * @param currentCode Текущий код.
     */
    private static void generateCodes(HuffmanNode node, String currentCode) {
        if (node == null)
            return;

        if (node.isLeaf()) {
            codeMap.put(node.value, currentCode.isEmpty() ? "0" : currentCode);
            return;
        }

        generateCodes(node.leftChild, currentCode + "0");
        generateCodes(node.rightChild, currentCode + "1");
    }

    /**
     * Метод для записи кодовой таблицы и закодированных данных в файл.
     *
     * @param fileName    Имя выходного файла.
     * @param encodedText Закодированные данные.
     * @throws IOException Если происходит ошибка ввода/вывода.
     */
    private static void writeEncodedFile(String fileName, String encodedText) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            writeCodeMap(fos);
            writeEncodedText(fos, encodedText);
        }
    }

    /**
     * Метод для записи кодовой таблицы в файл.
     *
     * @param fos Поток вывода.
     * @throws IOException Если происходит ошибка ввода/вывода.
     */
    private static void writeCodeMap(FileOutputStream fos) throws IOException {
        fos.write(codeMap.size());

        for (Map.Entry<Byte, String> entry : codeMap.entrySet()) {
            byte byteValue = entry.getKey();
            String code = entry.getValue();

            fos.write(byteValue);
            fos.write(code.length());

            int buffer = 0;
            int bitCount = 0;

            for (char bit : code.toCharArray()) {
                if (bit == '1') {
                    buffer |= (1 << (7 - bitCount));
                }
                bitCount++;
                if (bitCount == 8) {
                    fos.write(buffer);
                    buffer = 0;
                    bitCount = 0;
                }
            }

            if (bitCount > 0) { // Запись оставшихся бит
                fos.write(buffer);
            }
        }
    }

    /**
     * Метод для записи закодированных данных в файл.
     *
     * @param fos         Поток вывода.
     * @param encodedText Закодированные данные.
     * @throws IOException Если происходит ошибка ввода/вывода.
     */
    private static void writeEncodedText(FileOutputStream fos, String encodedText) throws IOException {
        int length = encodedText.length();
        fos.write((length >>> 24) & 0xFF);
        fos.write((length >>> 16) & 0xFF);
        fos.write((length >>> 8) & 0xFF);
        fos.write(length & 0xFF);

        int buffer = 0;
        int bitCount = 0;

        for (char bit : encodedText.toCharArray()) {
            if (bit == '1') buffer |= (1 << (7 - bitCount));
            bitCount++;

            if (bitCount == 8) {
                fos.write(buffer);
                buffer = 0;
                bitCount = 0;
            }
        }

        if (bitCount > 0) { // Запись оставшихся бит
            fos.write(buffer);
        }
    }

    /**
     * Метод для загрузки кодовой таблицы из файла.
     *
     * @param fis Поток ввода.
     * @throws IOException Если происходит ошибка ввода/вывода.
     */
    private static void loadCodeMap(FileInputStream fis) throws IOException {
        int totalEntries = fis.read();
        if (totalEntries == -1) {
            throw new IOException("Failed to read the codeMap size.");
        }

        for (int i = 0; i < totalEntries; i++) {
            int symbolInt = fis.read();
            if (symbolInt == -1)
                throw new IOException("Unexpected end of file while reading symbol.");
            byte symbol = (byte) symbolInt;

            int codeLength = fis.read();
            if (codeLength == -1)
                throw new IOException("Unexpected end of file while reading code length.");

            StringBuilder codeBuilder = new StringBuilder();
            int bitsRead = 0;
            int buffer = 0;

            while (bitsRead < codeLength) {
                if (bitsRead % 8 == 0) {
                    buffer = fis.read();
                    if (buffer == -1)
                        throw new IOException("Unexpected end of file while reading code bits.");
                }
                int bitPosition = 7 - (bitsRead % 8);
                char bit = ((buffer & (1 << bitPosition)) != 0) ? '1' : '0';
                codeBuilder.append(bit);
                bitsRead++;
            }

            codeMap.put(symbol, codeBuilder.toString());
        }
    }

    /**
     * Метод для чтения закодированных данных из файла.
     *
     * @param fis Поток ввода.
     * @return Закодированные данные в виде строки.
     * @throws IOException Если происходит ошибка ввода/вывода.
     */
    private static String readEncodedData(FileInputStream fis) throws IOException {
        byte[] lengthBytes = new byte[4];
        int readBytes = fis.read(lengthBytes);
        if (readBytes != 4)
            throw new IOException("Failed to read the encoded text length.");

        int totalBits = ((lengthBytes[0] & 0xFF) << 24) |
                        ((lengthBytes[1] & 0xFF) << 16) |
                        ((lengthBytes[2] & 0xFF) << 8) |
                        (lengthBytes[3] & 0xFF);

        StringBuilder encodedBuilder = new StringBuilder();
        int byteValue, bitsProcessed = 0;

        while ((byteValue = fis.read()) != -1 && bitsProcessed < totalBits) {
            for (int bit = 7; bit >= 0 && bitsProcessed < totalBits; bit--) {
                encodedBuilder.append(((byteValue >> bit) & 1) == 1 ? '1' : '0');
                bitsProcessed++;
            }
        }

        return encodedBuilder.toString();
    }

    /**
     * Метод для декодирования закодированных данных.
     *
     * @param encoded Закодированные данные в виде строки.
     * @return Декодированный байтовый массив.
     */
    private static byte[] decodeData(String encoded) {
        Map<String, Byte> reverseMap = new HashMap<>();
        for (Map.Entry<Byte, String> entry : codeMap.entrySet()) {
            reverseMap.put(entry.getValue(), entry.getKey());
        }

        ByteArrayOutputStream decodedStream = new ByteArrayOutputStream();
        StringBuilder currentCode = new StringBuilder();

        for (char bit : encoded.toCharArray()) {
            currentCode.append(bit);
            if (reverseMap.containsKey(currentCode.toString())) {
                decodedStream.write(reverseMap.get(currentCode.toString()));
                currentCode.setLength(0);
            }
        }

        return decodedStream.toByteArray();
    }

    /**
     * Метод для чтения содержимого файла как байтового массива.
     *
     * @param filePath Путь к файлу.
     * @return Содержимое файла в виде байтового массива.
     * @throws IOException Если происходит ошибка ввода/вывода.
     */
    public static byte[] readFile(String filePath) throws IOException {
        File file = new File(filePath);
        long fileLength = file.length();

        if (fileLength > Integer.MAX_VALUE) {
            throw new IOException("File is too large to process.");
        }

        byte[] data = new byte[(int) fileLength];
        try (FileInputStream fis = new FileInputStream(file)) {
            int bytesRead = fis.read(data);
            if (bytesRead != fileLength) {
                throw new IOException("Failed to read the entire file.");
            }
        }
        return data;
    }

    /**
     * Главный метод программы.
     *
     * @param args Аргументы командной строки.
     */
    public static void main(String[] args) {
        if (args.length != 3 || (!args[0].equals("e") && !args[0].equals("d"))) {
            System.out.println("Usage: java Huffman <e|d> <InputFileName> <OutputFileName>");
            return;
        }

        String mode = args[0];
        String inputFilePath = args[1];
        String outputFilePath = args[2];

        try {
            if ("e".equals(mode)) {
                byte[] inputBytes = readFile(inputFilePath);
                encode(inputBytes, outputFilePath);
            } else if ("d".equals(mode)) {
                decode(inputFilePath, outputFilePath);
            } else {
                throw new IllegalArgumentException("Invalid mode selected. Use 'e' for encoding or 'd' for decoding.");
            }
            System.out.println("Operation completed successfully!");
        } catch (IOException e) {
            System.err.println("File input/output error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Argument error: " + e.getMessage());
        }
    }
}
