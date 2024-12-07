// Интерфейс с вложенным классом
interface Animal {

    // Вложенный класс
    class Dog {
        void bark() {
            System.out.println("Гав! Гав!");
        }
    }

    // Абстрактный метод интерфейса
    void makeSound();
}


class Pet implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Животное издает звук.");
    }

    public static void main(String[] args) {
        Animal.Dog dog = new Animal.Dog();
        
        dog.bark();
        
        // Использование метода интерфейса
        Pet pet = new Pet();
        pet.makeSound();
    }
}
