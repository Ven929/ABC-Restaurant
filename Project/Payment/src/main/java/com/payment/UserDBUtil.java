package com.payment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDBUtil {

    private static boolean isSuccess;
    private static Connection con = null;
    private static Statement stmt = null;
    private static ResultSet rs = null;

    // Method to validate and retrieve user details
    public static List<User> validate(String id, String payerName) {
        ArrayList<User> users = new ArrayList<>();

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "select * from payment where id='" + id + "' and payerName='" + payerName + "'";
            rs = stmt.executeQuery(sql);

            if (rs.next()) {
                int userId = rs.getInt(1);
                String payerNameResult = rs.getString(2);
                String paymentType = rs.getString(3);
                String paymentMethod = rs.getString(4);
                String paymentAmount = rs.getString(5);

                User user = new User(userId, payerNameResult, paymentType, paymentMethod, paymentAmount);
                users.add(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return users;
    }

    // Method to insert a new customer
    public static boolean insertCustomer(String payerName, String paymentType, String paymentMethod, String paymentAmount) {
        boolean isSuccess = false;

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "insert into payment (payerName, paymentType, paymentMethod, paymentAmount) values ('" + payerName + "','" + paymentType + "','" + paymentMethod + "','" + paymentAmount + "')";
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

    // Method to retrieve customer details by ID
    public static List<User> getCustomerDetails(String id) {
        int convertedID = Integer.parseInt(id);
        ArrayList<User> users = new ArrayList<>();

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "select * from payment where id='" + convertedID + "'";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int userId = rs.getInt(1);
                String payerName = rs.getString(2);
                String paymentType = rs.getString(3);
                String paymentMethod = rs.getString(4);
                String paymentAmount = rs.getString(5);

                User user = new User(userId, payerName, paymentType, paymentMethod, paymentAmount);
                users.add(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }

    // Method to retrieve all users
    public static List<User> getAllUsers() {
        ArrayList<User> users = new ArrayList<>();

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "select * from payment";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int userId = rs.getInt(1);
                String payerName = rs.getString(2);
                String paymentType = rs.getString(3);
                String paymentMethod = rs.getString(4);
                String paymentAmount = rs.getString(5);

                User user = new User(userId, payerName, paymentType, paymentMethod, paymentAmount);
                users.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }
}
