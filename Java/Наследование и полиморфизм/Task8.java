
public class Task8 {

    // Метод print() для вывода целого числа
    public void print(int number) {
        System.out.println("Int: " + number);
    }

    // Метод print() для вывода числа с плавающей запятой
    public void print(double number) {
        System.out.println("Double: " + number);
    }

    // Метод print() для вывода строки
    public void print(String message) {
        System.out.println("Message: " + message);
    }

    // Метод print() для вывода двух строк
    public void print(String message1, String message2) {
        System.out.println("Messages: " + message1 + " и " + message2);
    }

    // Метод print() для вывода массива целых чисел
    public void print(int[] numbers) {
        System.out.print("Array: ");
        for(int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Task8 printer = new Task8();

        printer.print(10); // Int: 10

        printer.print(3.14); // Double: 3.14

        printer.print("Hello"); // Message: Hello

        printer.print("Hello", "Bye bye"); // Messages: Hello and Bye bye

        int[] nums = {1, 2, 3, 4, 5};
        printer.print(nums); // Array: 1 2 3 4 5 
    }
}