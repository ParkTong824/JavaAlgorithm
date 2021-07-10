package leetcode3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S118_PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        for (int i = 0 ; i < numRows ; i++) {
            if (i == 0){
                answer.add(new ArrayList<>(Arrays.asList(1)));
                continue;
            } else if (i ==1){
                answer.add(new ArrayList<>(Arrays.asList(1,1)));
                continue;
            }
            List<Integer> result = new ArrayList<>();
            for (int j = 0 ; j <i+1 ; j++){
                if (j==0 || j==i){
                    result.add(1);
                } else {
                    result.add(answer.get(i-1).get(j-1)+answer.get(i-1).get(j));
                }
            }
            answer.add(result);
        }

        return answer;
    }

    public static void main(String[] args) {
        List<List<Integer>> answer = generate(5);
        System.out.println(answer.get(0).toString());
        System.out.println(answer.get(1).toString());
        System.out.println(answer.get(2).toString());
        System.out.println(answer.get(3).toString());
        System.out.println(answer.get(4).toString());
    }
}
/*
Input: numRows = 5
Output: [
         [1],
        [1,1],
       [1,2,1],
      [1,3,3,1],
     [1,4,6,4,1]]
    1,5,10,10,5,1
   1,6,15,20,15,6,1
  1,7,21,35,35,21,7,1
Example 2:

Input: numRows = 1
Output: [[1]]
 */