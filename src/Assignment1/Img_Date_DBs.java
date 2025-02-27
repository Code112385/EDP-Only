/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author senju
 */
public class Img_Date_DBs {

    public static Connection getConnection() {
        Connection DbsConn = null;
        try {
            // Load MySQL JDBC Driver (optional for modern JDBC versions)
            Class.forName("com.mysql.cj.jdbc.Driver");
            DbsConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/img_date", "root", "1111");
            System.out.println("Database Connected Successfully!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return DbsConn;
    }

    public static void createInfoTable() {
        String query = "CREATE TABLE IF NOT EXISTS Info ("
        + "Id INT UNIQUE, "
        + "ImgPath VARCHAR(255) NOT NULL, "
        + "Date VARCHAR(20) NOT NULL"
        + ")";


        try (Connection conn = Img_Date_DBs.getConnection(); Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(query);
            System.out.println("Info table created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
