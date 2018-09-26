//Kent 9/25/18
package com.company;

import java.util.Scanner;

public class AiGuess {

    public static void main(String[] args) {

        System.out.println("I will try to guess your number between 1-100! My first guess will be 50!");
        System.out.println("Say 'higher' if guess is higher, 'lower' if your guess is lower, and 'correct' if it's correct");
        int upper = 100;
        int lower = 1;
        int random;
        int guessNum;
        Scanner input = new Scanner(System.in);
        String answer = "";
        while(!answer.equals("correct"))
        {
            random = (upper + lower) / 2;
            answer = input.nextLine();
            if(answer.equals("higher"))
            {
                lower = random + 1;
                guessNum = (upper + lower) / 2;
                System.out.println("My guess is: " + guessNum);
            }
            else if(answer.equals("lower"))
            {
                upper = random - 1;
                guessNum = (upper + lower) / 2;
                System.out.println("My guess is: " + guessNum);
            }
        }
        System.out.println("I got it correct!");
        input.close();
    }
}
