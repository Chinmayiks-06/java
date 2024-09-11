package com.axisbank.atmmachine;

import com.axisbank.atmmachine.dao.AtmMachineDao;
import com.axisbank.atmmachine.dto.AtmMachineDto;

public class AtmMachineRunner {
    public  static  void main(String abc[]){
        System.out.println("main started");
        AtmMachineDao atmMachineDao=new AtmMachineDao();

        AtmMachineDto atmMachineDto=new AtmMachineDto();
        atmMachineDto.bankName="Axis";
        atmMachineDto.location="Hassan";
        atmMachineDto.withDrawalLimit=20000;

        boolean ref=atmMachineDao.createAtm(atmMachineDto);
        System.out.println("atm created"+ref);
        atmMachineDao.displayAtmInfo();
        System.out.println("main ended");
    }
}
