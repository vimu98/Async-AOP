package com.example.demo.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GradeCalTest {

    @Autowired
    private GradeCal gradeCal;

    @Test
    public void testGradeF(){
        Assertions.assertEquals('F', gradeCal.grade(40));
    }

    @Test
    public void testGradeD(){
        Assertions.assertEquals('D', gradeCal.grade(65));
    }

    @Test
    public void testGradeC(){
        Assertions.assertEquals('C', gradeCal.grade(75));
    }

    @Test
    public void testGradeB(){
        Assertions.assertEquals('B', gradeCal.grade(85));
    }

    @Test
    public void testGradeA(){
        Assertions.assertEquals('A', gradeCal.grade(95));
    }

    @Test
    public void testNegative(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            gradeCal.grade(-1);
        });
    }

}