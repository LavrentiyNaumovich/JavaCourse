public class Task12 {
    int x;
    String name;

    public Task12(int x, String name) {
        this.x = x;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Task12 other = (Task12) obj;
        return this.x == other.x && this.name.equals(other.name);
    }

    public static void main(String[] args) {
        Task12 obj1 = new Task12(5, "Alice");
        Task12 obj2 = new Task12(5, "Alice");
        Task12 obj3 = new Task12(10, "Bob");

        System.out.println(obj1.equals(obj2)); // true
        System.out.println(obj1.equals(obj3)); // false
    }
}
/*
 Рефлексивность: Если мы сравниваем объект с самим собой (в данном случае obj1.equals(obj1)), метод вернёт true.
Симметричность: Если obj1.equals(obj2) возвращает true, то и наоборот: obj2.equals(obj1) также должно вернуть true.
Транзитивность: Если obj1.equals(obj2) и obj2.equals(obj3) возвращают true, то и obj1.equals(obj3) тоже должно вернуть true.
Нуль-сущность: Если сравниваем с null (например, obj1.equals(null)), метод вернёт false.
 */