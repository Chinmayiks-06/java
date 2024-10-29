package com.xworkz.app.newspaper.dao.impl;

import com.xworkz.app.newspaper.dao.NewspaperDao;
import com.xworkz.app.newspaper.dto.NewspaperDto;
import com.xworkz.app.newspaper.exception.EditorNotFoundException;
import com.xworkz.app.newspaper.exception.InvalidIdException;
import com.xworkz.app.newspaper.exception.LanguageNotSupportedException;
import com.xworkz.app.newspaper.exception.NewsPaperNotFoundException;

import java.sql.*;

public class NewspaperDaoImpl implements NewspaperDao {
    NewspaperDto[] newspaperDto;
    @Override
    public void addNewsPaper(NewspaperDto newsPaperDto) {
        Connection connection1 = null;
        Statement statement = null;
        ResultSet result =null;
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
            preparedStatement.setInt(1, newsPaperDto.getId());
            preparedStatement.setString(2, "Vijaya Karnataka");
            preparedStatement.setInt(3, 16);
            preparedStatement.setString(4, "Kannada");
            preparedStatement.setDouble(5, 22.0);
            preparedStatement.setString(6, "Prakash");
            preparedStatement.setString(7, "18-10-2024");
            preparedStatement.setInt(8, 40);

            // Execute the query
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Inserted " + rowsAffected + " row(s) into the newspaper table");

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
               connection1.close();
               statement.close();
               result.close();
            } catch (SQLException e) {
            e.printStackTrace();            }
        }
    }

    @Override
    public NewspaperDto[] getAllNewsPaper() {
        Connection connection = null;
        Statement statement = null;
        ResultSet result =null;
        try {
            // Step 2: Establish connection with the database
            connection=  DriverManager.getConnection("jdbc:mysql://localhost:3306/Newspaper", "root", "xworkzodc@123");

            // Step 3: Create a statement
            statement = connection.createStatement();

            String query = "select * from newspaper";
            result = statement.executeQuery(query);


  //          System.out.println("NewsPaper Are :");
            while (result.next()) {
                System.out.println("Newspaper id: "+result.getInt(1));
              System.out.println("NewsPaper_Name: " + result.getString(2));
                System.out.println("No_of_Pages: " + result.getString(3));
                System.out.println("language: " + result.getString(4));
                System.out.println("price: " + result.getString(5));
                System.out.println("editor: " + result.getString(6));
                System.out.println("Date: " + result.getString(7));
                System.out.println("No_of_Articles: " + result.getString(8));
                System.out.println();
            }


        } catch (SQLException e) {
            e.printStackTrace();

        }try {
            if (result != null) result.close();
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new NewspaperDto[0];
    }

    @Override
    public NewspaperDto getNewsPaperByDate(String date) throws NewsPaperNotFoundException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        NewspaperDto newsPaperDto1=null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Newspaper", "root", "xworkzodc@123");
            String query = "SELECT * FROM newspaper WHERE date=?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, date);

            result = preparedStatement.executeQuery();

/*
            String d,s=null;
*/
            while (result.next()) {
               NewspaperDto newsPaperDto = new NewspaperDto();
                newsPaperDto.setId(result.getInt("id"));
                newsPaperDto.setPaperName(result.getString(2));
                newsPaperDto.setNoOfPages(result.getInt(3));
                newsPaperDto.setLanguage(result.getString(4));
                newsPaperDto.setPrice(result.getDouble(5));
                newsPaperDto.setEditorName(result.getString(6));
                newsPaperDto.setDate(result.getString(7));
                newsPaperDto.setNoOfArticles(result.getInt(8));

                 newsPaperDto1 = newsPaperDto;

            }
        } catch (InvalidIdException |SQLException  e) {
            e.printStackTrace();
        }finally {
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (result != null) result.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return newsPaperDto1;
    }

    @Override
    public NewspaperDto getNewsPaperByLang(String lang) throws NewsPaperNotFoundException {
        return null;
    }

    @Override
    public NewspaperDto getNewsPaperById(int id) throws NewsPaperNotFoundException {
        return null;
    }

    @Override
    public int getPaperNoOfPagesByLanguage(String lang) throws LanguageNotSupportedException {
        return 0;
    }

    @Override
    public int getNoOfArticlesById(int id) throws NewsPaperNotFoundException {
        return 0;
    }

    @Override
    public String getDateById(int id) throws NewsPaperNotFoundException {
        return "";
    }

    @Override
    public void updateNoOfArticlesByDate(String date, int noOfArticles) throws NewsPaperNotFoundException {

    }

    @Override
    public boolean deleteNewsPaperById(int id) throws NewsPaperNotFoundException {
return false;
    }

    @Override
    public String getPaperNameByLang(String lang) throws LanguageNotSupportedException {
        return "";
    }

    @Override
    public String getPaperNameById(int id) throws NewsPaperNotFoundException {
        return "";
    }

    @Override
    public String getEditorNameByPaperName(String paperName) throws EditorNotFoundException {
        return "";
    }
}


