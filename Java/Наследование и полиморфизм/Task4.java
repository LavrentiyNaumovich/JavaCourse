// Класс, помеченный как final
final class FinalClass {
    public void display() {
        System.out.println("method in final class");
    }
}

// Попытка наследования от final класса приведет к ошибке компиляции
//class Subclass extends FinalClass {
    // public void display() {
    //     System.out.println("method in subclass");
    // }
//}

public class Task4 {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();  // Вызов метода из final класса
    }
}
