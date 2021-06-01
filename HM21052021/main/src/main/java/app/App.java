package app;

import dbutils.CRUDUtils;
import dbutils.DBUtils;
import dbutils.Employee;

import java.util.List;


public class App {
    public static void main(String[] args) {


        CRUDUtils.saveEmployee(new Employee("Egor","Derzhanovich","surgeon"));
        List<Employee> employeeList = CRUDUtils.getAllEmployees();
        for (Employee e : employeeList){
            System.out.println(e);
        }
    }
}
