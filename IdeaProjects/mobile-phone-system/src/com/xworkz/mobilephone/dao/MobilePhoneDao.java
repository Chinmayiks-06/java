package com.xworkz.mobilephone.dao;

import com.xworkz.mobilephone.dto.PhoneBookDto;

public class MobilePhoneDao {

    public PhoneBookDto dto;

    public MobilePhoneDao() {
        System.out.println("Constructor is created");
    }

    public boolean createMobilePhoneData(PhoneBookDto dto) {
        boolean isphoneDataCreated = false;
        boolean isrefIdValid = false;
        boolean iscontactNoValid = false;
        boolean iscontactNameValid = false;

        if (dto != null) {
            if (dto.getRefId() != 0) {
                isrefIdValid = true;
            } else {
                System.out.println("ref id can't be null");
            }

            if (dto.getContactNo() != 0) {
                iscontactNoValid = true;
            } else {
                System.out.println("contact number is invalid");
            }

            if (dto.getContactName() != null) {
                iscontactNameValid = true;
            } else {
                System.out.println("name can't be null");
            }
        } else {
            System.out.println("dto can't be null");
        }

        if (isrefIdValid && iscontactNoValid && iscontactNameValid) {
            this.dto = dto;
            isphoneDataCreated = true;
        }

        return isphoneDataCreated;
    }

    public void getDetails() {
        if (dto != null) {
            System.out.println("Reference ID is: " + dto.getRefId());
            System.out.println("Contact Number is: " + dto.getContactNo());
            System.out.println("Contact Name is: " + dto.getContactName());
        } else {
            System.out.println("No details available.");
        }
    }
}
