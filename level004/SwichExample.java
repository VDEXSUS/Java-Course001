package level004;

public class SwichExample {

    public static void main(String[] args) {
        // byte short int char string enum
        int value = 2;
        switch (value) {
            case 1:
                System.out.println("value == 1");
                break;
            case 2:
                System.out.println("value == 2");
                break;
            case 10:
                System.out.println("value == 10");
                break;
            case 28:
                System.out.println("value == 28");
                break;
            default:
                System.out.println("Eror");
        }
    }
}
