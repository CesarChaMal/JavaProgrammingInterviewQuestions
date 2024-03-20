package com.programming.exercises.inputt_and_display_2_d_matrix;

import java.util.*;

class Main {
    public static void main(String args[]) {
        // Your code goes here
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[][] mat = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

        //Display Row wise 
        for (int i = 0; i < N; i++) {
            System.out.print("Row " + i + " : ");
            for (int j = 0; j < N; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("\t");
        }

        System.out.println();

        //Display Col wise 
        for (int j = 0; j < N; j++) {
            System.out.print("Col " + j + " : ");
            for (int i = 0; i < N; i++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("\t");
        }
    }
}