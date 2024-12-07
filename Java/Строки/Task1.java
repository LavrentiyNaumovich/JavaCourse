public class Task1 {
    public static void main(String[] args) {
        // Создание строки для демонстрации методов
        String str = "   Hello, World!   ";

        // length() - Возвращает длину строки
        int length = str.length();
        System.out.println("Length of the string: " + length);  // 18

        // toUpperCase() - Преобразует строку в верхний регистр
        String upperStr = str.toUpperCase();
        System.out.println("String in uppercase: " + upperStr);  // "   HELLO, WORLD!   "

        // toLowerCase() - Преобразует строку в нижний регистр
        String lowerStr = str.toLowerCase();
        System.out.println("String in lowercase: " + lowerStr);  // "   hello, world!   "

        // trim() - Удаляет пробелы в начале и в конце строки
        String trimmedStr = str.trim();
        System.out.println("Trimmed string: '" + trimmedStr + "'");  // "'Hello, World!'"

        // substring() - Извлекает подстроку из строки
        String substring = str.substring(3, 8);
        System.out.println("Substring (index 3 to 8): " + substring);  // "lo, W"

        // charAt() - Возвращает символ на указанной позиции
        char charAtPosition = str.charAt(7);
        System.out.println("Character at position 7: " + charAtPosition);  // "W"

        // replace() - Заменяет символ или подстроку в строке
        String replacedStr = str.replace("World", "Java");
        System.out.println("String after replacement: " + replacedStr);  // "   Hello, Java!   "

        // contains() - Проверяет, содержит ли строка определенную подстроку
        boolean containsWord = str.contains("World");
        System.out.println("Contains 'World': " + containsWord);  //  true

        // startsWith() - Проверяет, начинается ли строка с указанной подстроки
        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWithHello);  // false (because of spaces)

        // indexOf() - Находит индекс первого вхождения символа или подстроки
        int index = str.indexOf("World");
        System.out.println("Index of 'World': " + index);  // 9
    }
}
