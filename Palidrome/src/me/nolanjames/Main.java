package me.nolanjames;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String userWord = scanner.nextLine();
        boolean isPalindrome = false;

        int low = 0;
        int high = userWord.length() - 1;

        while (low < high) {
            if (userWord.charAt(low) != userWord.charAt(high)) {
                isPalindrome = false;
                break;
            }
            isPalindrome = true;
            low++;
            high--;
        }

        if (isPalindrome) {
            System.out.println("The word " + userWord + " is a palindrome");
        } else {
            System.out.println("The word " + userWord + " is not a palindrome");
        }

    }
}
