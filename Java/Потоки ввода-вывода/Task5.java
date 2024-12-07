import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String filePath = "example.txt";
        File file = new File(filePath);
        
        try (Scanner scanner = new Scanner(file)) {
            // Читаем и выводим файл построчно
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine(); 
                System.out.println(line); 
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        }
    }
}
