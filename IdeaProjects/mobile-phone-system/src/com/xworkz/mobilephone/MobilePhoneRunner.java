package com.xworkz.mobilephone;

import com.xworkz.mobilephone.dao.MobilePhoneDao;
import com.xworkz.mobilephone.dto.PhoneBookDto;

public class MobilePhoneRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        MobilePhoneDao mobilePhoneDao = new MobilePhoneDao();
        PhoneBookDto phoneBookDto = new PhoneBookDto(246, 1234568890, "Chinmayi");

        boolean createMobilePhoneData = mobilePhoneDao.createMobilePhoneData(phoneBookDto);

        if (createMobilePhoneData) {
            mobilePhoneDao.getDetails();
        }

        System.out.println("main ended");
    }
}
