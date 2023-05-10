package programmersLevel0;

import java.util.ArrayList;
import java.util.List;

public class Solution88 {
    public static int[] solution(int n) {
        int answerLength = n%2 == 1 ? (n/2+1):(n/2);
        int[] answer = new int[answerLength];
        int index = 0;
        for (int i = 1 ; i <= n ; i++) {
            if (i%2 == 1) {
                answer[index] = i;
                index++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 15;
        solution(n);
    }
}
