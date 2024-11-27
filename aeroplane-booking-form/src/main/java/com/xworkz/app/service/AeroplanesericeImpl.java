package com.xworkz.app.service;

import com.xworkz.app.dao.AeroplaneDao;
import com.xworkz.app.dao.AeroplaneDaoImpl;
import com.xworkz.app.dto.AeroplaneDto;

public class AeroplanesericeImpl implements AeroplaneService{
    AeroplaneDao aeroplaneDao=new AeroplaneDaoImpl();
    @Override
    public boolean validateAndbookingDetails(AeroplaneDto aeroplaneDto) {
        boolean isUserValidated=false;
        boolean isNameValid=false;
        if(aeroplaneDto!=null){
            if(aeroplaneDto.getUserName()!=null && !aeroplaneDto.getUserName().isEmpty()){
                isNameValid=true;
            }
            if(isNameValid==true)
                isUserValidated=aeroplaneDao.addBookDetails(aeroplaneDto);
        }


        return isUserValidated;
    }

    }
