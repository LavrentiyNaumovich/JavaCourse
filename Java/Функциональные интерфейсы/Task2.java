interface Animal {
    default void getName() {
        System.out.println("This is an animal.");
    }
}

interface Pet {
    default void getName() {
        System.out.println("This is a pet.");
    }
}

// Реализует оба интерфейса и переопределяет метод getName()
class Dog implements Animal, Pet {
    @Override
    public void getName() {
        Animal.super.getName();  // Вызов метода из интерфейса Animal
        Pet.super.getName();     // Вызов метода из интерфейса Pet
        System.out.println("This is a dog.");
    }
}

public class Task2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        
        // Вызов переопределенного метода getName()
        dog.getName();
    }
}
/*
 Чтобы решить проблему, когда два интерфейса имеют одинаковые методы, можно использовать дефолтные методы в интерфейсах
 Класс, который реализует эти интерфейсы, может либо использовать эти дефолтные реализации, либо переопределить метод
 Если дефолтные методы из разных интерфейсов конфликтуют, можно использовать super, чтобы указать, какой именно метод из интерфейса нужно вызвать.
 */