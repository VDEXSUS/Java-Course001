package level006;

public class task5 {

    public static void main(String[] args) {
       printLetters();

    }

    public static void  printLetters() {
        for (char letter = 'b'; !isVowle(letter); letter++) {
            System.out.println(letter);
        }
    }

    public static boolean isVowle(char value) {
        return value == 'a' || value == 'e' || value == 'y' || value == 'u' || value == 'i' || value == 'o';
    }
}
