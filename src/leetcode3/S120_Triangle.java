package leetcode3;

import java.util.List;

public class S120_Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int answer = 0;
        for (int i =0 ; i < triangle.size(); i++) {
            int min = triangle.get(i).get(0);
            for (int j = 1 ; j < triangle.get(i).size(); j++) {
                min = min>triangle.get(i).get(j)?triangle.get(i).get(j):min;
            }
            answer+=min;
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
/*
Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
Output: 11
Explanation: The triangle looks like:
   2
  3 4
 6 5 7
4 1 8 3
The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).

Input: triangle = [[-10]]
Output: -10
 */