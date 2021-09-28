package ex35;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Grafton
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class App {
    //main code
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//get user input
        String name = null;
        ArrayList<String> nameList = new ArrayList<String>();//ArrayList for storing names
        //start a do-while loop to take name
        do {
            System.out.println("Enter a name:");
            name= input.nextLine();//get the name
            //add the name to the array list only if it is non-blank or non-empty
            if(!name.isBlank() && !name.isEmpty())
                nameList.add(name);
        }while(!name.isBlank() && !name.isEmpty());

        //Generate a random index
        Random random = new Random();
        int randomIndex = random.nextInt(nameList.size());

        //pick the winner at the randomIndex of nameList
        System.out.println("The winner is... "+nameList.get(randomIndex));

    }
}


