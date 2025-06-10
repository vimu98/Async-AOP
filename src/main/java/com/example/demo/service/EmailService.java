package com.example.demo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class EmailService {


    public void sendEmail(String mail) {

        System.out.println("sending email to " + mail);

        try {
            Thread.sleep(5000); // simulate delay
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Email sent to " + mail);



    }
}
