package com.programming.exercises.wave_sort;

import java.util.*;

class Main {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void waveSort(int[] arr) {
        for (int i = 0; i < arr.length; i = i + 2) {
            if (i > 0 && arr[i - 1] > arr[i]) {
                swap(arr, i - 1, i);
            }

            if (i < arr.length - 1 && arr[i + 1] > arr[i]) {
                swap(arr, i, i + 1);
            }
        }
    }

    public static void main(String args[]) {
        // Your code goes here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        waveSort(arr);

        System.out.println("After wave sort");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}