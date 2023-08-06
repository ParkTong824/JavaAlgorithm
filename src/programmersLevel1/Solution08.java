package programmersLevel1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution08 {
    public int solution(int[] nums) {
        int distinctSize = Arrays.stream(nums).distinct().boxed().collect(Collectors.toList()).size();
        return Math.min(nums.length / 2, distinctSize);
    }
    public int solution1(int n) {
        int answer = 0;
        int[] checkArr = new int[n+1];
        for (int i = 2 ; i <= n ; i++) {
            int pivotNum = 2;
            boolean check = true;
            while (i/2 >= pivotNum) {
                if (checkArr[i] == -1) {
                    check = false;
                    break;
                }
                if (i % pivotNum == 0) {
                    check = false;
                    int checkNum = i;
                    while (checkNum < n) {
                        checkArr[checkNum] = -1;
                        checkNum += i;
                    }
                    break;
                } else {
                    pivotNum++;
                }
            }
            if (check) {
                answer++;
            }
        }
        return answer;
    }
}
/*
제한사항
nums는 폰켓몬의 종류 번호가 담긴 1차원 배열입니다.
nums의 길이(N)는 1 이상 10,000 이하의 자연수이며, 항상 짝수로 주어집니다.
폰켓몬의 종류 번호는 1 이상 200,000 이하의 자연수로 나타냅니다.
가장 많은 종류의 폰켓몬을 선택하는 방법이 여러 가지인 경우에도, 선택할 수 있는 폰켓몬 종류 개수의 최댓값 하나만 return 하면 됩니다.
입출력 예
nums	result
[3,1,2,3]	2
[3,3,3,2,2,4]	3
[3,3,3,2,2,2]	2

입출력 예
n	result
10	4
5	3
 */
