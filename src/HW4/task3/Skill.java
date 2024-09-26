package HW4.task3;

public class Skill {
    String title;
    int experience;

    public Skill(String title, int experience) {
        this.title = title;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return title + " (exp: " + experience + ")";
    }
}
