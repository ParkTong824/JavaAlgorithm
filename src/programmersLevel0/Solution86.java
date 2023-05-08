package programmersLevel0;

public class Solution86 {
    public int solution(int n) {
        int answer = 6;
        while (answer%n!=0) {
            answer+=6;
        }
        return answer/6;
    }
}
