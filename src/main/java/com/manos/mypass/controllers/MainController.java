package com.manos.mypass.controllers;

import com.manos.mypass.ApplicationArgumentsService;
import com.manos.mypass.enums.Language;
import com.manos.mypass.model.SessionParameters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;



/**
 * Created by manoskammas on 14/11/2018.
 */

@Controller
public class MainController {

    @Autowired
    ApplicationArgumentsService applicationArgumentsService;

    @Autowired
    CommandController commandController;

    @Autowired
    CommandLineInterfaceController commandLineInterfaceController;




    public void applicationArgumentsFilter() {

        String[] sourceArgs = applicationArgumentsService.getApplicationArguments();

        SessionParameters sessionParameters = new SessionParameters();
        sessionParameters.setPreferredLanguage(Language.UK);
        sessionParameters.setArguments(sourceArgs);


        if(sourceArgs.length == 0){
            commandLineInterfaceController.runApplication(sessionParameters);
        }else{
            commandController.runApplication(sessionParameters);
        }

    }

}
