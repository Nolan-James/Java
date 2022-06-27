package me.nolanjames;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int winningNumber = (int) (Math.random() * 100);
        System.out.println("Enter your lottery pick (2 digits): ");
        int userNumbers = scanner.nextInt();

        int winningDigitOne = winningNumber / 10;
        int winningDigitTwo = winningNumber % 10;

        int userNumberOne = userNumbers / 10;
        int userNumberTwo = userNumbers % 10;

        if (userNumbers == winningNumber) {
            System.out.println("The lottery number is " + winningNumber);
            System.out.println("Exact match! You win £10,000");
        } else if ((userNumberOne == winningDigitOne || userNumberOne == winningDigitTwo) && (userNumberTwo == winningDigitOne || userNumberTwo == winningDigitTwo)) {
            System.out.println("The lottery number is " + winningNumber);
            System.out.println("You matched all digits!  You win £3,000");
        } else if (userNumberOne == winningDigitOne || userNumberOne == winningDigitTwo || userNumberTwo == winningDigitOne || userNumberTwo == winningDigitTwo) {
            System.out.println("The lottery number is " + winningNumber);
            System.out.println("You matched one digit!  You win 1,000");
        } else {
            System.out.println("The lottery number is " + winningNumber);
            System.out.println("Sorry! No match this time");
        }


    }
}
