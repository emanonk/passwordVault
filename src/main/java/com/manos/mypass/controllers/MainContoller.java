package com.manos.mypass.controllers;

import com.manos.mypass.ApplicationArgumentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * Created by manoskammas on 14/11/2018.
 */

@Service
public class MainContoller {

    @Autowired
    private ApplicationArgumentsService applicationArgumentsService;

    public void applicationArgumentsFilter() {

        String[] sourceArgs = applicationArgumentsService.getApplicationArguments();

        ApplicationController applicationController;

        applicationController = sourceArgs.length == 0 ? new CommandLineInterfaceController() : new CommandController();

        applicationController.runApplication();

    }

}
