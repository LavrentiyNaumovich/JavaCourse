class Outer {
    private int a = 10;

    class Inner {
        private int b = 20; 
        public void show() {
            System.out.println("a = " + a); 
        }
    }

    void createInner() {
        Inner inner = new Inner();  
        inner.show(); 
    }

    void accessInnerFields() {
        Inner inner = new Inner();
        // Внешний класс не может получить доступ к полю b внутреннего класса, так как оно private
        // System.out.println(inner.b);  // Ошибка
    }
}

public class Task16 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.createInner();  // Oбращается к внутреннему классу
        outer.accessInnerFields();  // Попытка обращения к полям внутреннего класса
    }
}
/*
 Он может создавать экземпляры внутреннего класса, но не может обращаться к его полям или методам напрямую, 
 если только они не объявлены как public, protected
 */