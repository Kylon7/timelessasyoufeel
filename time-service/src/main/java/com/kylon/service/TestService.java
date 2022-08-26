package com.kylon.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public Object test(){
        System.out.println("Hello world !");
        return null;
    }

}
