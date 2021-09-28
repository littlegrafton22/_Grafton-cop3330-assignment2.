/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Grafton
 */
package ex29;
import java.util.*;


public class App {
    //method begins
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        boolean flag=false;
        while(true)
        {
            try
            {
                System.out.print("What is the rate of return? "); //ask interest rate
                int r=Integer.parseInt(sc.next()); //read r
                System.out.println("It will take "+(72/r)+" years to double your initial investment.");
                flag=true; //if exception not raised,set flag to true
            }
            catch(NumberFormatException e) //catch invalid number exception
            {
                System.out.println("Sorry. That's not a valid input");
            }
            catch(ArithmeticException e) //catch division by error exception
            {
                System.out.println("Sorry. That's not a valid input");
            }
            if(flag)
            {
                break;
            }

        }
    }
}

