package programmersLevel0;

public class Solution15 {
    public static int solution(int num, int k) {
        int answer = 1;
        int checkIndex = 1;
        boolean isContain = false;
        while (num > 0) {
            if (num % 10 == k) {
                answer = checkIndex;
                isContain = true;
            }
            checkIndex++;
            num /= 10;
        }
        if (isContain) {
            return checkIndex - answer;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int num = 29183;
        int k = 1;
        solution(num,k);
    }
}
/*
문제 설명
정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고
없으면 -1을 return 하도록 solution 함수를 완성해보세요.

제한사항
0 < num < 1,000,000
0 ≤ k < 10
num에 k가 여러 개 있으면 가장 처음 나타나는 자리를 return 합니다.
입출력 예
num	k	result
29183	1	3
232443	4	4
123456	7	-1
 */