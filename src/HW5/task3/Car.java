package HW5.task3;

public class Car {
    private String brand;
    private int enginePower;
    private Owner owner;
    private double price;
    private int year;

    public Car(String brand, int enginePower, Owner owner, double price, int year) {
        this.brand = brand;
        this.enginePower = enginePower;
        this.owner = owner;
        this.price = price;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public Owner getOwner() {
        return owner;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public void repairEngine() {
        this.enginePower = (int) (this.enginePower * 1.10);
        System.out.println("Потужність автомобіля " + this.brand + " була збільшена до " + this.enginePower);
    }
}

