package level007;

public class ArrayExample {

    public static void main(String[] args) {
        int[] values = new int[10];

        values[4] = 9;
        values[7] = 98;
        System.out.println(4);
        System.out.println(5);
        System.out.println(7);
    }

    public static void test() {
        int value = 10;
        //              0  1  2  3  4
        int[] values = {1, 2, 3, 5, 9};
        System.out.println(values[2]);

        values[3] = 18;
        System.out.println(values[3]);
    }
}
