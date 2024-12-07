interface Animal {
    // Неабстрактный метод
    void makeSound();
    
    // Статический метод
    static void printMessage() {
        System.out.println("Animals are not aliens");
    }
}

// Класс, реализующий интерфейс
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("meow");
    }
}

public class Task1 {
    public static void main(String[] args) {
        // Вызов статического метода через интерфейс
        Animal.printMessage();
        
        // Вызов метода через объект класса, реализующего интерфейс
        Dog dog = new Dog();
        dog.makeSound();
    }
}
