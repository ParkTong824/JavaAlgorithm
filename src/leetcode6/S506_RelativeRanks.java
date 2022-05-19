package leetcode6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class S506_RelativeRanks {
    public static void main(String[] args) {
        int[] test = {10,3,8,9,4};
        System.out.println(Arrays.toString(findRelativeRanks(test)));
    }
    public static String[] findRelativeRanks(int[] score) {
        Map<Integer,Integer> indexMap = new HashMap<>();
        for (int i = 0 ; i < score.length ; i++) {
            indexMap.put(score[i],i);
        }
        Arrays.sort(score);
        String[] answer = new String[score.length];
        for (int i = 0 ; i < score.length ; i++) {
            if (i == score.length-1) {
                answer[indexMap.get(score[i])] = "Gold Medal";
            } else if (i == score.length-2) {
                answer[indexMap.get(score[i])] = "Silver Medal";
            } else if (i == score.length-3) {
                answer[indexMap.get(score[i])] = "Bronze Medal";
            } else {
                answer[indexMap.get(score[i])] = String.valueOf(score.length-i);
            }
        }

        return answer;
    }
}
/*
Input: score = [5,4,3,2,1]
Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th].

Input: score = [10,3,8,9,4]
Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
Explanation: The placements are [1st, 5th, 3rd, 2nd, 4th].
 */