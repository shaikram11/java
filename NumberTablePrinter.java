package com.kn.loop;
import java.util.Scanner;

public class NumberTablePrinter {

    public static void printNumberTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to print its table: ");
        int number = scanner.nextInt();

        printNumberTable(number);

        scanner.close();
    }
}
