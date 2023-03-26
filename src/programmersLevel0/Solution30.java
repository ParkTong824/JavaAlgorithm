package programmersLevel0;

public class Solution30 {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int a = i ; a <= j ; a++) {
            int checkNum = a;
            while (checkNum > 0) {
                if (checkNum%10 == k) {
                    answer++;
                }
                checkNum/=10;
            }
        }
        return answer;
    }
}
/*
문제 설명
1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다.
정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ i < j ≤ 100,000
0 ≤ k ≤ 9
입출력 예
i	j	k	result
1	13	1	6
10	50	5	5
3	10	2	0
 */