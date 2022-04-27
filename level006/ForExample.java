package level006;

public class ForExample {

    public static void main(String[] args) {
        for (int value = 10; value > 0; value--) {
            if (value == 3) {
                continue;
                //break;
            }
            System.out.println(value);
        }
    }
    //for (int value = 10; value > 0; value--) {
            //System.out.println(value);



}
