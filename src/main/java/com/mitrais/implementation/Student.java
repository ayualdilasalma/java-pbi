/**
 * @(#) Student.java, v. 1.0 2018/04/23 10:20:50
 * Classname                        Student.java
 *
 * Copyright (c) 2018, PT. Mitrais, Sanur, Bali, Indonesia.
 * All rights reserved.
 *
 * Revision History
 *  23-Apr-2018 Ayu Aldila Salma    [1.0]-Initial coding
 */
package com.mitrais.implementation;


/**
 * Class Student to inherit person class.
 *
 */
public class Student extends Person {
    private int numCourses;
    private String courses;
    private int grades;

    /**
     * Constructor of Student class to create object with type Student.
     * @param name              Name of the student to create
     * @param address           Address of the student to create
     */
    public Student(String name, String address) {
        super.setAddress(address);
        super.setName(name);
    }

    /**
     * Set the grade of the current student
     * @param grade             Number of the student's grade
     */
    public void setGrades(int grade) {
        this.grades = grade;
    }

    /**
     * Set the courses for current student
     * @param courses           Course of the student
     */
    public void setCourses(String courses) {
        this.courses = courses;
    }

    /**
     * Show the name, address, grade, and the course of the student
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + "\nThis student is in " + this.grades
                + " grades and take " + this.courses + " course";
    }
}
