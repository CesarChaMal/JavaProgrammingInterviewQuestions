package com.programming.exercises.nth_fibonacci_number;

import java.util.*;

class Main2 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        if (n < 0) {
            System.out.println("N cannot be negative");
            return;
        }
        
        // Dynamic programming array to store the Fibonacci numbers
        int[] fib = new int[n + 1];
        
        // Base cases
        if (n >= 0) fib[0] = 0;
        if (n >= 1) fib[1] = 1;
        
        // Fill the array using previously computed values
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        
        // Output the nth Fibonacci number
        System.out.println(fib[n]);
    }
}