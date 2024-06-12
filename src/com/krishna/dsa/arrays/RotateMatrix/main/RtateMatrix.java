package com.krishna.dsa.arrays.RotateMatrix.main;

public class RtateMatrix {
    static void rotateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] newMat = new int[m][n];
        for (int j = 0; j < m; j++) {
            newMat[j][n - i - 1] = mat[i][j];
        }
    }
}

