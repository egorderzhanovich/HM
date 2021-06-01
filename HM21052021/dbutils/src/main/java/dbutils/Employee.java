package dbutils;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private String job_position;

    public Employee(int id, String name, String surname, String job_position) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.job_position = job_position;
    }

    public Employee(String name, String surname, String job_position) {
        this.name = name;
        this.surname = surname;
        this.job_position = job_position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getJob_position() {
        return job_position;
    }

    public void setJob_position(String job_position) {
        this.job_position = job_position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", job_position='" + job_position + '\'' +
                '}';
    }
}
