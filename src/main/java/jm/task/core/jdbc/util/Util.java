package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String DB_URL = "jdbc:mysql://localhost:3306/firstbd?useUnicode=true&useSSL=true&useJDBCCompliantTimezoneShift=true" +
            "&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "root";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
//            if (!connection.isClosed()) {
//                System.out.println("Соединение с БД Установлено!");
//            }
//            if (connection.isClosed()) {
//                System.out.println("Соединение с БД Закрыто!");
//            }
        } catch (SQLException e) {
            System.out.println("Connection error");
        }
        return connection;
    }
}
