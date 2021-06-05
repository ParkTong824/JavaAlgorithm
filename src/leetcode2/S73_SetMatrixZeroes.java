package leetcode2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class S73_SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1},{1,1,1}};
        setZeroes(matrix);
    }
    public static void setZeroes(int[][] matrix) {
        int[][] answer =new int[matrix.length][matrix[0].length];
        Set<Integer> horSet = new HashSet<>();
        Set<Integer> verSet = new HashSet<>();

        for (int i = 0 ; i < matrix.length ; i++){
            for (int j = 0 ; j < matrix[0].length; j++){
                if(matrix[i][j]==0){
                    horSet.add(i);
                    verSet.add(j);
                    answer[i][j]=0;
                }
            }
        }
        for (int i = 0 ; i < matrix.length ; i++){
            if (horSet.contains(i)){
                continue;
            }
            for (int j = 0 ; j < matrix[0].length; j++){
                if (verSet.contains(j)){
                    continue;
                }
                answer[i][j]=matrix[i][j];
            }
        }
        for(int i=0; i<matrix.length; i++){
            System.arraycopy(answer[i], 0, matrix[i], 0, answer[0].length);
        }
    }
}
/*
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]

Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 */