package app.controller;

import app.dto.UserDto;
import app.entity.UserRegistrationEntity;
import app.service.UserRegistrationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Slf4j
@Controller
@RequestMapping("/")
public class UserRegistrationController {
    @Autowired
    private UserRegistrationService service;
    @GetMapping("dashboard")
    public String dashboard(){
        return "dashboard";
    }
    @GetMapping("forgetPassword")
    public  String forgetPassword(){
        return "forgetPassword";
    }
    @GetMapping("index")
    public String index(){
        return "index";
    }
    @GetMapping("registration")
    public String registration(){
        return "registration";
    }
    @GetMapping("response")
    public String response() {
        return "response";
    }
    @GetMapping("signIn")
    public String signIn(){
       return "signIn";
    }

    @GetMapping("updateProfile")
    public String updateProfile(){
        return "updateProfile";
    }
    @PostMapping("user")
    public  String save(@Valid UserDto userDto , BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes){

        log.info("Save Method Started");
        if(bindingResult.hasErrors()){
            log.info("UserDto has validation error");
            bindingResult.getFieldErrors().forEach(fieldError -> {
                if(fieldError instanceof FieldError) {
                    FieldError fieldError1=(FieldError) fieldError;
                    log.info("{} Error Message :: {}",fieldError1.getField(), fieldError1.getDefaultMessage());
                    model.addAttribute(fieldError1.getField()+"Error",fieldError1.getDefaultMessage());
                    if (fieldError.getField().equalsIgnoreCase("FirstName")) {
                        model.addAttribute("FirstNameError", fieldError.getDefaultMessage());
                    }
                    if (fieldError.getField().equalsIgnoreCase("LastName")) {
                        model.addAttribute("LastNameError", fieldError.getDefaultMessage());
                    }
                    if (fieldError.getField().equalsIgnoreCase("Email")) {
                        model.addAttribute("EmailError", fieldError.getDefaultMessage());
                    }
                    if (fieldError.getField().equalsIgnoreCase("Alter Email")) {
                        model.addAttribute("AlterEmailError", fieldError.getDefaultMessage());
                    }
                    if (fieldError.getField().equalsIgnoreCase("Password")) {
                        model.addAttribute("PasswordError", fieldError.getDefaultMessage());
                    }
                    if (fieldError.getField().equalsIgnoreCase("ConfirmPassword")) {
                        model.addAttribute("ConfirmPasswordError", fieldError.getDefaultMessage());
                    }
                    if (fieldError.getField().equalsIgnoreCase("Contact")) {
                        model.addAttribute("ContactError", fieldError.getDefaultMessage());
                    }
                    if (fieldError.getField().equalsIgnoreCase("AlternativeContact")) {
                        model.addAttribute("AlternativeContactError", fieldError.getDefaultMessage());
                    }
                    if (fieldError.getField().equalsIgnoreCase("Place")) {
                        model.addAttribute("PlaceError", fieldError.getDefaultMessage());
                    }

                    if (fieldError.getField().equalsIgnoreCase("District")) {
                        model.addAttribute("DistrictError", fieldError.getDefaultMessage());
                    }

                    if (fieldError.getField().equalsIgnoreCase("State")) {
                        model.addAttribute("StateError", fieldError.getDefaultMessage());
                    }
                }
            });
            return "registration";
        }

        if(service.validateAndSave(userDto)){
            model.addAttribute("name","Data is saved");
            log.info("Data saved successfully");
            return "response";
        }else {
              redirectAttributes.addAttribute("emailError","Email Already Exist");
        }
        return "response";

    }

    @GetMapping("signin")
    public String signIn( String email,String password , Model model){
        System.out.println("sign in started");
        log.info("Email is {}",email);
        log.info("Password is {}",password);
        UserRegistrationEntity entity=service.validateAndGetEntityByEmail(email);
        if(password.equals(entity.getPassword())){
            log.info("user sign in successfully completed ");
            model.addAttribute("entity",entity);
            return "dashboard";
        }else{
            model.addAttribute("EmailNotFound","Email or Password Doesn't Match");
            System.out.println("sign in ended");

            return "signIn";
        }
    }
    @PostMapping("resetPasswordForm")
    public String updatePassword(String email,String password,String confirmPassword,Model model){
      boolean isUpdated=service.validateAndUpdatePasswordByEmail(email,password,confirmPassword);
      if(isUpdated){
          model.addAttribute("message","Password Updated Successfully");
          return "forgetPassword";
      }
      else {
          model.addAttribute("message","password not updated");
          return "forgetPassword";
      }
    }
    @GetMapping("fetch/{email}")
    public  String getEntity(@PathVariable  String email , Model model){
       UserDto userDto = new UserDto();
       log.info("email is {}",email);
        UserRegistrationEntity entity = service.validateAndGetEntityByEmail(email);
        BeanUtils.copyProperties(entity,userDto);
        System.out.println(userDto);
        model.addAttribute("dto",userDto);
       return "updateProfile";

    }

    @PostMapping("fetch/update")
    public String updateEntity( UserDto userDto , Model model){
        System.out.println(userDto);
        log.info("Update Entity Method Started");
        service.updateProfile(userDto);
        model.addAttribute("name",userDto.getFirstName());
        log.info("Update Entity Method Ended");
        return "entityUpdated";
    }

}
