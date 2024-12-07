import java.util.Date;

public class Task8 {
    public static void main(String[] args) {
        Date date = new Date();
        
        System.out.printf("current hour (24-hour format): %tH%n", date); // current hour (24-hour format): 14
        System.out.printf("current minute: %tM%n", date); // current minute: 33
        System.out.printf("current year: %tY%n", date); // current year: 2024
        System.out.printf("current month: %tB%n", date); // current month: December
        System.out.printf("current day of the week: %tA%n", date); // current day of the week: Friday
    }
}
