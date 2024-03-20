package com.programming.exercises.find_the_first_and_last_occurrence_of_element_in_array;

import java.util.*;

class Main {
    public static void main(String args[]) {
        // Your code goes here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        // input the array 
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();
        int fIndex = -1, lIndex = -1;
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                if (!found) {
                    fIndex = i;
                    lIndex = i;
                    found = true; //found for the first time  
                } else {
                    lIndex = i;
                }
            }
        }

        if (found == false) {
            System.out.println("The element does not exist in the array");
        } else {
            System.out.println("First Index = " + fIndex + " Last Index = " + lIndex);
        }
    }
} 
