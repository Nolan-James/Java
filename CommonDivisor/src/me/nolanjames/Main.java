package me.nolanjames;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gcd = 1;
        int temp = 2;

        System.out.println("Enter first integer:");
        int firstUserInteger = scanner.nextInt();
        System.out.println("Enter second integer:");
        int secondUserInteger = scanner.nextInt();

        while (temp <= firstUserInteger && temp <= secondUserInteger) {
            if (firstUserInteger % temp == 0 && secondUserInteger % temp == 0) {
                gcd = temp;
            }
            temp++;
        }

        System.out.println("the greatest common divisor for " + firstUserInteger + " and " + secondUserInteger + " is " + gcd);
    }
}
