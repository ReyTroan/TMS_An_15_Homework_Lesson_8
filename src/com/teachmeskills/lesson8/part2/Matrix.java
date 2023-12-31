package com.teachmeskills.lesson8.part2;

/**
 * Implementation of the method multiplication of two matrices;
 * A static class "Utils" has been created with a static method
 *      for displaying the result multiplication of two matrices on the screen
 */

public class Matrix {

    public static void main(String[] args) {
        int[][] mx1 = {{1,0,0,0},{0,1,0,0},{0,0,0,0}};
        int[][] mx2 = {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};

        int[][] resultMatrix = matrixMultiplication(mx1, mx2);

        Utils.matrixOutput(mx1);
        Utils.matrixOutput(mx2);
        Utils.matrixOutput(resultMatrix);
    }

    public static int[][] matrixMultiplication(int[][] mx1, int[][] mx2) {
        int strMx1 = mx1.length;
        int colMx1 = mx1[0].length;
        int colMx2 = mx2[0].length;

        int[][] result = new int[strMx1][colMx2];

        for (int i = 0; i < strMx1; i++) {
            for (int j = 0; j < colMx2; j++) {
                for (int k = 0; k < colMx1; k++) {
                    result[i][j] += mx1[i][k] * mx2[k][j];
                }
            }
        }
        return result;
    }

    static class Utils{
        public static void matrixOutput(int[][] matrix){
            for (int[] string : matrix) {
                for (int element : string) {
                    System.out.print(element + " ");
                }
            }
            System.out.println();
        }
    }
}
