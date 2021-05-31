package may14.jackson;

import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<String> achievements;

    public Person() {
    }

    public Person(String name, int age, List<String> achievements) {
        this.name = name;
        this.age = age;
        this.achievements = achievements;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getAchievements() {
        return achievements;
    }

    public void setAchievements(List<String> achievements) {
        this.achievements = achievements;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", achievements=" + achievements +
                '}';
    }
}
