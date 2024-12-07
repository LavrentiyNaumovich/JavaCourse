interface ThisIsInterface {
    void sayHello();
}

class ThisIsClass implements ThisIsInterface {
    @Override
    public void sayHello() {
        System.out.println("Hello from ThisIsClass");
    }
}

public class Task8 {
    public static void main(String[] args) {
        var a = 10; // var автоматически определяет тип переменной как int
        var b = "Hello"; // var определяет тип как String


        System.out.println(a); 
        System.out.println(b); 

        
        ThisIsInterface myInterface = new ThisIsClass();
        myInterface.sayHello(); // Используем интерфейс
    }
}

