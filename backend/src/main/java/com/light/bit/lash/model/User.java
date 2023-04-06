package com.light.bit.lash.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class User {
    @Id
    private Long id;
    private String firstName;
    private String surName;
    private String username;
    private String password;
    private String repeatPassword;
    private String email;
    private Date birthdate;
    private Gender gender;
    private String phone;
    private List<Address> addresses;
}
