public class Task5 {
    public static void main(String[] args) {
        int a = 10;
        double b = 5.5;
        double result = a + b; // int автоматически преобразуется в double 
        System.out.println(result); // 15.5
    }
}
/*
  При выполнении арифметических операций с переменными разных типов, Java автоматически преобразует 
  меньший тип в больший, чтобы избежать потери данных.
*/
