package com.nynoa.lms.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LoginDto {
    private String id;
    private String password;
    private int userType;
}
