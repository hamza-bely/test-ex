package com.testex1.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String getUserGreeting(String name) {
        return name;
    }

    public int somme(int num1,int num2) {
        return num1 + num2;
    }
}
