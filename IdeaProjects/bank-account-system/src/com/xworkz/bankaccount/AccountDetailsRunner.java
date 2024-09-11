package com.xworkz.bankaccount;

import com.xworkz.bankaccount.dao.AccountDetailsDao;
import com.xworkz.bankaccount.dto.AccountDetailsDto;

public class AccountDetailsRunner {

    public  static  void main(String reg[]){
        System.out.println("main started");

        AccountDetailsDao accountDetailsDao=new AccountDetailsDao();
        AccountDetailsDto spotifyDto=new AccountDetailsDto();
        spotifyDto.userName="Chins";
        spotifyDto.userId=12;
        spotifyDto.email="abc@gmail.com";
        spotifyDto.gender="Female";

        boolean ref=accountDetailsDao.createAccount(spotifyDto);
        System.out.println("account created"+ref);
        accountDetailsDao.getDetail();
        System.out.println("main ended");

    }
}

