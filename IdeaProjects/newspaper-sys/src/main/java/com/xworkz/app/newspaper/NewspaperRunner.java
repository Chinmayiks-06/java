package com.xworkz.app.newspaper;

import com.xworkz.app.newspaper.dao.NewspaperDao;
import com.xworkz.app.newspaper.dao.impl.NewspaperDaoImpl;
import com.xworkz.app.newspaper.dto.NewspaperDto;
import com.xworkz.app.newspaper.exception.NewsPaperNotFoundException;
import com.xworkz.app.newspaper.service.NewsPaperServiceImpl;
import com.xworkz.app.newspaper.service.NewspaperService;

public class NewspaperRunner {
    public static void main(String[] args) {
       /* System.out.println("main started");

        // Load and register the JDBC driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Loaded and registered the JDBC driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Failed to load JDBC driver", e);
        }

        // Establish the connection
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/newspaper", "root", "xworkzodc@123");
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO newspaper VALUES (?, ?, ?, ?, ?, ?, ?, ?)")) {

            System.out.println("Connection to database is established");

            // Set the parameters for the query
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "Vijaya Karnataka");
            preparedStatement.setInt(3, 16);
            preparedStatement.setString(4, "Kannada");
            preparedStatement.setDouble(5, 22.0);
            preparedStatement.setString(6, "Prakash");
            preparedStatement.setDate(7, java.sql.Date.valueOf("2024-10-18"));
            preparedStatement.setInt(8, 40);

            // Execute the query
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Inserted " + rowsAffected + " row(s) into the newspaper table");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("main ended");*/

        NewspaperService service = new NewsPaperServiceImpl();

        NewspaperDao newsPaperDao = new NewspaperDaoImpl();
        newsPaperDao.getAllNewsPaper();

        NewspaperDto newspaperByDate = null;
        try {
            newspaperByDate = service.getNewsPaperByDate("2024-10-18");
        } catch (NewsPaperNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Newspaper found by date: " + (newspaperByDate != null ? newspaperByDate : "Not found"));
    }
}
