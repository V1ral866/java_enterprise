package com.hillel.mvc.bank.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateDTO {

    private String name;

    private String lastName;

    private int age;

    private String email;

    private String gender;

    private AddressDTO address;
}
