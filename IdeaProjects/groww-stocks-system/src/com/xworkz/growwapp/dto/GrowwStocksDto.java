package com.xworkz.growwapp.dto;

public class GrowwStocksDto{

    private int noOfStocks;
    private int stockRefId;
    private String startDate;

    public int getNoOfStocks(){
        return noOfStocks;
    }

    public int getStockRefId() {
        return stockRefId;
    }

    public String getStartDate() {
        return startDate;
    }

    public GrowwStocksDto(int noOfStocks,int stockRefId,String startDate) {
      this.noOfStocks=noOfStocks;
      this.stockRefId=stockRefId;
      this.startDate=startDate;
    }
}
