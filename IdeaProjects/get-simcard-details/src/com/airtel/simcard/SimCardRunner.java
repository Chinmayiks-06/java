package com.airtel.simcard;

import com.airtel.simcard.dao.SimCardDao;
import com.airtel.simcard.dto.SimCardDto;

public class SimCardRunner {

    public  static  void main(String reg[]){
        System.out.println("main started");

        SimCardDao simCardDao=new SimCardDao();
        SimCardDto simCardDto=new SimCardDto();
        simCardDto.userName="Chins";
        simCardDto.userId=12;
        simCardDto.email="abc@gmail.com";
        simCardDto.gender="Female";

        boolean ref=simCardDao.createAccount(simCardDto);
        System.out.println("account created"+ref);
        simCardDao.getDetail();
        System.out.println("main ended");

    }
}
