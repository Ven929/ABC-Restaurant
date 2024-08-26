package com.queries;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.queries.DBConnect;

public class UserDBUtil {

    private static boolean isSuccess;
    private static Connection con = null;
    private static Statement stmt = null;
    private static ResultSet rs = null;

    public static List<User> validate(String name, String nic) {
        ArrayList<User> users = new ArrayList<>();

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "select * from queries where nic='" + nic + "' and name='" + name + "'";
            rs = stmt.executeQuery(sql);

            if (rs.next()) {
                int id = rs.getInt(1);
                String queryCategory = rs.getString(2);
                String queryText = rs.getString(3);
                String submittedAt = rs.getString(4);
                String respondedAt = rs.getString(5);
                String responseText = rs.getString(6);

                User user = new User(id, queryCategory, queryText, submittedAt, respondedAt, responseText);
                users.add(user);
            }

        } catch (Exception e) {
            e.printStackTrace();

        }

        return users;
    }

    public static boolean insertCustomer(String queryCategory, String queryText, String submittedAt, String respondedAt, String responseText) {
        boolean isSuccess = false;

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "insert into queries values (0,'" + queryCategory + "','" + queryText + "','" + submittedAt + "','" + respondedAt + "','" + responseText + "')";
            int rs = stmt.executeUpdate(sql);

            if (rs > 0) {
                isSuccess = true;
            } else {
                isSuccess = false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isSuccess;
    }

    public static boolean updateCustomer(int id, String queryCategory, String queryText, String submittedAt, String respondedAt, String responseText) {
        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "update queries set queryCategory='" + queryCategory + "', queryText='" + queryText + "', submittedAt='" + submittedAt + "', respondedAt='" + respondedAt + "', responseText='" + responseText + "' where id=" + id;
            int rs = stmt.executeUpdate(sql);

            isSuccess = rs > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isSuccess;
    }

    public static List<User> getCustomerDetails(int id) {
        ArrayList<User> users = new ArrayList<>();

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "select * from queries where id=" + id;
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int userId = rs.getInt(1);
                String queryCategory = rs.getString(2);
                String queryText = rs.getString(3);
                String submittedAt = rs.getString(4);
                String respondedAt = rs.getString(5);
                String responseText = rs.getString(6);

                User user = new User(userId, queryCategory, queryText, submittedAt, respondedAt, responseText);
                users.add(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }

 
    public static List<User> getAllAdmins() {
        ArrayList<User> users = new ArrayList<>();

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "select * from queries";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt(1);
                String queryCategory = rs.getString(2);
                String queryText = rs.getString(3);
                String submittedAt = rs.getString(4);
                String respondedAt = rs.getString(5);
                String responseText = rs.getString(6);

                User user = new User(id, queryCategory, queryText, submittedAt, respondedAt, responseText);
                users.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }
}
