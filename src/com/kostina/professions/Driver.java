package com.kostina.professions;

import com.kostina.Person;

public class Driver extends Person {
    private int experience;

    public Driver(String fullName, String dateOfBirth, /*int age*/ int experience) {
        super(fullName, dateOfBirth /*age*/);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "experience='" + experience + '\'' +
                "} " + super.toString();
    }
}