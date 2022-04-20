package com.practice;

import java.util.Scanner;

public class OnBoarding {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Indicate your role!");
        System.out.println("Choose 1 - Admin, 2 - Student/Candidate!");
        int i = input.nextInt();
        if (i==1){
            Admin.main(args);
        }else if(i==2){
            Registration.main(args);
        }else{
            System.out.println("Enter the valid Input!!!");
            main(args);
        }

    }
}
