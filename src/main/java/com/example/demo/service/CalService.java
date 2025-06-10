package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalService {

    @Autowired
    public MockitoTest mockitoTest;

    public int add(int a, int b){
        mockitoTest.sayHi();
        return a + b;
    }

}
