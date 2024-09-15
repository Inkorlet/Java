package HW2.task2;

public class Main {
    public static void main(String[] args) {
        PC pc = new PC(8, 16, 24);
        Laptop laptop = new Laptop(8, 4, 15.6, 20);
        UltraBook ultraBook = new UltraBook(6, 16, 32, 1, 2);
        WorkStation workStation = new WorkStation(32, 64, 0, 25, "Nvidia");

        System.out.println(pc);
        System.out.println(laptop);
        System.out.println(ultraBook);
        System.out.println(workStation);
    }
}
