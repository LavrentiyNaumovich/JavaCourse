class Outer {
    private int outerVar = 30;

    // Внутренний класс с различными спецификаторами доступа
    private class PrivateInner {
        void display() {
            System.out.println("PrivateInner: " + outerVar);
        }
    }

    protected class ProtectedInner {
        void display() {
            System.out.println("ProtectedInner: " + outerVar);
        }
    }

    public class PublicInner {
        void display() {
            System.out.println("PublicInner: " + outerVar);
        }
    }

    void createInnerClasses() {
        // Доступ к внутренним классам
        PrivateInner privateInner = new PrivateInner();
        privateInner.display();

        ProtectedInner protectedInner = new ProtectedInner();
        protectedInner.display();

        PublicInner publicInner = new PublicInner();
        publicInner.display();
    }
}

public class Task13 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.createInnerClasses();

  
        Outer.PublicInner publicInner = outer.new PublicInner();
        publicInner.display();

        Outer.ProtectedInner protectedInner = outer.new ProtectedInner();
        protectedInner.display();
        // Ошибка
        //Outer.PrivateInner privateInner = outer.new PrivateInner();
    }
}
/*
PrivateInner: Этот внутренний класс доступен только в классе Outer. Невозможно создать экземпляр этого класса вне Outer.
ProtectedInner: Этот класс доступен в классе Outer и его подклассах. Он также доступен в том же пакете.
PublicInner: Этот класс доступен для всех, и его можно создать в любом другом классе, при условии, что внешний класс видим.
 */