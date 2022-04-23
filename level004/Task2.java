package level004;

public class Task2 {

    public static void main(String[] args) {
//        912312
        int value = 912313;
        int testValue =  value % 10;
        if (testValue == 3) {
            System.out.println("Last number is 3");
        } else {
            System.out.println("Last number is not 3");
        }
    }
}
