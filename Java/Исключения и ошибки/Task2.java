public class Task2 {
    public static void main(String[] args) {
        try {
            // ArithmeticException (деление на ноль)
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        try {
            // ArrayIndexOutOfBoundsException (выход за пределы массива)
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            // IllegalArgumentException (недопустимый аргумент)
            throw new IllegalArgumentException("Invalid argument!");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }

        try {
            // ClassCastException (неправильное приведение типов)
            Object obj = new Integer(100);
            String str = (String) obj;
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }

        try {
            // NullPointerException (обращение к null)
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}
