package com.titan.watchshop;

import com.titan.watchshop.dao.WatchShopDao;
import com.titan.watchshop.dto.WatchShopDto;

public class WatchShopRunner {

    public  static  void main(String reg[]){
        System.out.println("main started");

        WatchShopDao watchShopDao=new WatchShopDao();
        WatchShopDto watchShopDto=new WatchShopDto();
        watchShopDto.companyName="Titan";
        watchShopDto.userId=12;
        watchShopDto.email="abc@gmail.com";
        watchShopDto.gender="Female";

        boolean ref=watchShopDao.createAccount(watchShopDto);
        System.out.println("account created"+ref);
        watchShopDao.getDetail();
        System.out.println("main ended");

    }
}
