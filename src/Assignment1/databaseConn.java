/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1;

/**
 *
 * @author senju
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class databaseConn {

    public static Connection getConnection() {
        Connection conn = null;
        try {
            // Load MySQL JDBC Driver (optional for modern JDBC versions)
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root", "1111");
            System.out.println("Database Connected Successfully!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void createUsersTable() {
        String query = "CREATE TABLE IF NOT EXISTS Users ("
                + "Username VARCHAR(20) NOT NULL UNIQUE, "
                + "Password VARCHAR(20) NOT NULL"
                + ")";

        try (Connection conn = databaseConn.getConnection(); Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(query);
            System.out.println("Users table created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
