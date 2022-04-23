package level004;

public class Task3 {

    public static void main(String[] args) {
        int Litas = 1127;
//       Litas 1 !11
//       Litai 2 - 9
//       Litų  0, 11-19
        if ((Litas % 10 == 1) && (Litas % 100 != 11)) {
            System.out.println(Litas + " Litas");
        } else if ((Litas % 10 >= 2) && (Litas % 10 <= 9)
                && !(Litas % 100 >= 12) && (Litas % 100 <= 19)) {
            System.out.println(Litas + " Litai");
        } else {
            System.out.println(Litas + " Litų");
        }
    }
}
