package may14.db.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUDUtils {
    private static final String GET_ALL_STUDENTS = "select * from students";
    private static final String SAVE_STUDENT = "insert into students(name, surname, course_name) values(?,?,?)";
    private static final String DELETE_STUDENT = "delete from students where id = ?";
    private static final String UPDATE_STUDENT = "update student set name = ?, surname = ?, course_name = ? where id = ?";
    static List<Student> students = new ArrayList<>();

    public static List<Student> getStudentData() {


        try (Connection connection = DBUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_STUDENTS)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String course_name = rs.getString("course_name");
                students.add(new Student(id, name, surname, course_name));
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return students;
    }

    public static void saveStudent(Student student) {

        try  {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SAVE_STUDENT);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getSurname());
            preparedStatement.setString(3, student.getCourse_name());
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public static void delete(int studentID){
        Connection connection = DBUtils.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_STUDENT);
            preparedStatement.setInt(1,studentID);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void update(Student student){
        Connection connection = DBUtils.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_STUDENT);
            preparedStatement.setString(1,student.getName());
            preparedStatement.setString(2, student.getSurname());
            preparedStatement.setString(3, student.getCourse_name());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
