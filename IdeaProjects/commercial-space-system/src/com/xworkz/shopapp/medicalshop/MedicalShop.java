package com.xworkz.shopapp.medicalshop;

import com.xworkz.shopapp.shop.Shop;

public class MedicalShop implements Shop {

    @Override
      public void doBusiness(){
        System.out.println("All Medicines are available");
    }

}
