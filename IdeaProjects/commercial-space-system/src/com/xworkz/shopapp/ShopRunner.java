package com.xworkz.shopapp;

import com.xworkz.shopapp.beautyparlour.BeautyParlour;
import com.xworkz.shopapp.medicalshop.MedicalShop;
import com.xworkz.shopapp.shop.Shop;

public class ShopRunner {
    public static void main(String[] args) {

        Shop shop=new BeautyParlour();
        shop.doBusiness();

        Shop shop1=new MedicalShop();
        shop1.doBusiness();
    }
}
