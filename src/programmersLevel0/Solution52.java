package programmersLevel0;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution52 {
    public int[] solution(int n) {
        Set<Integer> answerSet = new HashSet<>();
        int checkNum = 2;
        while (checkNum <= n) {
            if (n % checkNum == 0) {
                answerSet.add(checkNum);
                n /= checkNum;
            } else {
                checkNum++;
            }
        }
        int[] answer = new int[answerSet.size()];
        int index = 0;
        for (int i : answerSet) {
            answer[index] = i;
            index++;
        }
        Arrays.sort(answer);
        return answer;
    }
}
