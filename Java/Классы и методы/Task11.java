public enum Task11 {
    MONDAY("First"), 
    TUESDAY("Second"), 
    WEDNESDAY("Third"), 
    THURSDAY("Fourth"), 
    FRIDAY("Fifth"), 
    SATURDAY("Sixth"), 
    SUNDAY("Seventh");

     String name;

    // Конструктор для инициализации значения
    Task11(String name) {
        this.name = name;
    }

    // Метод для вывода названия дня недели
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        for (Task11 day : Task11.values()) {
            System.out.println(day + " - " + day.getName());
        }
    
    }
}
