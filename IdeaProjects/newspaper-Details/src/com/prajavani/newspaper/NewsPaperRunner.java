package com.prajavani.newspaper;

import com.prajavani.newspaper.dao.NewsPaperDao;
import com.prajavani.newspaper.dto.NewsPaperDto;

public class NewsPaperRunner {
        public  static  void main(String abc[]){
            System.out.println("main started");
            NewsPaperDao newsPaperDao=new NewsPaperDao();

            NewsPaperDto newsPaperDto=new NewsPaperDto();
            newsPaperDto.newsPaperName="Prajavani";
            newsPaperDto.location="Hassan";
            newsPaperDto.numberOfNewsPaper=300;

            boolean ref=newsPaperDao.createAtm(newsPaperDto);
            System.out.println("atm created"+ref);
            newsPaperDao.displayAtmInfo();
            System.out.println("main ended");
        }
    }

