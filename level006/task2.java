package level006;

public class task2 {

    public static void main(String[] args) {
        int value = 9999;
        int result = sum(value);
        System.out.println(result);

        int result1 = sumFor(value);
        System.out.println(result1);
    }

    public static int sum(int value) {
        int result = 0;
        int curentValue = value;
        while (curentValue != 0) {
            result += curentValue % 10;
            curentValue /= 10;
        }

        return result;
    }
    public static int sumFor(int value) {
        int result = 0;
        for (int curentValue = value; curentValue != 0; curentValue /= 10) {
            result += curentValue % 10;
        }

        return result;
    }

}
