package com.programming.exercises.staircase_search;

import java.util.*;

class Main {

    public static boolean staircaseSearch(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;

        int j = matrix[0].length - 1;
        int i = 0;

        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target) return true;
            else if (matrix[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }

        return false;
    }

    public static void main(String args[]) {
        // Your code goes here
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int M = scn.nextInt();

        int[][] mat = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

        int target = scn.nextInt();

        System.out.println(staircaseSearch(mat, target));
    }
}
