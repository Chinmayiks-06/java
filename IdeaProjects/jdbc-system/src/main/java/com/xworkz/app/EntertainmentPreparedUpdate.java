package com.xworkz.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EntertainmentPreparedUpdate {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("loaded and registered the jdbc driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/entertainment", "root", "xworkzodc@123")) {
            String query="UPDATE ENTERTAINMENT set name =?,director =? Where id=?";
            //create statement or platform
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setString(1,"bagyalakshmi");
            preparedStatement.setString(2,"bhagya");
            preparedStatement.setInt(3,3);
            preparedStatement.execute();


            System.out.println("updated data into database using prepared statement");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
