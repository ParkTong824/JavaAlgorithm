package programmersLevel0;

public class Solution64 {
    public static int solution(int balls, int share) {
        double answer = 1;
        int tempNumber = balls-share;
        for (int i = balls ; i >= 2 ; i--) {
            answer*=i;
            if (share>1) {
                answer/=share;
                share--;
            }
            if (tempNumber>1) {
                answer/=tempNumber;
                tempNumber--;
            }
        }
        return (int) Math.round(answer);
    }

    public static void main(String[] args) {
        solution(3,2);
    }
}
