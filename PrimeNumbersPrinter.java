package com.kn.loop;

import java.util.Scanner;

public class PrimeNumbersPrinter {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printFirstNPrimes(int n) {
        int count = 0;
        int num = 2; 

        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();


        if (n < 1) {
            System.out.println("Invalid input. Please enter a positive integer.");
        } else {
            System.out.println("The first " + n + " prime numbers are:");
            printFirstNPrimes(n);
        }

        scanner.close();
    }
}
