package com.myCompangny.Grafdigital.Registrationloginspringbootsecuritythymeleaf.Services;

import com.myCompangny.Grafdigital.Registrationloginspringbootsecuritythymeleaf.Modeles.User;
import com.myCompangny.Grafdigital.Registrationloginspringbootsecuritythymeleaf.Web.DTO.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto userRegistrationDto);
}
