package programmersLevel0;

public class Solution10 {
    public int solution(int n) {
        int answer = 0;
        boolean isBig = false;
        int pivot = 1;
        while (!isBig) {
            if (pivot * pivot == n) {
                return 1;
            } else if (pivot * pivot > n) {
                return 2;
            }

            pivot++;
        }
        return answer;
    }
}

/*
문제 설명
어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다.
정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ n ≤ 1,000,000
입출력 예
n	result
144	1
976	2
 */