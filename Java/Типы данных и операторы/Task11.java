public class Task11 {
    public static void main(String[] args) {

            // Преобразование строки в число в десятичной системе
            Integer decimalValue = Integer.decode("123");
            System.out.println("Decimal value: " + decimalValue);

            // Преобразование строки в число в шестнадцатеричной системе
            Integer hexValue = Integer.decode("0x1A");
            System.out.println("Hexadecimal value: " + hexValue);

            // Преобразование строки в число в восьмеричной системе
            Integer octalValue = Integer.decode("0123");
            System.out.println("Octal value: " + octalValue);

            // Преобразование строки с использованием префикса -
            Integer negativeValue = Integer.decode("-0x1A");
            System.out.println("Negative hexadecimal value: " + negativeValue);
        
    }
}
