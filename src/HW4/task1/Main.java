package HW4.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("Olexandr", 25));
        users.add(new User("Marta", 30));
        users.add(new User("Ivan", 22));
        users.add(new User("Nadiia", 28));
        users.add(new User("Petro", 35));

        // вік зростання
        users.sort(Comparator.comparingInt(User::getAge));
        users.forEach(System.out::println);

        // вік спадання
        users.sort(Comparator.comparingInt(User::getAge).reversed());
        users.forEach(System.out::println);

        // кількість знаків в імені (зростання)
        users.sort(Comparator.comparingInt(user -> user.name.length()));
        users.forEach(System.out::println);

        // кількість знаків в імені (спадання)
        users.sort(Comparator.comparingInt((User user) -> user.name.length()).reversed());
        users.forEach(System.out::println);
    }
}

