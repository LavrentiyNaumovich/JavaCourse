public class Task10 {
    public static void main(String[] args) {
        
        // Пример с обычным объектом
        Object obj = "Hello, Java!";
        
        if (obj instanceof String) {
            System.out.println("obj is an instance of String.");
        } else {
            System.out.println("obj is not an instance of String.");
        }

        // Пример с null
        Object nullObj = null;
        if (nullObj instanceof String) {
            System.out.println("nullObj is an instance of String.");
        } else {
            System.out.println("nullObj is not an instance of String.");  // Это будет выведено
        }

        // Пример с кастомными классами
        class Animal {}
        class Dog extends Animal {}
        
        Animal animal = new Dog();
        
        if (animal instanceof Dog) {
            System.out.println("animal is an instance of Dog.");
        }
        
        if (animal instanceof Animal) {
            System.out.println("animal is an instance of Animal.");
        }
    }
}
