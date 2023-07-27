package com.byteapimanagement.bytedancejavaapi.common;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoderUtil {
    private static BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public static String encode(String password) {
        return encoder.encode(password);
    }
    public static Boolean match(String password,String hashPassword) {
        return encoder.matches(password,hashPassword);
    }
}
