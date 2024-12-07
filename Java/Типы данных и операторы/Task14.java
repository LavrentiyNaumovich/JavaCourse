public class Task14 {
    public static void main(String[] args) {
        int i1 = 128;
        Integer a1 = i1;  // Автоупаковка
        Integer b1 = i1;  // Автоупаковка
        System.out.println("a1==i1 " + (a1 == i1)); // false
        System.out.println("b1==i1 " + (b1 == i1)); // false
        System.out.println("a1==b1 " + (a1 == b1)); // false
        System.out.println("a1.equals(i1) -> " + a1.equals(i1)); // true
        System.out.println("b1.equals(i1) -> " + b1.equals(i1)); // true
        System.out.println("a1.equals(b1) -> " + a1.equals(b1)); // true

        int i2 = 127;
        Integer a2 = i2;  // Автоупаковка
        Integer b2 = i2;  // Автоупаковка
        System.out.println("a2==i2 " + (a2 == i2)); // true
        System.out.println("b2==i2 " + (b2 == i2)); // true
        System.out.println("a2==b2 " + (a2 == b2)); // true
        System.out.println("a2.equals(i2) -> " + a2.equals(i2)); // true
        System.out.println("b2.equals(i2) -> " + b2.equals(i2)); // true
        System.out.println("a2.equals(b2) -> " + a2.equals(b2)); // true
    }
}
/*
 Операция сравнения == проверяет, указывают ли две переменные на один и тот же объект в памяти
 Для значений, больших 127, объекты Integer будут разными, даже если значения одинаковы
 IntegerCache: Для значений в диапазоне от -128 до 127 Java использует кэширование объектов Integer. 
 Таким образом, для этих значений == будет возвращать true, потому что ссылки на объекты с одинаковыми значениями будут одинаковыми.
 */