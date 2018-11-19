package com.manos.mypass.model;

import com.manos.mypass.enums.Language;

/**
 * Created by manoskammas on 18/11/2018.
 */
public class SessionParameters {


    private String username;
    private String file;
    private boolean authorisedUser;
    private Language preferredLanguage;
    private String[] arguments;

    //-----------------------------

    public SessionParameters() {
    }


    //-----------------------------


    public String[] getArguments() {
        return arguments;
    }

    public void setArguments(String[] sourceArgs) {
        this.arguments = arguments;
    }

    public Language getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(Language preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public boolean isAuthorisedUser() {
        return authorisedUser;
    }

    public void setAuthorisedUser(boolean authorisedUser) {
        this.authorisedUser = authorisedUser;
    }
}
