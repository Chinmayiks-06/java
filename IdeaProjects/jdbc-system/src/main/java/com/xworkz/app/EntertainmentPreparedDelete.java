package com.xworkz.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EntertainmentPreparedDelete {
    public static void main(String[] args) {
        /*t
ry {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("loaded and registered the jdbc driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }*/

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/entertainment", "root", "xworkzodc@123");
            final String query = "DELETE FROM ENTERTAINMENT WHERE id=? and name=?";
            //delete
           /* PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1,11);
            preparedStatement.execute();*/
             PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, 13);
            preparedStatement.setString(2, "rajahamsa");
            preparedStatement.execute();



            System.out.println("deleted data from database");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
