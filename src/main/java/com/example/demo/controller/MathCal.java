package com.example.demo.controller;

import com.example.demo.service.CalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathCal {

    @Autowired
    CalService calService;

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b){
        return calService.add(a, b);
    }

}
