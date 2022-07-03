package com.github.dimka9910.testtasks.leetCodeTasks.arrays;

import org.junit.Test;

import java.util.Arrays;

public class RotateImage {
    @Test
    public void name() {
        int[][] array = new int[][]{
                new int[]{1,2,3},
                new int[]{4,5,6},
                new int[]{7,8,9}};
        rotate(array);
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    public void rotate(int[][] matrix) {

        int[][] m = new int[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++){
            for (int j = matrix.length - 1; j >= 0; j--){
                m[i][matrix.length - j - 1] = matrix[j][i];
            }
        }

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                matrix[i][j] = m[i][j];
            }
        }
    }
}
