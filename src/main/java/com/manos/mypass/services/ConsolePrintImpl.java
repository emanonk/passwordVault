package com.manos.mypass.services;

import org.springframework.stereotype.Service;

@Service
public class ConsolePrintImpl {

    public void print(String text){
        System.out.println(text);
    }
}
