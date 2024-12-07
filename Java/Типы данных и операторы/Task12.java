public class Task12 {
    public static void main(String[] args) {

        // Использование метода valueOf()
        Boolean b2 = Boolean.valueOf(false);
        System.out.println("b2: " + b2);

        // Использование литерала 
        Boolean b3 = Boolean.TRUE;
        System.out.println("b3: " + b3);

        // Сравнение строк для получения значения
        Boolean b4 = Boolean.valueOf("true");  // true
        Boolean b5 = Boolean.valueOf("FALSE"); // false
        System.out.println("b4: " + b4 + ", b5: " + b5);
    }
}
