package com.byteapimanagement.bytedancejavaapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailSender {
    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(String to,String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject("您好亲爱的用户请查收验证码");
        message.setText(body);
        message.setFrom("745119711@qq.com");
        mailSender.send(message);
    }
}