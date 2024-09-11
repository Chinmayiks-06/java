package com.passport.createacoount.dao;

import com.passport.createacoount.dto.CreateAccountDto;

public class CreateAccountDao {

   public  CreateAccountDto dto;

    public  boolean createPassportDetails(CreateAccountDto dto) {
        System.out.println("Creating passport user details");
        boolean isDtoCreated = false;
        if (null != dto) {
            this.dto = dto;
            isDtoCreated = true;
        } else {
            System.out.println("Please provide valid data");
        }
        System.out.println("create passport ended");
        return isDtoCreated;
    }
    public void getPassPortDetails(){
        System.out.println("get started");
        System.out.println("CPR Location: "+dto.cpvLocation);
        System.out.println("CPR DCDR Location: "+dto.dcdrLocation);
        System.out.println("Given Name: "+dto.givenName);
        System.out.println("Sur Name: "+dto.surName);
        System.out.println("Date of Birth: "+dto.dob);
        System.out.println("Email: "+dto.email);
        System.out.println("Same Mail : "+dto.isEmailLoginSame);
        System.out.println("Enter Password: "+dto.password);
        System.out.println("Confirm Password: "+dto.confirmPassword);
        System.out.println("Choose your fav Color: "+dto.hintQues);
        System.out.println("Hint ans: "+dto.hintAns);
        System.out.println("Captch is: "+dto.captcha);
        System.out.println("get ended");
    }

}
