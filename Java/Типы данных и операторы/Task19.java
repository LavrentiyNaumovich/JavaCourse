public class Task19 {
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                // Использование break: Прерывает выполнение цикла, если i равно 3
                System.out.println("break на i = " + i);
                break; 
            }

            if (i == 1) {
                // Использование continue: Пропускает текущую итерацию
                System.out.println("continue на i = " + i);
                continue; 
            }

            System.out.println("i = " + i);
        }
    }
}