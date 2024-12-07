class Superclass {
    // Метод помечен как final, его нельзя переопределить в подклассах
    public final void myMethod() {
        System.out.println("Method in superclass");
    }
}

class Subclass extends Superclass {
    // Попытка переопределить final-метод вызовет ошибку компиляции
    // @Override
    // public void myMethod() {
    //     System.out.println("method in subclass");
    // }

    public void anotherMethod() {
        System.out.println("Another method in subclass");
    }
}

public class Task3 {
    public static void main(String[] args) {
        Subclass obj = new Subclass();
        obj.myMethod(); // Вызовет метод из суперкласса
        obj.anotherMethod(); // Вызовет метод из подкласса
    }
}