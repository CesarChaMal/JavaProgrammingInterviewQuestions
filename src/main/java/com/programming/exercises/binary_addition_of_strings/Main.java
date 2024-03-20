package com.programming.exercises.binary_addition_of_strings;

import java.util.*;

class Main {

    public static String add(String a, String b) {
        String ans = "";

        if (a.equals("0") && b.equals("0")) return "0";

        int i = a.length() - 1;
        int j = b.length() - 1;

        int ca = 0;

        while (i >= 0 || j >= 0 || ca > 0) {

            int d1 = (i >= 0) ? (a.charAt(i) - '0') : 0;
            int d2 = (j >= 0) ? (b.charAt(j) - '0') : 0;

            int digit = 0;
            if (d1 + d2 + ca >= 2) {
                digit = (d1 + d2 + ca) % 2;
                ca = (d1 + d2 + ca) / 2;
            } else {
                digit = d1 + d2 + ca;
                ca = 0;
            }

            i--;
            j--;
            ans = digit + ans;
        }

        return ans;
    }

    public static void main(String args[]) {
        // Your code goes here
        Scanner scn = new Scanner(System.in);
        String a = scn.nextLine();
        String b = scn.nextLine();

        System.out.println("The sum is: " + add(a, b));
    }
}