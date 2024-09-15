package HW2.task4;

public class Main {
    public static void main(String[] args) {
        User user = new User(
                1,
                "vasya",
                "pupkin",
                "asd@asd.com",
                31,
                Gender.MALE,
                new Car("toyota", 2021, 250)
        );
        user.getSkills().add(new Skill("java", 10));
        user.getSkills().add(new Skill("js", 10));
        user.getSkills().add(new Skill("c++", 10));

        System.out.println(user);
    }
}
