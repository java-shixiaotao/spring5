package com.mouds.aopannotation;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class User {

    public void add(){
       // int i = 10/0;
        System.out.println("add ........");
    }



}
