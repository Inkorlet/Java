package HW2.task2;

public class UltraBook extends Laptop{
    private int thickness;

    public UltraBook(){

    }

    public UltraBook(int CPUs, int RAM, double monitor, int weight, int thickness) {
        super(CPUs, RAM, monitor, weight);
        this.thickness = thickness;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "UltraBook{" +
                "thickness=" + thickness +
                ", weight=" + super.getWeight() +
                ", CPUs=" + super.getCPUs() +
                ", RAM=" + super.getRAM() +
                ", Monitor=" + super.getMonitor() +
                "} ";
    }
}
