package com.titan.watchshop.dao;

import com.titan.watchshop.dto.WatchShopDto;

public class WatchShopDao {
    WatchShopDto dto;

    public boolean createAccount(WatchShopDto dto){
        boolean isAccountCreated=false;
        boolean iscompanyNameValid=false;
        boolean isuserIdValid=false;
        boolean isemailValid=false;
        boolean isgenderValid=false;
        if (dto !=null){
            if(dto.companyName!=null)
                iscompanyNameValid=true;
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
        if (iscompanyNameValid==true && isuserIdValid==true && isemailValid==true && isgenderValid==true){
            this.dto  = dto;
            isAccountCreated=true;
        }
        return  isAccountCreated;
    }

    public void getDetail(){
        System.out.println("company name is:"+dto.companyName);
        System.out.println("user id is:"+dto.userId);
        System.out.println("user email is:"+dto.email);
        System.out.println("user gender:"+dto.gender);
    }
}

