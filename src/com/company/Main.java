//Kent Li - 9/25/18
package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("Pick your difficulty! 1 for 10, 2 for 100, 3 for 1000, or 4 for 10000!");
        Scanner input = new Scanner(System.in);
        int range = input.nextInt();
        if (range == 1)
            range = 10;
        if (range == 2)
            range = 100;
        if (range == 3)
            range = 1000;
        else if (range == 4)
            range = 10000;
        Random randomNum = new Random();
        int pickedNum = randomNum.nextInt(range) + 1;
        System.out.println("Your number is between 1 and " + range + ", start guessing!");
        int guessNum = range + 1;
        int tries = 0;
        while (guessNum != pickedNum)
        {
            try {
                guessNum = input.nextInt();
                if (guessNum < pickedNum) {
                    System.out.println("Your guess is less than the random number, try again!");
                    tries++;
                }
                else if (guessNum > pickedNum)
                {
                    System.out.println("Your guess is greater than the random number, try again!");
                    tries++;
                }
            }
            catch(InputMismatchException e)
            {
                System.out.println("Try inputting a number");
                input.next();
            }
        }
        System.out.println("Congrats! You guess the correct number in " + tries + " tries!");
        input.close();
    }
}
