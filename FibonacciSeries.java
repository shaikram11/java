package com.kn.loop;
import java.util.Scanner;

public class FibonacciSeries {

    public static void printFibonacciSeries(int n) {
        int firstNum = 0;
        int secondNum = 1;
        System.out.print("Fibonacci Series up to " + n + " terms: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(firstNum + " ");
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Invalid input. Please enter a positive integer.");
        } else {
            printFibonacciSeries(n);
        }

        scanner.close();
    }
}
