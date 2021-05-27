package may14.xmlparsers;

public class Employee {
    private String name, job, department;
    private int workExperience;
    private int id;

    public Employee() {

    }
    public Employee(String name, String job, String department) {
        this.name = name;
        this.job = job;
        this.department = department;
    }
    public Employee(String name, String job, String department, int workExperience) {
        this.name = name;
        this.job = job;
        this.department = department;
        this.workExperience = workExperience;
    }

    public Employee(String name, String job, String department, int workExperience, int id) {
        this.name = name;
        this.job = job;
        this.department = department;
        this.workExperience = workExperience;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getDepartment() {
        return department;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", department='" + department + '\'' +
                ", workExperience=" + workExperience +
                '}';
    }
}
