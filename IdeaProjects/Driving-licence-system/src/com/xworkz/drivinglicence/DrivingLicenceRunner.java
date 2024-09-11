package com.xworkz.drivinglicence;

import com.xworkz.drivinglicence.dao.DrivingLicenceDao;
import com.xworkz.drivinglicence.dto.DrivingLicenceDto;

public class DrivingLicenceRunner {

    public static void main(String[] args) {

        DrivingLicenceDto drivingLicenceDto= new DrivingLicenceDto();
        drivingLicenceDto.userName = "chinmayi";
        drivingLicenceDto.dob = "09-08-2002";
        drivingLicenceDto.address = "rajajinagar";
        drivingLicenceDto.dateIssue = "29-05-2024";


        DrivingLicenceDao drivingLicenceDao = new DrivingLicenceDao();
        drivingLicenceDao.createDrivingLicence(drivingLicenceDto);

        drivingLicenceDao.getDetails();
    }
}
