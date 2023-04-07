package programmersLevel0;

public class Solution56 {
    public int solution(int n) {
        int answer = 1;
        int checkNumber = 1;
        while (checkNumber <= n) {
            answer++;
            checkNumber *= answer;
        }
        answer--;
        return answer;
    }
}
