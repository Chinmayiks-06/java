package com.xworkz.growwapp.dao;

import com.xworkz.growwapp.dto.GrowwStocksDto;

public class GrowwStocksDao {

     public  GrowwStocksDto dto;

    public GrowwStocksDao() {
        System.out.println("Constructor is created");
    }

    public  boolean createStocks(GrowwStocksDto dto){
        boolean isStocksCreated=false;
        boolean isNoOfStocksValid=false;
        boolean isStockIdValid=false;
        boolean isStartDateValid=false;
        if(dto!=null){
            if(dto.getNoOfStocks()!=0)
                isNoOfStocksValid=true;
            else
                System.out.println("noOfStocks cant be null");
            //this.dto=dto;
            if(dto.getStockRefId()!=0)
                isStockIdValid=true;
            else
                System.out.println("stock ref id is invalid");
            if(dto.getStartDate()!=null)
                isStartDateValid=true;
            else
                System.out.println("date cant be nul");
        }
        else
            System.out.println("dto cant be null");
        if(isNoOfStocksValid==true && isStockIdValid==true && isStartDateValid==true){
            this.dto=dto;
            isStocksCreated=true;
        }
        return  isStocksCreated;
    }

    public void getStocksDetail(){

        System.out.println("Stock name is:"+dto.getNoOfStocks());
        System.out.println("Stock id is:"+dto.getStockRefId());
        System.out.println("Stocks start date is:"+dto.getStartDate());
    }

}