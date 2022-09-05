package com.myCompangny.Grafdigital.Registrationloginspringbootsecuritythymeleaf.Services;

import com.myCompangny.Grafdigital.Registrationloginspringbootsecuritythymeleaf.Modeles.Role;
import com.myCompangny.Grafdigital.Registrationloginspringbootsecuritythymeleaf.Modeles.User;
import com.myCompangny.Grafdigital.Registrationloginspringbootsecuritythymeleaf.Repository.UserRepository;
import com.myCompangny.Grafdigital.Registrationloginspringbootsecuritythymeleaf.Web.DTO.UserRegistrationDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Arrays;

// Cette classe va implémenté notre interface UserService;
@Service // identifier la classe comme notre service métier;
@AllArgsConstructor // pour injection de notre repository User;
@Getter
@Setter
public class UserServiceImpl implements UserService{
    // Injectons le userRepository;
    private final UserRepository userRepository;

    @Override
    public User save(UserRegistrationDto userRegistrationDto) {
        User user = new User();
        return userRepository.save(user);
    }
}
