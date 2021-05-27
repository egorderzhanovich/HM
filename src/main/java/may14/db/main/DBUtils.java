package may14.db.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
    private static String dbUrl = "jdbc:h2:mem:test;INIT=RUNSCRIPT FROM 'classpath:init.sql'";
    private static String username = "sa";
    private static String password = "";

    public static Connection getConnection(){
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(dbUrl,username,password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }
}
