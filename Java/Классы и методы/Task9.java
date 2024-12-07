public class Task9 {

    // Перегруженный метод с переменным числом параметров
    public void printSum(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;  
        }
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        Task9 calculator = new Task9();

        // Вызов метода с переменным числом параметров
        calculator.printSum(1, 2, 3, 4, 5);  
        calculator.printSum(10, 20);         
        calculator.printSum(7, 8, 9);      
    }
}