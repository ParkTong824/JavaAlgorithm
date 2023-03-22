package programmersLevel0;

public class Solution41 {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 0 ; i < n ; i++) {
            answer++;
            while (answer % 3 == 0 || (answer>10 && (answer/10) == 3) || (answer>10 &&(answer % 10) == 3) || (answer>100 && (answer % 100 / 10 == 3))) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 40;
        System.out.println(solution(n));
    }
}
