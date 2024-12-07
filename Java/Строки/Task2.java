import java.util.StringJoiner;

public class Task2 {
    public static void main(String[] args) {
        // Создание StringJoiner с разделителем 
        StringJoiner joiner = new StringJoiner(", ");

        // Добавление строк
        joiner.add("Apple");
        joiner.add("Banana");
        joiner.add("Orange");

        String result = joiner.toString();
        System.out.println("Fruits: " + result);  // "Fruits: Apple, Banana, Orange"

        // Создание StringJoiner с разделителем и начальной/конечной строкой
        StringJoiner joiner1 = new StringJoiner(", ", "[", "]");
        joiner1.add("Cat");
        joiner1.add("Dog");
        joiner1.add("Rabbit");

        String result1 = joiner1.toString();
        System.out.println("Animals: " + result1);  // "Animals: [Cat, Dog, Rabbit]"
    }
}
