package HW5.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota", 150, new Owner("John", 30, 3), 20000, 2015));
        cars.add(new Car("BMW", 200, new Owner("Mike", 28, 4), 30000, 2017));
        cars.add(new Car("Ford", 180, new Owner("Sarah", 35, 10), 25000, 2016));
        cars.add(new Car("Honda", 170, new Owner("Tom", 26, 2), 22000, 2018));
        cars.add(new Car("Audi", 190, new Owner("Alice", 40, 15), 32000, 2019));
        cars.add(new Car("Tesla", 220, new Owner("Bob", 27, 5), 50000, 2020));
        cars.add(new Car("Chevrolet", 160, new Owner("Eve", 45, 20), 21000, 2014));

        cars.stream()
                .limit(cars.size() / 2)
                .forEach(Car::repairEngine);

        cars.stream()
                .map(Car::getOwner)
                .filter(owner -> owner.getDrivingExperience() < 5 && owner.getAge() > 25)
                .forEach(owner -> {
                    owner.increaseDrivingExperience();
                    System.out.println("Водія " + owner.getName() + " відправлено на курси підвищення кваліфікації.");
                });

        double totalCost = cars.stream()
                .mapToDouble(Car::getPrice)
                .sum();

        System.out.println("Загальна сума для покупки всіх авто: " + totalCost + " USD");
    }
}

