public class Task9 {
    public static void main(String[] args) {
        // Операторы присваивания и арифметические операторы
        int a = 5;
        int b = 10;
        a += b;  // a = a + b
        System.out.println("a += b: " + a);

        a -= b;  // a = a - b
        System.out.println("a -= b: " + a);

        a *= b;  // a = a * b
        System.out.println("a *= b: " + a);

        a /= b;  // a = a / b
        System.out.println("a /= b: " + a);

        a %= b;  // a = a % b
        System.out.println("a %= b: " + a);

        // Операторы инкремента и декремента
        int x = 5;
        System.out.println("prefix: " + (++x)); // x = 6
        System.out.println("postfix: " + (x++)); // Выводится 6, потом x становится 7
        System.out.println("after postfix x = " + x); // x = 7

        // Операторы логических и битовых операций
        boolean flag = true;
        boolean flag2 = false;
        System.out.println("flag && flag2: " + (flag && flag2)); // Логическое И
        System.out.println("flag || flag2: " + (flag || flag2)); // Логическое ИЛИ
        System.out.println("flag ^ flag2: " + (flag ^ flag2)); // Исключающее ИЛИ
        System.out.println("!flag: " + !flag); // Логическое НЕ

        // Битовые операторы
        int num1 = 5;   // 0101
        int num2 = 3;   // 0011
        System.out.println("num1 & num2: " + (num1 & num2)); // Побитовое И (0011)
        System.out.println("num1 | num2: " + (num1 | num2)); // Побитовое ИЛИ (0111)
        System.out.println("num1 ^ num2: " + (num1 ^ num2)); // Побитовое исключающее ИЛИ (0100)
        System.out.println("~num1: " + (~num1)); // Побитовое НЕ (~0101 = 1010)

        // Операторы сравнения
        System.out.println("a == b: " + (a == b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a <= b: " + (a <= b));

        // Операторы с типом String
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("str1 + str2: " + (str1 + " " + str2)); // Конкатенация строк
        System.out.println("str1 == str2: " + str1.equals(str2)); // Сравнение строк

        // Операторы с массивами
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("arr[0]: " + arr[0]); // Индексация массива
    }
}
