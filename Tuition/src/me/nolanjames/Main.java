package me.nolanjames;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter tuition fee:");
        double tuitionFee = scanner.nextDouble();
        double initialFee = tuitionFee;
        System.out.println("Enter yearly fee increase in %:");
        double percentageIncrease = scanner.nextDouble();

        int years = 0;

        while (tuitionFee < (initialFee * 2)) {
            tuitionFee = tuitionFee * percentageIncrease;
            years++;
        }

        System.out.println("Tuition will be doubled in " + years + " years!");
        System.out.printf("Tuition will be £%.2f in %1d years", tuitionFee, years);
    }
}
