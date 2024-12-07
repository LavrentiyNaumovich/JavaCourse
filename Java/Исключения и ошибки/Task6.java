class Exception1 extends Exception {

    // Конструктор без параметров
    public Exception1() {
        super(); 
    }

    // Конструктор с сообщением об ошибке
    public Exception1(String message) {
        super(message); 
    }

    // Конструктор с сообщением и причиной
    public Exception1(String message, Throwable cause) {
        super(message, cause); 
    }
}

public class Task6 {
    public static void main(String[] args) {
        try {
            // Генерация исключения с сообщением
            throw new Exception1("Something went wrong!");
        } catch (Exception1 e) {
            System.out.println("Caught Exception1: " + e.getMessage());
        }

        try {
            // Генерация исключения с сообщением и причиной
            throw new Exception1("Another error occurred", new NullPointerException());
        } catch (Exception1 e) {
            System.out.println("Caught Exception1 with some cause: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
        }
    }
}
