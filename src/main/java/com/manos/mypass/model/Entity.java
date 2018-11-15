/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manos.mypass.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author mmkamm
 */
public class Entity {

    private long id;
    private String serviceName;
    private Map<String,String> attributes;

    public Entity() {
    }

    public Entity(String serviceName) {
        this.serviceName = serviceName;
        this.attributes = new HashMap();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "id=" + id +
                ", serviceName='" + serviceName + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}
