package com.xworkz.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Entertainment {

    public static void main(String[] args) {
        System.out.println("main started");


        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("loaded and registered the jdbc driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
         Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/entertainment","root","xworkzodc@123");
            System.out.println("connection to database is established");
            Statement statement=connection.createStatement();
            //insert a movie
            String query="insert into entertainment values(1,'kgf','prashanth neel','mehabooba')";
            statement.execute(query);
            String query1="insert into entertainment values(2,'googly','Saumya','eno eno agide')";
            statement.execute(query1);
           /* String query2="insert into entertainment values(3,'abc','jdnsmx','djnm')";
            statement.execute(query2);*/
            String query3="insert into entertainment values(4,'rrr','rajmouli','natu natu')";
            statement.execute(query3);
            String query4="insert into entertainment values(5,'devara','kiran','devara')";
            statement.execute(query4);
            String query5="insert into entertainment values(6,'ssd','rakshith shetty','sss')";
            statement.execute(query5);
            String query6="insert into entertainment values(7,'charlie',' neel','charlie')";
            statement.execute(query6);
            String query7="insert into entertainment values(8,'kgf2','dev ','king')";
            statement.execute(query7);
            String query8="insert into entertainment values(9,'arasu','chandan','appuuuu')";
            statement.execute(query8);
            String query9="insert into entertainment values(10,'appu','chethan','puneeth')";
            statement.execute(query9);
            String query10="insert into entertainment values(11,'akash','rohith','neene neene')";
            statement.execute(query10);
            /*String query11="insert into entertainment values(12,'rajahuli','rohan','yashhhhhh')";
            statement.execute(query11);
            String query12="insert into entertainment values(13,'rajahamsa','shreya','ninuuuu')";
            statement.execute(query12);*/

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main started");
    }
}
