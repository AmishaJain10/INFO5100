

/*You are given an n x n 2D matrix representing an image. Rotate the image by 90
        degrees (clockwise).
        For example: given input matrix = [ [1,2,3],
        [4,5,6],
        [7,8,9] ],
        rotate the input matrix in-place such that it becomes: [ [7,4,1],
        [8,5,2],
        [9,6,3] ] */

import java.util.Arrays;

public class RotateMatrix90DegreesClockwiseInPlace {
    public static void main(String args[]) {
        int[][] matrix = {{1, 2, 3, 12, 17}, {4, 5, 6, 13, 18}, {7, 8, 9, 14, 19}, {10, 11, 15, 16, 20}, {21, 22, 23, 24, 25}}; // matrix1[row][column] It is an array of array
        rotateMatrix(matrix); // rotate matrix1 by 90 degree clockwise
        printMatrix(matrix);
    }

    static void rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            int j = i;
            while (j < n - i - 1) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = temp;
                ++j;
            }
        }
    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(Arrays.toString(matrix[i]));
            System.out.println();
        }
    }
}


