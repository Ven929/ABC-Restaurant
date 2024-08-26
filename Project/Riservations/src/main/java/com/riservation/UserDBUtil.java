package com.riservation;

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

    public static List<User> validate(String reservationType, String reservationDate) {
        ArrayList<User> users = new ArrayList<>();

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "select * from riservation where reservationType='" + reservationType + "' and reservationDate='" + reservationDate + "'";
            rs = stmt.executeQuery(sql);

            if (rs.next()) {
                int id = rs.getInt(1);
                String reservationTypes = rs.getString(2);
                String reservationDates = rs.getString(3);
                String contact = rs.getString(4);
                String reservationTime = rs.getString(5);
                String location = rs.getString(6);
                String tableType = rs.getString(7);
                String specialRequests = rs.getString(8);

                User user = new User(id, reservationType, reservationDate, contact, reservationTime, location, tableType, specialRequests);
                users.add(user);
            }

        } catch (Exception e) {
            e.printStackTrace();

        }

        return users;
    }

    public static boolean insertCustomer(String reservationType, String reservationDate, String contact, String reservationTime, String location, String tableType, String specialRequests) {
        boolean isSuccess = false;

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "INSERT INTO riservation VALUES (0, '" + reservationType + "', '" + reservationDate + "', '" + contact + "', '" + reservationTime + "', '" + location + "', '" + tableType + "', '" + specialRequests + "')";
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

    public static List<User> getCustomerDetails(int id) {
        ArrayList<User> users = new ArrayList<>();

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "select * from riservation where id=" + id;
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int userId = rs.getInt(1);
                String reservationType = rs.getString(2);
                String reservationDate = rs.getString(3);
                String contact = rs.getString(4);
                String reservationTime = rs.getString(5);
                String location = rs.getString(6);
                String tableType = rs.getString(7);
                String specialRequests = rs.getString(8);

                User user = new User(userId, reservationType, reservationDate, contact, reservationTime, location, tableType, specialRequests);
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
            String sql = "select * from riservation";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt(1);
                String reservationType = rs.getString(2);
                String reservationDate = rs.getString(3);
                String contact = rs.getString(4);
                String reservationTime = rs.getString(5);
                String location = rs.getString(6);
                String tableType = rs.getString(7);
                String specialRequests = rs.getString(8);

                User user = new User(id, reservationType, reservationDate, contact, reservationTime, location, tableType, specialRequests);
                users.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }
}
