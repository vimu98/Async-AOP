package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class GradeCal {

    public char grade(int mark) {

        if (mark < 1){
            throw new IllegalArgumentException("mark must be greater than 0");

        }else if (mark < 60){
            return 'F';

        }else if (mark < 70){
            return 'D';

        }else if (mark < 80){
            return 'C';

        }else if (mark < 90){
            return 'B';

        }else{
            return 'A';

        }

    }

}
