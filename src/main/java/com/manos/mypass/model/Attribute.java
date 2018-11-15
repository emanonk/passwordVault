/*
 * Copyright Camelot Global. All rights reserved
 */
package com.manos.mypass.model;

/**
 *
 * @author mmkamm
 */
public class Attribute {

    private String name;
    private String value;

    public Attribute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}