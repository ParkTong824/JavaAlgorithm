package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution11 {
    public static int[] solution(int[] arr) {
        Set<Integer> checkSet = new HashSet<>();
        Set<Integer> answerSet = new HashSet<>();
        for (int i = 0 ; i < arr.length ; i++) {
            if (checkSet.add(arr[i])) {
                answerSet.add(arr[i]);
            } else {
                answerSet.remove(arr[i]);
            }
        }
        if (answerSet.size() == 0) {
            return new int[]{-1};
        }
        int[] answer = answerSet.stream().sorted().mapToInt(Integer::intValue).toArray();


        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 3, 5, 7, 5, 7};
        System.out.println(Arrays.toString(solution(arr)));
    }
}
/*
arr	result
[2, 1, 3, 3]	[1, 2]
[3, 4, 4, 2, 5, 2, 5, 5]	[3]
[3, 5, 3, 5, 7, 5, 7]	[-1]
 */