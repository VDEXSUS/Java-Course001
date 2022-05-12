package lesson2;
// тип компютер
public class Computer {
    // поля класса
    int ssd = 588;
    int ram = 1024;

    void load() {
        System.out.println("I'am ready");
    }

    int printState() {
        System.out.println("Ssd: " + ssd);
        System.out.println("Ram: " + ram);
        return 0;
    }
}
