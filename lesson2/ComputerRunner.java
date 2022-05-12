package lesson2;

public class ComputerRunner {

    public static void main(String[] args) {
        int value = 5;
        // новый тип дпнных и любое название
        Computer computer = new Computer();
        computer.load();
        System.out.println("Ram: " + computer.ram);
        System.out.println("SSD: " + computer.ssd);
        System.out.println(computer.printState());
    }
}
