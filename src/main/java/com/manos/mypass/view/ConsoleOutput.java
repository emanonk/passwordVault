package com.manos.mypass.view;

import org.springframework.stereotype.Service;

/**
 * Created by manoskammas on 18/11/2018.
 */

@Service
public class ConsoleOutput {

    public ConsoleOutput() {
    }

    public void print(String message){
        System.out.print(message);
    }
}
