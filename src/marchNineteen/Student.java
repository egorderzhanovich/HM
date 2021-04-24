package HM.marchNineteen;

import java.util.List;

public class Student {
    private String name;
    private String surname;
    private String dateOfBirthday;
    private int course;

    public Student(String name, String surname, String dateOfBirthday, int course) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirthday = dateOfBirthday;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Студент:" +
                "\nИмя: " + name  +
                "\nФамилия: " + surname +
                "\nДата рождения: " + dateOfBirthday +
                "\nКурс " + course;
    }

    public static void printStudentsInfo(List<Student> students, int course){
        for (Student s : students) {
            if(s.getCourse() == course){
                System.out.println(s.toString());
            }
        }

    }
}
