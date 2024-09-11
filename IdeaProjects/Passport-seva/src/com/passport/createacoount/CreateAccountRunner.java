package com.passport.createacoount;

import com.passport.createacoount.dao.CreateAccountDao;
import com.passport.createacoount.dto.CreateAccountDto;

public class CreateAccountRunner {


    public static void main(String ref[]){
        System.out.println("main started");
        CreateAccountDto dto=new CreateAccountDto();
        dto.cpvLocation="Po";
        CreateAccountDao dao =new CreateAccountDao();

        boolean ref1=dao.createPassportDetails(dto);
        System.out.println("Passport created"+ref1);
        dao.getPassPortDetails();
        System.out.println("main started");
    }
}
