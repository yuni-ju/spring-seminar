package com.ec.spring.services;

import org.springframework.stereotype.Service;

@Service
public class StringService {
    public String append(String str1, String str2){
        return str1+str2;
    }
    public boolean equals(String str1, String str2){
        return str1.equals(str2);
    }
    public int length(String str){
        return str.length();
    }
    public char charAt(String str, int index){
        return str.charAt(index);
    }
}
