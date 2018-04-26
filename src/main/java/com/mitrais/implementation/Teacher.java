/**
 * @(#) Teacher.java, v. 1.0 2018/04/23 10:20:50
 * Classname                        Teacher.java
 *
 * Copyright (c) 2018, PT. Mitrais, Sanur, Bali, Indonesia.
 * All rights reserved.
 *
 * Revision History
 *  23-Apr-2018 Ayu Aldila Salma    [1.0]-Initial coding
 */
package com.mitrais.implementation;

/*
 * Teacher class inherit the Person class
 *
 */
public class Teacher extends Person {
    private int numCourses;
    private String courses;

    public Teacher(String name, String address) {
        super.setAddress(address);
        super.setName(name);
    }

    public void setCourses(String course) {
        this.courses = course;
    }

    public String toString() {
        return super.toString() + "\nThis teacher is teaching "
                + this.courses;
    }
}
