package com.xworkz.creategmail;

import com.xworkz.creategmail.dao.CreateGmailDao;
import com.xworkz.creategmail.dto.CreateGmailDto;

public class CreateGmailRunner {
    public static void main(String[] args) {

        CreateGmailDto dto = new CreateGmailDto();
        dto.name = "Chinmayi";
        dto.lastName = "KS";
        dto.dob = "06-03-2003";
        dto.gender = "Female";
        dto.phoneNo =9902057251L ;
        dto.ctrPassword ="dhfb4778";
        dto.confPassword = "dhfb4778";

        CreateGmailDao ref = new CreateGmailDao();
        ref.createGmail(dto);

        ref.getDetails();
    }
}
