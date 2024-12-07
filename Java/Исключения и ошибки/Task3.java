public class Task3 {
    public static void main(String[] args) {
        try {
            // Будет перехвачено
            System.out.println("Dividing by zero...");
            int result = 10 / 0;  // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        // Не будет перехвачено
        System.out.println("Trying to access an invalid array index...");
        int[] arr = {1, 2, 3};
        System.out.println(arr[5]);  // ArrayIndexOutOfBoundsException

        System.out.println("This will not be printed.");
    }
}

