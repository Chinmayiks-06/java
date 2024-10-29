package com.xworkz.book.bookstore;

import com.xworkz.book.charts.Charts;

public interface BookStore {

    boolean addCharts(Charts charts);

    void  getAllCharts();

     boolean updateChartPriceById(int existingId,double newPrice);

     boolean updateNoOfPicturesByType(String existingType,int newNumOfPic);


}
