package com.practice;

import java.util.List;
import java.util.Scanner;

public class Admin {
    public static void main(String[] args) {
        List<RegistrationModel> registrations = Registration.getList();
        Scanner input = new Scanner(System.in);
        int i = 0;
        for (int j = 0; j < 3; j++) {
            System.out.println("Enter Admin Password to proceed");
            String pass = input.nextLine();
            if (pass.equals("admin@123")) {
                System.out.println("Choose the action to be carried out!!! - \n\n 1 - To Display all the data!,\n\n 2 - To Search particular Data using email id!,\n\n 3 - To Delete particular Data using email id!");
                int k = input.nextInt();
                if (k == 1) {
                    for (RegistrationModel sd : registrations) {
                        System.out.println("\t " + sd.getName() + "\t\t" + sd.getDob() + "\t\t" + sd.getEmail() + "\t\t" + sd.getClgName() + "\t\t" + sd.getYearOfPassing() + "\t\t" + sd.getEmployed() + "\t\t" + sd.getExp() + "\t\t" + sd.getCurrentLPA());
                    }
                    Admin.main(args);
                } else if (k == 2) {
                    System.out.println("Enter Email ID to be searched");
                    input.nextLine();
                    String emailsearch = input.nextLine();
                    for (RegistrationModel sd : registrations) {
                        if (sd.email.equals(emailsearch)) {
                            System.out.println("\t " + sd.getName() + "\t\t" + sd.getDob() + "\t\t" + sd.getEmail() + "\t\t" + sd.getClgName() + "\t\t" + sd.getYearOfPassing() + "\t\t" + sd.getEmployed() + "\t\t" + sd.getExp() + "\t\t" + sd.getCurrentLPA());
                        }
                    }

                    Admin.main(args);
                } else if (k == 3) {
                    System.out.println("Enter Email ID to be deleted");
                    input.nextLine();
                    String emaildelete = input.nextLine();
                    for (RegistrationModel sd : registrations) {
                        if (sd.email.equals(emaildelete)) {
                            registrations.remove(sd);
                        }
                    }
                    System.out.println("Data related to "+emaildelete+" has been deleted!!!!");
                    Admin.main(args);
                } else {
                    System.out.println("Enter correct number to choose actions!!!");
                }
                break;
            } else if (i == 2) {
                System.out.println("You have 0 attempts left!!!");
                System.out.println("You have entered incorrect password 3 times, Try again from the begining!!!");
                OnBoarding.main(args);
            } else {
                i++;
                System.out.println("Enter correct password." + (3 - i) + " attempts left.");
            }
        }
    }
}
