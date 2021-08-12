package leetcode3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S119_PascalTriangle2 {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for (int i = 0 ; i < rowIndex+1 ; i++) {
            answer = new ArrayList<>();
            for (int j = 0 ; j <i+1 ; j++){
                if (j==0 || j==i){
                    answer.add(1);
                } else {
                    answer.add(temp.get(j-1)+temp.get(j));
                }
            }
            temp = new ArrayList<>(answer);

        }
        return answer;
    }

    public static void main(String[] args) {
        List<Integer> answer = getRow(3);
        System.out.println(answer.toString());
    }
}
/*
Example 1:

Input: rowIndex = 3
Output: [1,3,3,1]
Example 2:

Input: rowIndex = 0
Output: [1]
Example 3:

Input: rowIndex = 1
Output: [1,1]
 */