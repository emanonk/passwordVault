package com.manos.mypass.controllers;

import com.manos.mypass.enums.Language;
import com.manos.mypass.model.SessionParameters;
import com.manos.mypass.services.ConsoleScannerImpl;
import com.manos.mypass.services.PropertiesServiceImpl;
import com.manos.mypass.view.ConsoleOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by manoskammas on 15/11/2018.
 */
@Controller
public class CommandLineInterfaceController implements ApplicationController{

    @Autowired
    ConsoleOutput consoleOutput;

    @Autowired
    PropertiesServiceImpl properties;

    @Autowired
    ConsoleScannerImpl consoleScanner;

    @Override
    public void runApplication(SessionParameters sessionParameters) {

        //welcome message

        consoleOutput.print(properties.getWelcomeMessage(sessionParameters.getPreferredLanguage()));

        //ask for prefferd language TODO LATER in the options menu



        //ask of username and store it in sessionParams
        consoleScanner.getInputString();

        //System.out.print(properties.getWelcomeMessage(sessionParameters.getPreferredLanguage()));



        //ask for key and store it in sessionParams

        //diplay menu


    }
}
