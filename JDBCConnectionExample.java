package com.example;
import java.sql.*;

public class JDBCConnectionExample {
    // DB credentials
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/students";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        try {
            // Step 1: Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Create connection
            Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASS);
            System.out.println("Connected to a database");

            // Step 3: Create statement
            Statement s = conn.createStatement();
            
            int insertResult = s.executeUpdate("INSERT INTO stu_info (name, branch, batch) VALUES ('Ravi', 'IT', 2026)");
            System.out.println("Inserted " + insertResult + " row(s)");
            s.executeUpdate("INSERT INTO stu_info(name,branch,batch) VALUES ('Ashutosh','CS',2025)"); 
            

            // Step 4  Create a ResultSet object for the select staements
            ResultSet rs = s.executeQuery("SELECT * FROM stu_info");
            s.executeUpdate("DELETE FROM stu_info WHERE name='Ravi'");
            rs.close();
            s.close();
            conn.close();
            System.out.println("✅ Done");
            
            }catch (Exception e) {
                e.printStackTrace();
            }

        
    }
}
