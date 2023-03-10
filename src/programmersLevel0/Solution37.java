package programmersLevel0;

import java.util.*;

public class Solution37 {
    public static int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        Map<Integer,String> checkMap = new HashMap<>();
        for (int i = 0 ; i < numlist.length ; i++) {
            int tempIndex = numlist[i]-n < 0 ? -i : i;
            numlist[i]= Math.abs(numlist[i]-n);
            if (checkMap.containsKey(numlist[i])) {
                checkMap.put(numlist[i], checkMap.get(numlist[i])+","+tempIndex);
            } else {
                checkMap.put(numlist[i], String.valueOf(tempIndex));
            }
        }
        Arrays.sort(numlist);
        for (int i = 0 ; i < numlist.length ; i++) {
            int checkNum = numlist[i];
            String checkString = checkMap.get(checkNum);
            String[] checkArr = checkString.split(",");
            if (checkArr.length>1) {
                String remainString = Integer.parseInt(checkArr[0]) > Integer.parseInt(checkArr[1])? checkArr[0] : checkArr[1];
                answer[i] = Integer.parseInt(checkArr[0]) > Integer.parseInt(checkArr[1])? Integer.parseInt(checkArr[0])+n : Integer.parseInt(checkArr[1])+n;


                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] numList = {3,5};
        int n = 10;
        System.out.println(Arrays.toString(solution(numList, n)));
    }
}
/*
문제 설명
정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다.
이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다.
정수가 담긴 배열 numlist와 정수 n이 주어질 때 numlist의 원소를
n으로부터 가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ n ≤ 10,000
1 ≤ numlist의 원소 ≤ 10,000
1 ≤ numlist의 길이 ≤ 100
numlist는 중복된 원소를 갖지 않습니다.
입출력 예
numlist	n	result
[1, 2, 3, 4, 5, 6]	4	[4, 5, 3, 6, 2, 1]
[10000,20,36,47,40,6,10,7000]	30	[36, 40, 20, 47, 10, 6, 7000, 10000]
 */
