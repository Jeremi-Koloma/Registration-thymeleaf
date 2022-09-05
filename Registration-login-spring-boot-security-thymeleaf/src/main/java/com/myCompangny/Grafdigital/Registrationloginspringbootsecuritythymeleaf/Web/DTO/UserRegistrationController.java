package com.myCompangny.Grafdigital.Registrationloginspringbootsecuritythymeleaf.Web.DTO;

import com.myCompangny.Grafdigital.Registrationloginspringbootsecuritythymeleaf.Services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
@AllArgsConstructor // pour injection de Userservice;
public class UserRegistrationController {
    // Injectons UserService;
    private final UserService userService;

    @ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto(){
        return new UserRegistrationDto();
    }


    @GetMapping
    public String showRegistrationForm(){
        return "registration"; // registration.html;
    }

    // Controller qui va créer les User;
    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto userRegistrationDto){
        userService.save(userRegistrationDto);
        return "redirect:/registration?success";
    }


}
