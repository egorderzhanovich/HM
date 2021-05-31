package may14.db.main;

import java.util.List;

import static may14.db.main.CRUDUtils.*;

public class App {
    public static void main(String[] args) {




        saveStudent(new Student("Egor","Derzhanovich","asd"));
        saveStudent(new Student("Egor1","Derzhanovic1h","asd"));
        delete(1);
        List<Student> students = getStudentData();
        for (Student s : students){
            System.out.println(s);
        }
    }

}
