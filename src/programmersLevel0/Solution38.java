package programmersLevel0;

import java.util.ArrayList;
import java.util.List;

public class Solution38 {
    public int solution(int a, int b) {
        int answer = 0;
        if (a == b) {
            return 1;
        }
        boolean bIsSmall = a > b;
        List<Integer> checkPrimeArr = new ArrayList<>();
        for (int i = 1 ; i <= b ; i++) {
            if (b % i == 0) {
                checkPrimeArr.add(i);
            }
        }
        for (int i = 0 ; i < checkPrimeArr.size() ; i++) {
            if (checkPrimeArr.get(i) % 2 == 0 || checkPrimeArr.get(i) % 5 == 0) {
                continue;
            } else {
                if (a % checkPrimeArr.get(i) != 0) {
                    return 2;
                }
            }
        }

        return 1;
    }
}
/*
문제 설명
소수점 아래 숫자가 계속되지 않고 유한개인 소수를 유한소수라고 합니다.
분수를 소수로 고칠 때 유한소수로 나타낼 수 있는 분수인지 판별하려고 합니다.
유한소수가 되기 위한 분수의 조건은 다음과 같습니다.

기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야 합니다.
두 정수 a와 b가 매개변수로 주어질 때, a/b가 유한소수이면 1을, 무한소수라면 2를 return하도록 solution 함수를 완성해주세요.

제한사항
a, b는 정수
0 < a ≤ 1,000
0 < b ≤ 1,000
입출력 예
a	b	result
7	20	1
11	22	1
12	21	2
 */