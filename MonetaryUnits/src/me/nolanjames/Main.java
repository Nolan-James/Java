package me.nolanjames;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an amount in pounds and pence");
        try {
            double input = scanner.nextDouble();
            int pennies = (int) (input * 100);
            int pounds = pennies / 100;
            int remainingPennies = pennies % 100;

            int fiftyPence = remainingPennies / 50;
            remainingPennies = remainingPennies % 50;

            int twentyPences = remainingPennies / 20;
            remainingPennies = remainingPennies % 20;

            int tenPences = remainingPennies / 10;
            remainingPennies = remainingPennies % 10;

            int fivePences = remainingPennies / 5;
            remainingPennies = remainingPennies % 5;

            int twoPences = remainingPennies / 2;
            remainingPennies = remainingPennies % 2;

            int onePences = remainingPennies / 1;
            remainingPennies = remainingPennies % 1;

            System.out.println("Pounds: " + pounds);
            System.out.println("Fifty Pences: " + fiftyPence);
            System.out.println("Twenty pences: " + twentyPences);
            System.out.println("Ten pences: " + tenPences);
            System.out.println("Five pences: " + fivePences);
            System.out.println("Two pences: " + twoPences);
            System.out.println("One pence: " + onePences);

        } catch (Exception e) {
            System.out.println("Please enter a value in pounds and pence");
        }




    }
}
