package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Registration {
    static List<RegistrationModel> registrations = new ArrayList<>();
    public static List<RegistrationModel> getList() {
        return registrations;
    }

    public static void main(String[] args) {

        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many entries to be done!");
        int no = input.nextInt();
        for (int i = 0; i < no; i++) {
            if (count < 100) {
                System.out.println("ZOHO Career Registration Form \n");
                input.nextLine();
                System.out.println("Enter your Name : ");
                String name = input.nextLine();
                System.out.println("Enter your Date of Birth : ");
                String dob = input.nextLine();
                System.out.println("Enter your Email ID : ");
                String email = input.nextLine();
                System.out.println("Enter your College Name : ");
                String clgName = input.nextLine();
                System.out.println("Enter your Year of Passing : ");
                int yearOfPassing = input.nextInt();
                System.out.println("Are you Employed : (y/n)");
                String check = input.next();
                Boolean employed = false;
                int exp = 0;
                Double currentLPA = 0.0;
                if (Objects.equals(check, "y") || Objects.equals(check, "Y")) {
                    employed = true;
                    System.out.println("Enter your Experience in Years : ");
                    exp = input.nextInt();
                    System.out.println("Enter your Current LPA : ");
                    currentLPA = input.nextDouble();
                }
                registrations.add(new RegistrationModel(name, dob, email, clgName, yearOfPassing, employed, exp, currentLPA));
                count++;
            }else{
                System.out.println("Reached maximum number of Entries!!!");
            }
        }
        OnBoarding.main(args);
    }
}
