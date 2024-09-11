package com.prajavani.newspaper.dao;

import com.prajavani.newspaper.dto.NewsPaperDto;

public class NewsPaperDao {

    NewsPaperDto dto;
    public boolean createAtm(NewsPaperDto dto){
        System.out.println("createAtm started");
        boolean isAtmCreated=false;
        boolean isbankNameValid=false;
        boolean islocationValid=false;
        boolean isnumberOfNewsPaperValid=false;
        if(null!=dto){
            if(dto.newsPaperName!=null)
                isbankNameValid=true;
            else
                System.out.println(" invalid");
            if(dto.location!=null)
                islocationValid=true;
            else
                System.out.println("location invalid");
            if (dto.numberOfNewsPaper >0)
                isnumberOfNewsPaperValid=true;
            else
                System.out.println("invalid data");
        }
        else System.out.println("dto cannot be null");
        if (isbankNameValid==true && islocationValid==true && isnumberOfNewsPaperValid==true){
            this.dto=dto;
            isAtmCreated=true;
        }
        return isAtmCreated;
    }

    public void displayAtmInfo(){
        System.out.println("newspaper name is: "+dto.newsPaperName);
        System.out.println(" location is: "+dto.location);
        System.out.println("number of news paper is is: "+dto.numberOfNewsPaper);
    }
}
