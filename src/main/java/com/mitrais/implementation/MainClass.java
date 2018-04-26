package com.mitrais.implementation;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        /*
         * Implementation of PBI 2
         * Understand the concept of OOP
         */
        Person p = new Student("Dila", "Bali");
        ((Student) p).setCourses("Math");
        ((Student) p).setGrades(7);
        System.out.println(p.toString());

        Person t = new Teacher("B", "B");
        ((Teacher) t).setCourses("Math");
        System.out.println(t.toString());

        /*
         * Implementation PBI 3
         * Java Data Types
         */
        System.out.println("From 1 to 10, show the odd number below");
        for(int i = 1; i <= 10; i++) {
            if (i % 2 == 1)
                System.out.print(i + " ");
        }



        List<String> courseList = new ArrayList<String>();
        courseList.add("Math");
        courseList.add("Biology");
        courseList.add("Chemistry");
        courseList.add("Physics");

        System.out.println("\nCourse List content :");
        Iterator iterator = courseList.iterator();
        while ( iterator.hasNext() ) {
            System.out.println(iterator.next());
        }

        Scanner sc = new Scanner(System.in);
        String course;
        System.out.println("Type the name of the course that you want to find in the course list below :");
        course = sc.next();
        System.out.println("Find " + course + " course on the course list content");
        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).equalsIgnoreCase(course)) {
                System.out.println("Yes it is found in the index " + i);
                break;
            } else if (i == ( courseList.size() - 1 )) {
                System.out.println("Course " + course + " not found");
            }
        }

        try {
            System.out.println("Type a number below : ");
            int number = sc.nextInt();
            System.out.println("You type : " + number);
        } catch (Exception e ) {
            System.out.println(e.getMessage());
        }
    }
}
