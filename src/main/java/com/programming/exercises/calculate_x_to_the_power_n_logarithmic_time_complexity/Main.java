package com.programming.exercises.calculate_x_to_the_power_n_logarithmic_time_complexity;

import java.util.*;

class Main {
    public static double power(double x, int n) {
        if (n == 0) return 1.0;
        double xpnby2 = power(x, n / 2); //xpnby2 = x power n by 2
        if (n % 2 == 0) return xpnby2 * xpnby2; //if power is even
        return x * xpnby2 * xpnby2; //if power is odd
    }

    public static double pow(double x, int n) {
        if (n < 0) {
            return 1.0 / power(x, -n);
        }
        return power(x, n);
    }

    public static void main(String args[]) {
        // Your code goes here
        Scanner scn = new Scanner(System.in);
        double x = scn.nextDouble();
        int n = scn.nextInt();
        System.out.println(pow(x, n));
    }
}