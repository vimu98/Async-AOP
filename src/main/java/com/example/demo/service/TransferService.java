package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class TransferService {


    public String transferMoney(String from, String to, double amount) {

            if (amount <= 0) {
                throw new  IllegalArgumentException("Amount must be positive");
            }

            return "Transferred $ " + amount + " from "+ from + " to " + to;
    }
}
