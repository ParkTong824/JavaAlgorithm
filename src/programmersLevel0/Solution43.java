package programmersLevel0;

public class Solution43 {
    public int solution(int[] sides) {
        int answer = 0;
        int bigNumber = Math.max(sides[0], sides[1]);
        int smallNumber = Math.min(sides[0], sides[1]);
        int checkNum = 0 ;

        answer += smallNumber;
        answer += smallNumber-1;
        return answer;
    }
}
/*
제한사항
sides의 원소는 자연수입니다.
sides의 길이는 2입니다.
1 ≤ sides의 원소 ≤ 1,000
입출력 예
sides	result
[1, 2]	1
[3, 6]	5
[11, 7]	13
 */