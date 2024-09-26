package HW4.task3;

import java.util.List;

public class Person {
    int id;
    String name;
    String surname;
    String email;
    int age;
    Gender gender;
    List<Skill> skills;
    Car car;

    public Person(int id, String name, String surname, String email, int age, Gender gender, List<Skill> skills, Car car) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.skills = skills;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", skills=" + skills +
                ", car=" + car +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Skill> getSkills() {
        return skills;
    }
}
