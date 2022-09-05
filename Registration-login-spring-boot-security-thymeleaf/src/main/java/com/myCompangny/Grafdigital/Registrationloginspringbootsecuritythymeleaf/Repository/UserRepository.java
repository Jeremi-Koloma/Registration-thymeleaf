package com.myCompangny.Grafdigital.Registrationloginspringbootsecuritythymeleaf.Repository;

import com.myCompangny.Grafdigital.Registrationloginspringbootsecuritythymeleaf.Modeles.User;
import org.springframework.data.jpa.repository.JpaRepository;

// Cette classe étand de JpaRepository avec <ENTITY, ID>
public interface UserRepository extends JpaRepository<User, Long> {

}
