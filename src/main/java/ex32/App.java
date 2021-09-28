/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Grafton
 */
package ex32;
import java.util.Scanner;
public class App {
    //drive the main function
    public static void main(String[] args) {
        //prompt the user for output
        System.out.println("Let's play Guess the Number!");
        int secretNumber;
        secretNumber = (int) (Math.random() * 999 + 1);
        Scanner sc = new Scanner(System.in);
        int guess,total,key;

        while(true){

            total=0;
            //prompt the user for output
            System.out.print("Enter the difficulty level(1, 2, or  3): ");
            key=sc.nextInt();//read the data
            //check for difficulty level
            if(key==1) //get random number
                secretNumber = (int) (Math.random() * 10 + 1);
            else if(key==2) //get random number
                secretNumber = (int) (Math.random() * 100 + 1);
            else  //get random number
                secretNumber = (int) (Math.random() * 1000 + 1);
            //prompt the user for output
            System.out.print("I have my number. What's your guess?: ");
            do{
                guess = sc.nextInt();
                total++; //count the guess
                if (guess == secretNumber){//prompt the user for output
                    System.out.println("You got it in "+total+"  guesses!");
                }
                else if (guess < secretNumber)//prompt the user for output
                    System.out.println("Too low. Guess again: ");
                else if (guess > secretNumber)//prompt the user for output
                    System.out.println("Too high. Guess again: ");

            }while (guess != secretNumber);
            //prompt the user for output
            System.out.print("\nDo you wish to play again (Y/N)?  ");
            char s=sc.next().charAt(0);
            if(s=='N' || s=='n')
                break;
        }

    }
}

