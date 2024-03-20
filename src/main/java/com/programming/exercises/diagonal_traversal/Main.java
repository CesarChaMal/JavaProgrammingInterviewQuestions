package com.programming.exercises.diagonal_traversal;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here 
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

        diagonalTraversal(mat);
    }

    public static void diagonalTraversal(int[][] mat) {

        int maxGap = mat[0].length - 1;

        for (int gap = 0; gap <= maxGap; gap++) {

            for (int i = 0, j = gap; i < mat.length && j < mat[0].length; i++, j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

}