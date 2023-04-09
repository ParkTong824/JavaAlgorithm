package programmersLevel0;

public class Solution58 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1 ; i <= n ; i++) {
            int checkCount = 0;
            for (int j = 1 ; j<i ; j++) {
                if (i%j == 0) {
                    checkCount++;
                }
                if (checkCount == 2) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}
