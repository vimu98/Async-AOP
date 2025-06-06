package com.example.demo.controller;

import com.example.demo.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class sendEmail {

    @Autowired
    private EmailService emailService;

    @GetMapping
    public String sendEmail() {

        emailService.sendEmail("user01@example.com");
        emailService.sendEmail("user02@example.com");
        emailService.sendEmail("user03@example.com");
        emailService.sendEmail("user01@example.com");
        emailService.sendEmail("user02@example.com");
        emailService.sendEmail("user03@example.com");
        return "Email sent";

    }

}
