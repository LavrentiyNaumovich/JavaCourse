import java.io.FileOutputStream;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        String filePath = "data.txt";

        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            String data = "123456789";
            
            for (int i = 0; i < data.length(); i++) {
                fos.write(data.charAt(i));  // Записываем символ как байт
            }

            fos.write('\n');  // Записываем символ новой строки

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
