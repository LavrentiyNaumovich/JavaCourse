class Outer {
    private int a = 10;
    public int b = 20;

    // Внутренний класс
    class Inner {
        void show() {
            System.out.println("a = " + a);
        }
    }

    void createInner() {
        Inner inner = new Inner();
        inner.show();
    }
}

public class Task15 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.createInner();
    }
}
/*
 Внутренний класс имеет доступ к полям и методам внешнего класса, даже если они помечены как private,
 потому что внутренний класс связан с внешним и существует в контексте внешнего класса
 */