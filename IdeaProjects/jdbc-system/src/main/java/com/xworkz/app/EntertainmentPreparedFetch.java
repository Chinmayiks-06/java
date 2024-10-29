package com.xworkz.app;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class EntertainmentPreparedFetch {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("loaded and registered the jdbc driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url = "jdbc:mysql://localhost:3306/entertainment";
        String userName = "root";
        String password = "xworkzodc@123";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(url, userName, password);
            String query = "select * from entertainment where name=? and id=?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "googly");
            preparedStatement.setInt(2, 2);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println(resultSet);
            if (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString(3));
                System.out.println(resultSet.getString(4));

                System.out.println("data fetched successfully");

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("closing the costly resources");

            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            try {
                preparedStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            
        }
    }
}

















