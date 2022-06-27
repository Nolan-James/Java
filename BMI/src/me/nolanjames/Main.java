package me.nolanjames;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight in kg:");
        double weight = scanner.nextDouble();

        System.out.println("Enter your height in meters:");
        double height = scanner.nextDouble();


        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("You're underweight");
        } else if (bmi >= 18.5 && bmi < 26.0) {
            System.out.println("You're a normal weight");
        } else if (bmi >= 25.0 && bmi < 30.0) {
            System.out.println("You're overweight");
        } else {
            System.out.println("You're obese");
        }
    }
}
