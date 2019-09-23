package com.ec.spring.services;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int add(int num1,int num2){
        return num1+num2;
    }
}
