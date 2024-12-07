class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class Task7 {
    public static void main(String[] args) {
        // Создаем объекты параметризованных классов 
        Box<Integer> intBox = new Box<>(123);
        Box<String> strBox = new Box<>("Hello");

        // Используем instanceof для проверки типа объекта
        if (intBox instanceof Box<?>) {
            System.out.println("intBox is an instance of Box.");
        }
        
        if (strBox instanceof Box<?>) {
            System.out.println("strBox is an instance of Box.");
        }

        // Проверка конкретного типа
        if (intBox.getValue() instanceof Integer) {
            System.out.println("intBox contains Integer.");
        }

        if (strBox.getValue() instanceof String) {
            System.out.println("strBox contains String.");
        }
    }
}
