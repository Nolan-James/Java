package me.nolanjames;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the subtotal and a tip percentage");

        String input = scanner.nextLine();

        double subtotal = Double.parseDouble(input.split(" ")[0]);
        double tipPercentage = Double.parseDouble(input.split(" ")[1]);

        double tip = (tipPercentage * subtotal) / 100;
        double finalBill = subtotal + tip;

        System.out.println("The tip is £" + tip + ". The total comes to £" + finalBill);

        scanner.close();
    }
}
