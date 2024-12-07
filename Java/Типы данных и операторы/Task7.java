public class Task7 {
    public static void main(String[] args) {
        int a = 120;

        // Сужающее преобразование типов 
        byte b = (byte)(a + 10); 
        byte c = (byte)(a + 10); 
        byte d = (byte)(a + 1);  

        System.out.println(b);  // -126
        System.out.println(c);  // -126
        System.out.println(d);  // 121
    }
}
/*
 Сужающее преобразование может привести к потере данных
 В случае, когда результат выходит за пределы диапазона byte (-128 до 127), происходит переполнение 
 Поэтому результат для переменных b и c — это -126, а для d — 121
 */