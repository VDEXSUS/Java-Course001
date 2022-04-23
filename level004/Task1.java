package level004;

public class Task1 {

    public static void main(String[] args) {
        int month = 7;
        // Winter 12 1 2
        // Spring 3 4 5
        // Summer 6 7 8
        // Autumn 9 10 11
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Spring");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Summer");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Incorect month");
        }
    }
}
