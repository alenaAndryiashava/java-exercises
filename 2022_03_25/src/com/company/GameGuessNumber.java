package com.company;

import java.util.Scanner;

public  class GameGuessNumber {
    static Scanner input = new Scanner(System.in);
    static int secretNumber = 9;

    int readNumberOfAttempts() {
        System.out.print("Enter number of attempts: \n");
        return input.nextInt();
    }

    int readNumber() {
        System.out.print("Enter your number\n");
        return input.nextInt();
    }

    void guessNumber(int attepmts) {
        for (int i = 0; i < attepmts; i++) {
            if (readNumber() == secretNumber) {
                System.out.println("Your number is correct! You won the game!");
                return;
            }
            System.out.println("Your number is NOT correct. Try again.");
        }
        System.out.println("You have exceeded the maximum attempt. Try Again");
    }
}








