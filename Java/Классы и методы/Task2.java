class Animal {
    // Переопределенный метод
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Переопределение метода sound() в подклассе
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
    
    // Перегрузка метода sound(), добавление параметра
    public void sound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Woof");
        }
    }
}

public class Task2 {
    public static void main(String[] args) {
        // Создание объектов
        Animal animal = new Animal();
        Dog dog = new Dog();
        
        // Переопределение метода sound() для объекта dog
        animal.sound();  // Вывод: Animal makes a sound
        dog.sound();     // Вывод: Dog barks
        
        // Перегрузка метода sound() для объекта dog
        dog.sound(3);    // Вывод: Woof Woof Woof
    }
}