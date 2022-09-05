package com.myCompangny.Grafdigital.Registrationloginspringbootsecuritythymeleaf.Modeles;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ROLES")
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
