class A {
    int a;
    int b;
    int c;
    int z;

    public A() {
        z = 1;
    }

    public A(int a) {
        this();          // Вызов конструктора A()
        this.a = a;
    }

    public A(int a, int b) {
        this(a);         // Вызов конструктора A(int a)
        this.b = b;
    }

    public A(int a, int b, int c) {
        this(a, b);      // Вызов конструктора A(int a, int b)
        this.c = c;
    }
  
}

