public class Task13 {
    public static void main(String[] args) {
        Integer nullInteger = null;
        
        // Автораспаковка: попытка распаковать null приведет к NullPointerException
        try {
            int x = nullInteger; // Здесь будет брошено исключение NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Error: " + e);
        }

        // Пример с автоупаковкой
        try {
            Integer y = null;
            boolean flag = (y != null && y == 1); 
        } catch (Exception e) {
            System.out.println("Autopackaging Error: " + e);
        }
    }
}
