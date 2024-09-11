package com.xworkz.mobileshop.dao;

import com.xworkz.mobileshop.dto.AccessoriesDto;

public class MobileShopDao {

    AccessoriesDto dto;
    public void getAccessories(AccessoriesDto dto){
        System.out.println("The mobile ID is = " + dto.getMobileId());
        System.out.println("The mobile Name  is = " + dto.getMobileName());
        System.out.println("The mobile price  is = " + dto.getMobilePrice());
        System.out.println("The mobile Color is = " + dto.getMobileColor());
        System.out.println("The mobile Screen Size is = " + dto.getScreenSize());


    }

}
