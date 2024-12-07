class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Task9 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();

        myAnimal.makeSound(); // Animal makes a sound
        myDog.makeSound();    // Dog barks
    }
}
/*
 Если типы возвращаемых значений не совпадают, компилятор выдаст ошибку, и переопределение метода будет невозможно.
 */
