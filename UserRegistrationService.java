package app.service;


import app.dto.UserDto;
import app.entity.UserRegistrationEntity;

public interface UserRegistrationService {
    boolean validateAndSave(UserDto userDto);
    UserRegistrationEntity validateAndGetEntityByEmail(String email);
    boolean validateAndUpdatePasswordByEmail(String email ,String password,String confirmPassword);

    boolean emailExit(String email);
    boolean updateProfile(UserDto userDto);


}
