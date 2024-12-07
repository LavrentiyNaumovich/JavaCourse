class Exception1 extends Exception {}
class Exception2 extends Exception1 {}
class Exception3 extends Exception2 {}

public class Task4 {
    public static void main(String[] args) {
        // Несколько исключений обрабатываются абсолютно одинаково
        try {
            throw new Exception1();
        } catch (Exception1 e) {
            System.out.println("Caught Exception1: " + e.getClass().getSimpleName());
        }

        try {
            throw new Exception2();
        } catch (Exception2 e) {
            System.out.println("Caught Exception2: " + e.getClass().getSimpleName());
        }

        try {
            throw new Exception3();
        } catch (Exception3 e) {
            System.out.println("Caught Exception3: " + e.getClass().getSimpleName());
        }

        // Исключения обрабатываются в иерархическом порядке
        try {
            throw new Exception3();
        } catch (Exception3 e) {
            System.out.println("Caught Exception3: " + e.getClass().getSimpleName());
        } catch (Exception2 e) {
            System.out.println("Caught Exception2: " + e.getClass().getSimpleName());
        } catch (Exception1 e) {
            System.out.println("Caught Exception1: " + e.getClass().getSimpleName());
        }
    }
}
