package me.nolanjames;

public class Main {

    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;
        final int NUMBER_PER_LINE_TO_PRINT = 10;

        int primeCount = 0;
        int num = 2;

        while (primeCount < NUMBER_OF_PRIMES) {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primeCount++;

                if (primeCount % NUMBER_PER_LINE_TO_PRINT == 0) {
                    System.out.println(num);
                } else System.out.print(num + " ");
            }
            num++;
        }
    }
}
