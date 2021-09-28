/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Grafton
 */

package ex25;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class App {


        public static void passwordValidator(String input)
        {
            // Checking lower alphabet in string
            int n = input.length();
            boolean hasLower = false, hasUpper = false,
                    hasDigit = false, specialChar = false;
            Set<Character> set = new HashSet<Character>(
                    Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                            '*', '(', ')', '-', '+'));
            for (char i : input.toCharArray())
            {
                if (Character.isLowerCase(i))
                    hasLower = true;
                if (Character.isUpperCase(i))
                    hasUpper = true;
                if (Character.isDigit(i))
                    hasDigit = true;
                if (set.contains(i))
                    specialChar = true;
            }

            // passwords strength criteria
            if (hasDigit && hasLower || hasUpper && specialChar
                    && (n >= 8))
                System.out.println("Very Strong");
            else if ((hasLower || hasUpper || specialChar)
                    && (n >= 8))
                System.out.println("Strong");
            else if(hasLower || hasUpper && (n < 8))
                System.out.print("Weak");
            else
                System.out.print("Very Weak");

        }

        // Driver Code
        public static void main(String[] args)
        {
            String input;
            Scanner sc=new Scanner(System.in);//read user data
            System.out.print("Enter Password: ");
            input=sc.nextLine();
            passwordValidator(input);
        }


    }
