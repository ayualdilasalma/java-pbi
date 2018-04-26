/**
 * @(#) Person.java, v. 1.0 2018/04/23 10:20:50
 * Classname                        Person.java
 *
 * Copyright (c) 2018, PT. Mitrais, Sanur, Bali, Indonesia.
 * All rights reserved.
 *
 * Revision History
 *  23-Apr-2018 Ayu Aldila Salma    [1.0]-Initial coding
 */
package com.mitrais.implementation;

/**
 * project's specific import goes here
 */
import com.mitrais.interfaces.PersonInterface;

/*
 * Person class provides the implementation of PersonInterface class
 */
public class Person implements PersonInterface {
    /**
     * variable name to store the person's name
     */
    private String name;
    /**
     * variable address to store the person's address
     */
    private String address;

    /**
     * Set the person's name
     * @param name              Name of the person to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set the person's address
     * @param address           Address of the person to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get the person's address
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Get the person's name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Show the name and the address of the person
     * @return
     */
    @Override
    public String toString() {
        return "Person name is " + getName() + " and the address is " + getAddress();
    }
}
