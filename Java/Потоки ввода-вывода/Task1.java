import java.io.FileInputStream;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        // Указываем путь к файлу для чтения
        String filePath = "example.txt";

        try (FileInputStream fis = new FileInputStream(filePath)) {
            int byteRead;
            // Считываем байты из файла
            while ((byteRead = fis.read()) != -1) {
                // Преобразуем байт в символ и выводим на экран
                System.out.print((char) byteRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
