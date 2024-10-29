package com.xworkz.book;

import com.xworkz.book.bookstore.BookStore;
import com.xworkz.book.bookstore.impl.BookStoreImpl;
import com.xworkz.book.charts.Charts;
import java.util.Scanner;

public class BookStoreRunner {
    public static void main(String[] args) {

        BookStore bookStore=new BookStoreImpl();
        Scanner scanner=new Scanner(System.in);

        for (int index=0;index<3;index++){
            Charts charts=new Charts();
            System.out.println("Enter the chat id:");
            int cId= scanner.nextInt();
            charts.setChartId(cId);

            System.out.println("Enter the chart name:");
            String name= scanner.next();
            charts.setChartName(name);

            System.out.println("Enter the chart type:");
            String type= scanner.next();
            charts.setChartType(type);

            System.out.println("Price of chart:");
            int price= scanner.nextInt();
            charts.setPrice(price);

            System.out.println("Enter number of pics");
            int pics= scanner.nextInt();
            charts.setNoOfPics(pics);

            boolean chartAdded = bookStore.addCharts(charts);
            System.out.println("is chart added "+chartAdded);
        }
            bookStore.getAllCharts();
        bookStore.updateChartPriceById(4,40.00);
        bookStore.getAllCharts();

        bookStore.updateNoOfPicturesByType("ES",20);
        bookStore.getAllCharts();


    }
}
