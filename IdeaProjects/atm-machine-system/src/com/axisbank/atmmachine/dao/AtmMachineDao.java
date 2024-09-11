package com.axisbank.atmmachine.dao;

import com.axisbank.atmmachine.dto.AtmMachineDto;

public class AtmMachineDao {

  public AtmMachineDto dto;

  public boolean createAtm(AtmMachineDto dto){
      System.out.println("createAtm started");
      boolean isAtmCreated=false;
      boolean isbankNameValid=false;
      boolean islocationValid=false;
      boolean iswithDrawalLimit=false;
  if(null!=dto){
     if(dto.bankName!=null)
         isbankNameValid=true;
else
         System.out.println("bank name invalid");
  if(dto.location!=null)
      islocationValid=true;
  else
      System.out.println("location invalid");
  if (dto.withDrawalLimit >0)
      iswithDrawalLimit=true;
  else
      System.out.println("invalid data");
  }
  else System.out.println("dto cannot be null");
if (isbankNameValid==true && islocationValid==true && iswithDrawalLimit==true){
        this.dto=dto;
        isAtmCreated=true;
}
return isAtmCreated;
  }

  public void displayAtmInfo(){
      System.out.println("bank name is: "+dto.bankName);
      System.out.println("bank location is: "+dto.location);
      System.out.println("withdrawal limit is: "+dto.withDrawalLimit);
  }
}
