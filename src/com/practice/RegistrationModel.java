package com.practice;

public class RegistrationModel {
    String name, dob, clgName,email;
    Double currentLPA;
    int yearOfPassing;
    int exp;
    boolean employed;
    RegistrationModel(String name1, String dob1, String email1, String clgName1, int yearOfPassing1, Boolean employed1, int exp1, double currentLPA1) {
        name = name1;
        dob = dob1;
        clgName = clgName1;
        email=email1;
        yearOfPassing = yearOfPassing1;
        employed = employed1;
        exp = exp1;
        currentLPA = currentLPA1;
    }
    RegistrationModel() {
        name = "";
        dob = "";
        clgName = "";
        yearOfPassing = 0;
        email = "";
        employed = false;
        exp = 0;
        currentLPA = 0.0;
    }
    String getName() {
        return name;
    }

    String getDob() {
        return dob;
    }

    String getClgName() {
        return clgName;
    }
    String getEmail() {
        return email;
    }

    int getYearOfPassing() {
        return yearOfPassing;
    }

    boolean getEmployed() {
        return employed;
    }

    int getExp() {
        return exp;
    }

    Double getCurrentLPA() {
        return currentLPA;
    }

}
