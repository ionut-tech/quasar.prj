package com.light.bit.lash.dto;

import com.light.bit.lash.model.Address;
import com.light.bit.lash.model.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDTO {
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
