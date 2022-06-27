package me.nolanjames;

import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int birthday = 0;

        String set1 = "1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31";
        String set2 = "2 3 6 7 10 11 14 15 18 19 22 23 26 27 30 31";
        String set3 = "4 5 6 7 12 13 14 15 20 21 22 23 28 29 30 31";
        String set4 = "8 9 10 11 12 13 14 15 24 25 26 27 28 29 30 31";
        String set5 = "16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31";

        System.out.println("Is your birthday in set 1?");
        System.out.println(set1);
        String answerSet1 = scanner.nextLine().toLowerCase(Locale.ROOT);

        if (answerSet1.equals("yes")) {
            birthday += Integer.parseInt(String.valueOf(set1.charAt(0)));
        }

        System.out.println("Is your birthday in set 2?");
        System.out.println(set2);
        String answerSet2 = scanner.nextLine().toLowerCase(Locale.ROOT);

        if (answerSet2.equals("yes")) {
            birthday += Integer.parseInt(String.valueOf(set2.charAt(0)));
        }

        System.out.println("Is your birthday in set 3?");
        System.out.println(set3);
        String answerSet3 = scanner.nextLine().toLowerCase(Locale.ROOT);

        if (answerSet3.equals("yes")) {
            birthday += Integer.parseInt(String.valueOf(set3.charAt(0)));
        }

        System.out.println("Is your birthday in set 4?");
        System.out.println(set4);
        String answerSet4 = scanner.nextLine().toLowerCase(Locale.ROOT);

        if (answerSet4.equals("yes")) {
            birthday += Integer.parseInt(String.valueOf(set4.charAt(0)));
        }

        System.out.println("Is your birthday in set 5?");
        System.out.println(set5);
        String answerSet5 = scanner.nextLine().toLowerCase(Locale.ROOT);

        if (answerSet5.equals("yes")) {
            birthday += Integer.parseInt((set5.substring(0, 2)));
        }

        System.out.println("Your birthday is: " + birthday);

    }
}
