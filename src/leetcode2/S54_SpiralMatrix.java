package leetcode2;

import java.util.ArrayList;
import java.util.List;

public class S54_SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();
        int horLength = matrix[0].length;
        int verLength = matrix.length-1;
        boolean isUp = false;
        boolean isLeft = false;
        int nowHor = -1;
        int nowVer = 0;

        while (horLength>=0 && verLength>=0) {
            if (horLength>0){
                for (int i = 0 ; i < horLength ; i++) {
                    if (isLeft){
                        nowHor--;
                    } else {
                        nowHor++;
                    }
                    answer.add(matrix[nowVer][nowHor]);
                }
            }
            isLeft=!isLeft;
            horLength--;
            if (verLength>0){
                for (int i = 0 ; i < verLength ; i++) {
                    if (isUp){
                        nowVer--;
                    } else {
                        nowVer++;
                    }
                    answer.add(matrix[nowVer][nowHor]);
                }
            }
            isUp=!isUp;
            verLength--;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        System.out.println(spiralOrder(matrix).toString());
    }
}
