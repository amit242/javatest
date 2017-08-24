package com.test.amit.deps;

import java.sql.*;
/**
 * Created by Amit on 7/28/17.
 */
public class MathDep {
    public int add(int a, int b) {
        return a+b+100;
    }

    public int sub(int a, int b, int c) {
        return a-b-100+c;
    }

    public int sqlInjectionExample(String userId) {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:testuser/testpass@localhost");
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Users WHERE UserId = " + userId);
            while(rs.next()) {
                System.out.print(rs.getInt(1) + "\t");
                System.out.println(rs.getString(2));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                stmt.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }
}
