package system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;

/*
*
*author: tevin
*/
public class DbConnection {

    private Connection cn;

    /**
     * Creates a DB connection
     */
    public DbConnection() {  }

    public void init() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/store", "root", "");
            System.out.println("connected");
        } catch (Exception e) {
            System.out.println("Failed to get connection");
            e.printStackTrace();
        }
    }

    public Connection getMyConnection() {
        return cn;
    }

    public void close(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (Exception e) {
            }
        }
    }

    public void close(java.sql.Statement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (Exception e) {
            }
        }
    }

    public void destroy() {
        if (cn != null) {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
    }

}
