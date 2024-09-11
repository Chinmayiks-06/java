package com.xworkz.creategmail.dao;

import com.xworkz.creategmail.dto.CreateGmailDto;

public class CreateGmailDao {
    CreateGmailDto dto;

    public boolean createGmail( CreateGmailDto dto){
        System.out.println("Gmail Account Create started");
        boolean isGmailCreated = false;
        boolean isNameCreated = false;
        boolean isLastNameCreated = false;
        boolean isDobCreated = false;
        boolean isGenderCreated = false;
        boolean isPhoneNocreated = false;
        boolean isPasswordCreated = false;
        boolean isConfirmPasswordCreated = false;

        if(dto!=null);
        if(dto.name!=null){
            isNameCreated = true;
        }else System.out.println("please provide valid name");
        if(dto.lastName!=null){
            isLastNameCreated = true;
        }else System.out.println("please provide valid last name");
        if(dto.dob!=null){
            isDobCreated = true;
        }else System.out.println("please provide valid dob");
        if(dto.gender!=null){
            isGenderCreated = true;
        }else System.out.println("please provide valid gender");
        if(dto.phoneNo > 0){
            isPhoneNocreated = true;
        }else System.out.println("please provide valid phone no");
        if(dto.ctrPassword!=null){
            isPasswordCreated = true;
        }else System.out.println("please provide valid password");
        if(dto.confPassword!=null){
            isConfirmPasswordCreated = true;
        }else System.out.println("please provide confirm password");

        if(isNameCreated && isLastNameCreated && isDobCreated && isGenderCreated && isPhoneNocreated && isPasswordCreated && isConfirmPasswordCreated){
            this.dto = dto;
            isGmailCreated = true;
        }else
            System.out.println("Gmail Account Create Ended");
        return isGmailCreated;
    }
    public void getDetails (){
        System.out.println("full name is "+ dto.name);
        System.out.println("last name is  "+ dto.lastName);
        System.out.println("gender "+ dto.gender);
        System.out.println("dob "+ dto.dob);
        System.out.println("phone number  "+ dto.phoneNo);
        System.out.println("create password  "+ dto.ctrPassword);
        System.out.println("confirm password "+ dto.confPassword);

    }
}
