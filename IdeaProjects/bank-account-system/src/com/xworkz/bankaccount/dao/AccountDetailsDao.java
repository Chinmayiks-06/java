package com.xworkz.bankaccount.dao;

import com.xworkz.bankaccount.dto.AccountDetailsDto;

public class AccountDetailsDao {

    AccountDetailsDto dto;
    public boolean createAccount(AccountDetailsDto dto){
        boolean isAccountCreated=false;
        boolean isuserNameValid=false;
        boolean isuserIdValid=false;
        boolean isemailValid=false;
        boolean isgenderValid=false;
        if (dto !=null){
            if(dto.userName!=null)
                isuserNameValid=true;
            else
                System.out.println("invalid name");
            if (dto.userId>0)
                isuserIdValid=true;
            else
                System.out.println("invalid user id");
            if (dto.email!=null)
                isemailValid=true;
            else
                System.out.println("invalid email");
            if(dto.gender!=null)
                isgenderValid=true;
            else
                System.out.println("invalid gender data");

        }else
            System.out.println("dto cannot be null");
        if (isuserNameValid==true && isuserIdValid==true && isemailValid==true && isgenderValid==true){
            this.dto  = dto;
            isAccountCreated=true;
        }
        return  isAccountCreated;
    }

    public void getDetail(){
        System.out.println("user name is:"+dto.userName);
        System.out.println("user id is:"+dto.userId);
        System.out.println("user email is:"+dto.email);
        System.out.println("user gender:"+dto.gender);
    }
}

