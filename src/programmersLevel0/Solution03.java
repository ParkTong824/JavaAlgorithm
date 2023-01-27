package programmersLevel0;

import java.util.Arrays;

public class Solution03 {
    public static int[] solution(int num, int total) {
        int[] answer = new int[num];
        int middleNum = 0;
        if (num%2 == 0) {
            middleNum = total/num;
        } else {
            middleNum = total/num;
        }
        for (int i = 0 ; i < num ; i++) {
            int inputNumber = middleNum-(num/2)+i;
            if (num%2 == 0) {
                inputNumber++;
            }
            answer[i] = inputNumber;
        }
        return answer;
    }

    public static void main(String[] args) {
        int num = 5;
        int total = 5;
        System.out.println(Arrays.toString(solution(num,total)));
    }
}
/*
문제 설명
연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다.
두 정수 num과 total이 주어집니다.
연속된 수 num개를 더한 값이 total이 될 때, 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.

제한사항
1 ≤ num ≤ 100
0 ≤ total ≤ 1000
num개의 연속된 수를 더하여 total이 될 수 없는 테스트 케이스는 없습니다.
입출력 예
num	total	result
3	12	[3, 4, 5]
5	15	[1, 2, 3, 4, 5]
4	14	[2, 3, 4, 5]
5	5	[-1, 0, 1, 2, 3]
 */