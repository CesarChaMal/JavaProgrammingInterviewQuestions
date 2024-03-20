package com.programming.exercises.search_element_insert_position;

import java.util.*;

class Main {

    public static int ceilIndex(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return lo; //ceil 
    }

    public static int search(int[] nums, int target) {
        //insert position is actually the ceil of the element 
        return ceilIndex(nums, target);
    }

    public static void main(String args[]) {
        // Your code goes here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();

        System.out.println(search(arr, target));

    }
} 