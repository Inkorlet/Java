package HW4.task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Skill> skills1 = Arrays.asList(new Skill("java", 10), new Skill("js", 10), new Skill("c++", 10));
        List<Skill> skills2 = Arrays.asList(new Skill("python", 5), new Skill("js", 3));
        List<Skill> skills3 = Arrays.asList(new Skill("ruby", 7));

        Person p1 = new Person(1, "Vasya", "Pupkin", "asd@asd.com", 31, Gender.MALE, skills1, new Car("Toyota", 2021, 250));
        Person p2 = new Person(2, "Oleg", "Ivanov", "oleg@asd.com", 28, Gender.MALE, skills2, new Car("Honda", 2019, 180));
        Person p3 = new Person(3, "Anna", "Petrova", "anna@asd.com", 25, Gender.FEMALE, skills3, new Car("BMW", 2020, 300));
        Person p4 = new Person(4, "Maria", "Ivanova", "maria@asd.com", 30, Gender.FEMALE, skills1, new Car("Mercedes", 2022, 350));
        Person p5 = new Person(5, "Igor", "Smirnov", "igor@asd.com", 27, Gender.MALE, skills2, new Car("Ford", 2018, 200));
        Person p6 = new Person(6, "Elena", "Popova", "elena@asd.com", 33, Gender.FEMALE, skills1, new Car("Audi", 2021, 220));
        Person p7 = new Person(7, "Dmytro", "Nikolaev", "dmytro@asd.com", 35, Gender.MALE, skills2, new Car("Tesla", 2023, 400));
        Person p8 = new Person(8, "Olga", "Petrova", "olga@asd.com", 26, Gender.FEMALE, skills3, new Car("Lexus", 2020, 240));
        Person p9 = new Person(9, "Pavel", "Vasilyev", "pavel@asd.com", 29, Gender.MALE, skills2, new Car("Kia", 2017, 160));
        Person p10 = new Person(10, "Irina", "Sergeeva", "irina@asd.com", 32, Gender.FEMALE, skills1, new Car("Chevrolet", 2020, 260));

        HashSet<Person> peopleSet = new HashSet<>(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10));

        peopleSet.removeIf(person -> person.gender == Gender.MALE);
        System.out.println("HashSet після видалення чоловіків:");
        peopleSet.forEach(System.out::println);

        TreeSet<Person> sortedSet = new TreeSet<>(
                Comparator.comparingInt((Person p) -> p.skills.size())
                        .thenComparingInt(p -> p.getId())
        );

        sortedSet.addAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10));

        System.out.println("\nTreeSet, відсортований за кількістю скілів, а потім за ID:");
        sortedSet.forEach(System.out::println);
    }
}
