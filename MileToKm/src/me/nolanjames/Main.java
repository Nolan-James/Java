package me.nolanjames;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter miles: ");
        double input = scanner.nextDouble();

        String kmTo1Decimal = String.format("%.1f", input * 1.6);

        System.out.println(input + " miles is " + kmTo1Decimal + " kilometers.");
    }
}
