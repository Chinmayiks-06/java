package com.xworkz.mobileshop;

import com.xworkz.mobileshop.dao.MobileShopDao;
import com.xworkz.mobileshop.dto.AccessoriesDto;

public class MobileShopRunner {

    public static void main(String[] args) {
        System.out.println("Main Started");

        AccessoriesDto dto = new AccessoriesDto();
        dto.setMobileId(123);
        dto.setMobileName("IPhone11");
        dto.setMobilePrice(48000.00);
        dto.setMobileColor("Neon Green");
        dto.setScreenSize("6.1inch");

        MobileShopDao dao = new MobileShopDao();
        dao.getAccessories(dto);
        System.out.println("Main Ended");

    }
}
