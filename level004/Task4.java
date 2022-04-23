package level004;

public class Task4 {

    public static void main(String[] args) {
        int year = 2022;
        if (year %4 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Year " + year + " has 366 days");
        } else {
            System.out.println("Year " + year + " has 365 days");
        }
    }
}
