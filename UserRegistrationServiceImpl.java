package app.service;


import app.dto.UserDto;
import app.entity.UserRegistrationEntity;
import app.repository.UserRegistrationRepoImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Slf4j
@Service
public class UserRegistrationServiceImpl implements  UserRegistrationService{
    @Autowired
    private UserRegistrationRepoImpl userRegistrationRepo ;

   @Override
    public boolean validateAndSave( UserDto userDto) {
       System.out.println("validate and save started");
       UserRegistrationEntity userRegistrationEntity = new UserRegistrationEntity();
       boolean isAdded=false;
        if(userDto.getFirstName()!=null) {
            BeanUtils.copyProperties(userDto, userRegistrationEntity);
            userRegistrationEntity.setCreatedBy(userDto.getFirstName());
            userRegistrationEntity.setCreatedDate(LocalDate.now());
            isAdded=userRegistrationRepo.save(userRegistrationEntity);
            System.out.println(isAdded);
            return isAdded;

        }
       System.out.println("validate and save ended");
        return isAdded;
    }

    @Override
    public UserRegistrationEntity validateAndGetEntityByEmail(String email) {
        return userRegistrationRepo.getEntityByEmail(email);
    }

    @Override
    public boolean validateAndUpdatePasswordByEmail(String email,String password,String confirmPassword) {
       boolean isUpdated=false;
        return userRegistrationRepo.updatePasswordByEmail(email,password,confirmPassword);
    }

    @Override
    public boolean emailExit(String email) {
        return userRegistrationRepo.getEntityByEmail(email) !=null;
    }

    @Override
    public boolean updateProfile(UserDto userDto) {
        System.out.println("validate and update started");
        UserRegistrationEntity userRegistrationEntity = new UserRegistrationEntity();
        boolean isAdded=false;
        if(userDto.getFirstName()!=null) {
            BeanUtils.copyProperties(userDto, userRegistrationEntity);
            userRegistrationEntity.setUpdatedBy(userDto.getFirstName());
            userRegistrationEntity.setUpdatedDate(LocalDate.now());
            boolean added=userRegistrationRepo.updateProfile(userRegistrationEntity);
            System.out.println(added);
            return added;

        }
        System.out.println("validate and Update ended");
        return isAdded;
    }


}
