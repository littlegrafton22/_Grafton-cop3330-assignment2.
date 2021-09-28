/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Grafton
 */
package ex31;
import java.util.*;
import java.lang.*;

public class App {
    //method begins
    public static void main (String[] args) {
        // your code goes here
        int restingHR,age;
        Scanner sc=new Scanner(System.in);
        restingHR = sc.nextInt(); //read the data
        age = sc.nextInt(); //read the data

        System.out.println("Resting Pulse: " + restingHR + " Age: " + age);

        int intensity = 55;
        System.out.println("Intensity | Rate ");
        System.out.println("------------------------");

        while(intensity<96){
            int Target = (((220 - age) - restingHR) * intensity) + restingHR;
            System.out.println(intensity+"% | "+Target +"bpm");
            intensity+=5;
        }
    }
}


