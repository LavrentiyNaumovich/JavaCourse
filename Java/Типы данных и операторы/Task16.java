enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Task16 {
    public static void main(String[] args) {
        
        // Пример с int
        int x = 2;
        switch (x) {
            case 1:
                System.out.println("x is 1");
                break;
            case 2:
                System.out.println("x is 2");
                break;
            case 3:
                System.out.println("x is 3");
                break;
            default:
                System.out.println("x is something else");
        }

        // Пример с char
        char letter = 'A';
        switch (letter) {
            case 'A':
                System.out.println("Letter is A");
                break;
            case 'B':
                System.out.println("Letter is B");
                break;
            default:
                System.out.println("Letter is something else");
        }

        // Пример с String
        String str = "hello";
        switch (str) {
            case "hello":
                System.out.println("String is hello");
                break;
            case "world":
                System.out.println("String is world");
                break;
            default:
                System.out.println("String is something else");
        }

        // Пример с enum
        Day day = Day.MONDAY;
        switch (day) {
            case MONDAY:
                System.out.println("It's Monday");
                break;
            case FRIDAY:
                System.out.println("It's Friday");
                break;
            default:
                System.out.println("It's some other day");
        }
    }
}
