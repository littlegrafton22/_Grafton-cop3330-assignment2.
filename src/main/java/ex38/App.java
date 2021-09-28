package ex38;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Grafton
 */
import java.util.*;
public class App {
    // Driver function
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String data = in.nextLine();

        // split the input string by space to String array
        String[] list = data.split(" ");

        // make a function call that will return the Integer array of even numbers
        Integer[] evenList = filterEvenNumbers(list);


        System.out.print("The even numbers are ");
        for(int i=0; i<evenList.length; i++){
            if(i < evenList.length-1){
                System.out.print(evenList[i] + " ");
            }
            else
            {
                System.out.print(evenList[i] + ".");
            }
        }
    }

    // this method takes array of string integers as input parameter
    // and then returns the Integer array of even numbers
    public static Integer[] filterEvenNumbers(String[] list) {

        // declare an empty array list of Integer
        ArrayList<Integer> newList = new ArrayList<>();

        // now, loop to iterate over input array
        for (String s : list) {

            // convert string number to integer number
            int num = Integer.parseInt(s);

            // check if number is divisible by 2 (means it is even)
            if (num % 2 == 0) {

                // add number to the list
                newList.add(num);
            }
        }

        // now, convert the array list to integer array
        Integer[] arr = new Integer[newList.size()];
        arr = newList.toArray(arr);


        return arr;
    }
}

