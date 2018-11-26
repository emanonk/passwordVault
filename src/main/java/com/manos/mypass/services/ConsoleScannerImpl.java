package com.manos.mypass.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class ConsoleScannerImpl {

    private ConsolePrintImpl consolePrint;

    @Autowired
    public ConsoleScannerImpl(ConsolePrintImpl consolePrint) {
        this.consolePrint = consolePrint;
    }

    public String getInputString(String askForValueText){

        System.out.println(askForValueText);
        Scanner scanner = new Scanner(System.in);
        String object = scanner.nextLine();
        return object;

    }

}
