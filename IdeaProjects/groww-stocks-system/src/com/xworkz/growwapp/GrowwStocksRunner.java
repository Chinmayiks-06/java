package com.xworkz.growwapp;

import com.xworkz.growwapp.dao.GrowwStocksDao;
import com.xworkz.growwapp.dto.GrowwStocksDto;

public class GrowwStocksRunner {

    public  static void main(String stk[]){
        System.out.println("main started");
        GrowwStocksDao growwStocksDao=new GrowwStocksDao();

        GrowwStocksDto growwStocksDto=new GrowwStocksDto(12,23,"26-07-2024");

        boolean createStocks=growwStocksDao.createStocks(growwStocksDto);

        if(createStocks ==true)

        growwStocksDao.getStocksDetail();
        System.out.println("main ended");
    }
}
