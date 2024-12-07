public class Task4 {
    public static void main(String[] args) {
        String str = "This is number ";
        int number1 = 5;
        double number2 = 10.5;

        // Перегрузка оператора + для String
        String result = str + number1; 
        System.out.println(result);

        // Перегрузка оператора + для String и double
        String result2 = str + number2;  
        System.out.println(result2);
    }
}
