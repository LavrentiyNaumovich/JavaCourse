/*Принцип подстановки Лисков — это один из принципов SOLID, который гласит, что объекты подклассов должны быть взаимозаменяемы с объектами суперклассов,
 не нарушая правильности работы программы. То есть, если класс S является подклассом класса T, то объекты класса S должны вести себя так же, 
 как объекты класса T в любой программе, где используются объекты типа T. */
 
 abstract class Bird {
    public abstract void move();
}

class Eagle extends Bird {
    @Override
    public void move() {
        System.out.println("Eagle flies!");
    }
}

class Penguin extends Bird {
    @Override
    public void move() {
        System.out.println("Penguin slides.");
    }
}   