package ex36;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Grafton
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;


public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//for taking user input
        ArrayList<Integer> numbers = new ArrayList<>();//create an array list of integers
        String entry;
        //start a do-while loop
        do {
            System.out.println("Enter a number: ");
            entry = input.next();//get the entry

            if(!entry.equals("done")) {//if entry is not done
                try {//try to parse it into integer
                    int num = Integer.parseInt(entry);
                    numbers.add(num);
                }catch(NumberFormatException nfe) {
                    //do not add number into the list
                }
            }
        }while(!entry.equals("done"));//as long as user does not entry "done"


        System.out.println("Numbers: "+numbers.stream().map(String::valueOf).collect(Collectors.joining(",")));
        //print avg
        System.out.println("The average is "+average(numbers));
        //print min
        System.out.println("The minimum is "+min(numbers));
        //print max
        System.out.println("The maximum is "+max(numbers));
        //print standard deviation
        System.out.println("The standard deviation is "+String.format("%.2f", std(numbers)));


    }

    //calculate average
    public static double average(ArrayList<Integer> numbers) {
        int total = 0;
        for(int num: numbers) {
            total += num;
        }
        return (double)(total)/numbers.size();
    }


    //calculate maximum
    public static int max(ArrayList<Integer> numbers) {
        int max= numbers.get(0);

        for(int num: numbers) {
            if(num > max)
                max = num;
        }

        return max;
    }

    //calculate minimum
    public static int min(ArrayList<Integer> numbers) {
        int min= numbers.get(0);

        for(int num: numbers) {
            if(num < min)
                min = num;
        }

        return min;
    }

    //calculates standard deviation
    public static double std(ArrayList<Integer> numbers) {
        double mean = average(numbers);

        double sum = 0;
        for(int num: numbers) {
            sum = sum + Math.pow((num-mean), 2);
        }

        return Math.sqrt(sum/numbers.size());
    }

}


