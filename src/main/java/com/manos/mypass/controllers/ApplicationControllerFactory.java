package com.manos.mypass.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by manoskammas on 21/11/2018.
 */
@Service
public class ApplicationControllerFactory {

    @Autowired
    CommandController commandController;

    @Autowired
    CommandLineInterfaceController commandLineInterfaceController;




    public ApplicationController getController(String[] args) {


        if(args.length == 0){
            return commandLineInterfaceController;
        }else{
            return commandController;
        }

    }
}
