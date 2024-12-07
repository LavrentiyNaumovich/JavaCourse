public class Task1 {
     // public
     public String publicField = "Public Field";
    
     // protected
     protected String protectedField = "Protected Field";
     
     // default
     String defaultField = "Default Field";
     
     // private
     private String privateField = "Private Field";
 
     // public метод
     public void showPublicField() {
         System.out.println(publicField);
     }
 
     // protected метод
     protected void showProtectedField() {
         System.out.println(protectedField);
     }
 
     // default метод
     void showDefaultField() {
         System.out.println(defaultField);
     }
 
     // private метод
     private void showPrivateField() {
         System.out.println(privateField);
     }
 
   
     public static void main(String[] args) {
         Task1 example = new Task1();
         
         // Пример доступности полей и методов
         System.out.println("Using public method:");
         example.showPublicField(); // доступно
         
         System.out.println("Using protected method:");
         example.showProtectedField(); // доступно в этом классе (так как это основной класс)
         
         System.out.println("Using default method:");
         example.showDefaultField(); // доступно в этом пакете
         
         System.out.println("Using private method:");
         // example.showPrivateField(); // Ошибка компиляции
     }
}
