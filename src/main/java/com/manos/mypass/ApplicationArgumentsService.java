package com.manos.mypass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Service;

/**
 * Created by manoskammas on 15/11/2018.
 */

@Service
public class ApplicationArgumentsService {


    @Autowired
    ApplicationArguments applicationArguments;


    public String[] getApplicationArguments() {
        return applicationArguments.getSourceArgs();
    }
}
