package com.example.demo.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CalServiceTestWithMokito {

    @Mock
    private MockitoTest mockitoTest;

    @InjectMocks
    private CalService calService;

    @Test
    public void sayHiTest() {
        Assertions.assertEquals(3, calService.add(1, 2));

        Mockito.verify(mockitoTest).sayHi();
    }

}
