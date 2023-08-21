package com.pattern.forloop;

public class ReverseTrianglePattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pattern
        
        for (int i = rows; i >= 1; i--) { // Loop for each row
            char ch = 'E'; // Starting character
            
            for (int j = i; j >= 1; j--) { // Loop to print characters in each row
                System.out.print(ch);
                ch--; // Move to the previous character
            }
            
            System.out.println(); // Move to the next line after each row
        }
    }
}