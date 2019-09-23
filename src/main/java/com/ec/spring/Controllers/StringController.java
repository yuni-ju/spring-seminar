package com.ec.spring.Controllers;

import com.ec.spring.services.CalculatorService;
import com.ec.spring.services.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/string")
public class StringController {
    @Autowired
    private StringService stringService;

    @RequestMapping("/append")
    public String append(@RequestParam("str1") String str1, @RequestParam("str2") String str2){
        return stringService.append(str1,str2);
    }
    @RequestMapping("/equals")
    public boolean equals(@RequestParam("str1") String str1, @RequestParam("str2") String str2){
        return stringService.equals(str1,str2);
    }
    @RequestMapping("/length")
    public int length(@RequestParam("str") String str){
        return stringService.length(str);
    }
    @RequestMapping("/charAt")
    public char charAt(@RequestParam("str") String str, @RequestParam("index") int index){
        return stringService.charAt(str,index);
    }
}
