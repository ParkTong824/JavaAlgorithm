package test;

public class Solution10 {
    public int solution(int[][] matrix) {
        int answer = 0;
        int[][] verticalArr = new int[matrix.length][matrix.length];
        for (int i = 0 ; i < matrix.length ; i++) {
            for (int j = 0 ; j < matrix.length ; j++) {
                verticalArr[j][i] = matrix[i][j];
            }
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
/*
matrix	result
[[1,19,20,8,25],
 [21,4,3,17,24],
 [12,5,6,16,15],
 [11,18,10,9,23],
 [7,13,14,22,2]]	2

[[4,2,9],[1,3,5],[6,8,7]]	3
 */