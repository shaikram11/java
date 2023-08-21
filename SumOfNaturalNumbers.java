package com.kn.loop;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Invalid input. Please enter a positive integer.");
        } else {
            int sum = calculateSum(n);
            System.out.println("The sum of first " + n + " natural numbers is: " + sum);
        }

        scanner.close();
    }
}
