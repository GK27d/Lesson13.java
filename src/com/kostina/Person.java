package com.kostina;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

public class Person {
    private String fullName;
    //private int age;
    String dateOfBirth;

    public Person(String fullName, String dateOfBirth /*int age*/) {
        this.fullName = fullName;
        //this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /*public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }*/

    public String getDateOfBirth() {
        return  dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{"
                + "fullName='" + fullName + '\''
                //+ ", age=" + age
                + '}';
    }
}