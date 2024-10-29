package com.xworkz.book.bookstore.impl;

import com.xworkz.book.bookstore.BookStore;
import com.xworkz.book.charts.Charts;
import com.xworkz.book.exception.ChartIdNotFoundException;
import javafx.scene.chart.ScatterChart;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class BookStoreImpl implements BookStore {
    Charts charts[] = new Charts[4];
    int index;

    @Override
    public boolean addCharts(Charts charts) {
        boolean isChartAdded = false;
        if (charts != null) {
            if (charts.getChartName() != null) {
                this.charts[index++] = charts;
                isChartAdded = true;
            } else System.out.println("invalid data");
        }
        return isChartAdded;
    }

    @Override
    public void getAllCharts() {
        for (Charts charts : charts) {
            System.out.println(charts);
        }
    }

    @Override
    public boolean updateChartPriceById(int existingId, double newPrice) {
        boolean isUpdated = false;
      try {
          for (int index = 0; index < charts.length; index++) {
              if (this.charts[index].getChartId() == existingId)
                  this.charts[index].setPrice(newPrice);
              isUpdated = true;
          }
          if (isUpdated == false) {
              ChartIdNotFoundException chartIdNotFoundException = new ChartIdNotFoundException("invalid data");
              throw chartIdNotFoundException;
          }
      }catch (ChartIdNotFoundException ce){
          ce.printStackTrace();
      }
        return isUpdated;
    }

    @Override
    public boolean updateNoOfPicturesByType(String existingType, int newNumOfPic)  {
        System.out.println("updateNoOfPicturesByType is strarted");
        boolean isNoOfPictureUpdated = false;
    for (int index = 0; index < this.charts.length; index++) {
        if (this.charts[index].getChartType().equals(existingType)) {
            this.charts[index].setNoOfPics(newNumOfPic);
            isNoOfPictureUpdated = true;
            break;
        }
    }

    /*if (isNoOfPictureUpdated=false){
        System.out.println("type not found");
    }*/
            System.out.println("updateNoOfPicturesByType is ended");
            return isNoOfPictureUpdated;

        }


    }


