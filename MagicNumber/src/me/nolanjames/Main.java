package me.nolanjames;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magicNumber = (int) (Math.random() * 100);
        int guess = -1;

        System.out.println("Guess a magic number between 0 and 100");


        while (guess != magicNumber) {
            System.out.println("Enter your guess:");
            guess = scanner.nextInt();

            if (guess == magicNumber) {
                System.out.println("Yes! The number is: " + magicNumber);
                break;
            }

            if (guess > magicNumber) {
                System.out.println("Your guess is too high");
            }

            if (guess < magicNumber) {
                System.out.println("Your guess is too low");
            }
        }

    }
}
