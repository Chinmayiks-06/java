package com.xworkz.drivinglicence.dao;

import com.xworkz.drivinglicence.dto.DrivingLicenceDto;

public class DrivingLicenceDao {

    DrivingLicenceDto dto;

    public boolean createDrivingLicence( DrivingLicenceDto dto){
        System.out.println("create Driving Licence Started");
        boolean isDrivingLicenceCreated = false;
        boolean isNameCreated = false;
        boolean isGenderCreated = false;
        boolean isDobCreated = false;
        boolean isPhoneNocreated = false;
        boolean isAddressCreated = false;
        boolean isDateIssueCreated = false;


        if(dto!=null);
        if(dto.userName!=null){
            isNameCreated = true;
        }else System.out.println("please provide valid name");
        if(dto.dob!= null){
            isDobCreated = true;
        }else System.out.println("please provide valid dob");
        if(dto.address!=null){
            isAddressCreated = true;
        }else System.out.println("please provide valid address");
        if(dto.dateIssue!=null){
            isDateIssueCreated= true;
        }else System.out.println("please provide valid issue date");

        if(isNameCreated && isDobCreated && isGenderCreated && isAddressCreated && isPhoneNocreated && isDateIssueCreated){
            this.dto = dto;
            isDrivingLicenceCreated = true;
        }else
            System.out.println("Create driving licence ended");
        return isDrivingLicenceCreated;
    }
    public void getDetails(){
        System.out.println("The User Name Is = " +dto.userName);
        System.out.println("The Date Of Birth Is = " + dto.dob);
        System.out.println("The Address Is = " + dto.address);
        System.out.println("The date Of Issue Is = " + dto.dateIssue);
    }
}
