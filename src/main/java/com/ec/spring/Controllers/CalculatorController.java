package com.ec.spring.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ec.spring.services.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @RequestMapping("/add")
    public int add(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return calculatorService.add(num1,num2);
    }
    @RequestMapping("/subtract")
    public int subtract(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1-num2;
    }
    @RequestMapping("/multiple")
    public int multiple(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1*num2;
    }
    @RequestMapping("/divide")
    public int divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1/num2;
    }
    @RequestMapping("/mod")
    public int mod(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1%num2;
    }
}
