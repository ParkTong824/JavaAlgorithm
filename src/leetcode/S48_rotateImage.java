package leetcode;

import java.util.Arrays;

public class S48_rotateImage {
    public static void rotate(int[][] matrix) {
        int[][] changeMatrix = new int[matrix.length][matrix.length];
        for (int i = 0 ; i<matrix.length ; i++){
            System.arraycopy(matrix[i], 0, changeMatrix[i], 0, matrix[0].length);
        }
        for (int i = 0 ; i < matrix.length ; i++){
            for (int j = 0 ; j < matrix[0].length ; j++){
                int changeInt = changeMatrix[j][i];
                matrix[i][matrix.length-1-j] = changeInt;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);

        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));
    }
}

/*
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]

Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]

Input: matrix = [[1]]
Output: [[1]]

Input: matrix = [[1,2],[3,4]]
Output: [[3,1],[4,2]]
 */