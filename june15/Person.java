package com.company;

import java.util.Date;

/**
 * Created by VISHAL on 14-06-2018.
 */
public class Person {
    private int age;
    private Date dob;

    public Person() {
        System.out.println("Person Object Created - Default Constructor");
    }

    public Person(int age, Date dob) {
        this.age = age;
        this.dob = dob;
    }
}
