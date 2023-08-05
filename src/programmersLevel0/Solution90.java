package programmersLevel0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution90 {
    public int solution(int[] array) {
        Arrays.sort(array);

        return array[array.length/2];
    }

    public int solution2(int num1, int num2) {
        return num1%num2;
    }

    public int[] solution3(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0 ; i < numbers.length ; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }

    public int[] solution4(int numer1, int denom1, int numer2, int denom2) {
        int sumNumer = numer1 * denom2 + denom1 * numer2;
        int denom = denom1 * denom2;

        int compareNum = 2;

        while (compareNum <= Math.min(denom, sumNumer)) {
            if (denom % compareNum == 0 && sumNumer % compareNum == 0) {
                denom /= compareNum;
                sumNumer /= compareNum;
                compareNum = 2;
            } else {
                compareNum++;
            }
        }

        return new int[]{sumNumer, denom};
    }

    public int solution5(int num1, int num2) {
        return num1 == num2 ? 1 : -1;
    }

    public int solution6(int num1, int num2) {
        double answer = (double)num1 / (double)num2 * 1000;
        return (int) answer;
    }

    public int solution7(int num1, int num2) {
        return num1 / num2;
    }

    public int solution8(int num1, int num2) {
        return num1 * num2;
    }

    public int solution9(int num1, int num2) {
        return num1 - num2;
    }

    public int solution10(int num1, int num2) {
        return num1 + num2;
    }

    public int solution11(int[] array, int height) {
        int answer = 0;
        for (int i : array) {
            if (i > height) {
                answer++;
            }
        }
        return answer;
    }

    public int solution12(int[] array, int n) {
        int answer = 0;
        for (int i : array) {
            if (i == n) {
                answer++;
            }
        }
        return answer;
    }
}
/*
문제 설명
중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.

제한사항
array의 길이는 홀수입니다.
0 < array의 길이 < 100
-1,000 < array의 원소 < 1,000
입출력 예
array	result
[1, 2, 7, 10, 11]	7
[9, -1, 0]	0
 */