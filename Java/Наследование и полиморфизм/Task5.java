class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Конструктор Animal: " + name);
    }

    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal {

    String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
        System.out.println("Dog: " + breed);
    }

    @Override
    public void makeSound() {
        // Вызов метода родительского класса
        super.makeSound(); 
        System.out.println("Dog is barking");
    }

    public void displayDetails() {
        // Доступ к полю родительского класса через super
        System.out.println("Name: " + super.name + ", Breed: " + this.breed);
    }
}

public class Task5 {
    public static void main(String[] args) {

        Dog dog = new Dog("Buddy", "Labrador");

        dog.makeSound();

        // Вызов метода, использующего super
        dog.displayDetails();
    }
}
