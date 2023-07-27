package com.byteapimanagement.bytedancejavaapi.DTO;

import lombok.Data;

@Data
public class RegisterDto {
    private String username;
    private String password;
    private String email;
    private String verificationCode;
}
