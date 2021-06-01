package dbutils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUDUtils {
    private static final String GET_ALL_EMPLOYEES = "select * from employees";
    private static final String SAVE_EMPLOYEE = "insert into employees(name, surname, job_position) values(?,?,?)";
    private static final String DELETE_EMPLOYEE = "delete from employees where id = ?";
    private static final String UPDATE_EMPLOYEE = "update employees set name = ?, surname = ?, job_position = ? where id = ?";

    private static List<Employee> employees = new ArrayList<>();

    public static List<Employee> getAllEmployees() {
        try {
            Connection con = DBUtils.getConnection();

            PreparedStatement preparedStatement = con.prepareStatement(GET_ALL_EMPLOYEES);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String job_position = rs.getString("job_position");
                employees.add(new Employee(id, name, surname, job_position));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employees;
    }public static void saveEmployee(Employee employee) {

        try  {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SAVE_EMPLOYEE);
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getSurname());
            preparedStatement.setString(3, employee.getJob_position());
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public static void deleteEmployee(int employeeID){
        Connection connection = DBUtils.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_EMPLOYEE);
            preparedStatement.setInt(1,employeeID);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void updateEmployee(Employee employee){
        Connection connection = DBUtils.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_EMPLOYEE);
            preparedStatement.setString(1,employee.getName());
            preparedStatement.setString(2, employee.getSurname());
            preparedStatement.setString(3, employee.getJob_position());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
