package com.example.demo.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalServiceTest {

    @Autowired
    private CalService calService;

    @Test
    public void testAdd(){
        int result = calService.add(1, 2);
        Assertions.assertEquals(4, result);

    }

}