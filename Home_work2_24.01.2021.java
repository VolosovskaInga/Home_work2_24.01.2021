package com.company;


import javax.swing.*;
import java.util.Scanner;

public class Main {

    static void practicalTaskNo1() {
        short a = -1;
        short b = 25;
        {
            System.out.println("First number " + a);
            System.out.println("Second number " + b);
        }
        if (a < b) {
            System.out.println("Largest number " + b);
        }
        if (a < b) ;
        {
            System.out.println("Smalest number " + a);
        }
        if (a != b) {
            System.out.println("Variables are not equals");
        }
        {
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = reader.nextInt();

            if (num % 2 == 0)
                System.out.println(num + " is even");
            else
                System.out.println(num + " is odd");
        }
        {
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter number -1 or 25: ");
            int num = reader.nextInt();

            if (num < 0)
                System.out.println("Number is negative");
            else
                System.out.println("Number is positive");
        }
        if (a < 100) {
            System.out.println(a + " is less than 100");
        }
    }

    static void practicalTaskNo2() {
        int time = 50;
        {
            if (time < 12 && time >= 0) {
                System.out.println("Good morning Sunshine");
            }
            if (time >= 13 && time <= 19) {
                System.out.println("Good afternoon. Work hard!!!");
            }
            if (time >= 20 && time <= 24) {
                System.out.println("Good evening. Get some rest!");
            }
            if (time < 0 || time > 24) {
                System.out.println("There is no such time");
            }

        }
    }

    static void practicalTaskNo3() {
        int day = 1;
        int month = 5;
        int year = 2021;

        {

            if (day >= 1 && day <= 31) {
                System.out.println("");
            } else {
                System.out.println("Invalid number");
            }

        }
        if (month >= 1 && month <= 12) {
            System.out.println("");
        } else {
            System.out.println("Invalid number");
        }
        if (year >= 1932 && year <= 2090) {
            System.out.println("");
        } else {
            System.out.println("Invalid number");
        }
        {
            System.out.println("Your date is " + day + "/" + month + "/" + year + "/");
        }


    }

    static void practicalTaskNo5() {
    int workingHoursInDay =-1;
    {

        if (workingHoursInDay <= 0 || workingHoursInDay >= 24) {

            System.out.println("Invalid number"); // not possible to work more than 24  hours a day
        }

        if (workingHoursInDay >= 1 && workingHoursInDay <= 8) {

            int sum = workingHoursInDay * 10;
            System.out.println("Your salary is " + sum);
        }

        if (workingHoursInDay >= 9 && workingHoursInDay <= 24) {

            int sum = (workingHoursInDay - 8) * 15 + 80;
            System.out.println("Your salary is " + sum);
        }
    }


    }








        public static void main(String[] args) {

        //practicalTaskNo1();
        //practicalTaskNo2();
        //practicalTaskNo3();
        practicalTaskNo5();



    }
}