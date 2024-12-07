class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Ошибка: метод не переопределяет метод из суперкласса
    @Override
    public void bark() {  
        System.out.println("Dog barks");
    }
}

public class Task10 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
    }
}
/*
 Если бы мы не использовали аннотацию @Override, то Java просто бы создала новый метод с именем bark() в классе Dog, 
 и ошибка не была бы выявлена. Добавив @Override, мы получаем сообщение об ошибке компиляции, которое говорит,
 что метод bark() не может переопределять метод из суперкласса, потому что в суперклассе такого метода нет.
 */