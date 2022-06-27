package me.nolanjames;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 1000");
        int input = scanner.nextInt();
        double total = 1;

        while (input > 0) {
            int last = input % 10;
            total *= last;
            input = input / 10;
        }

        System.out.println(total);
    }
}
