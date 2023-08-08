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
        boolean[] isNotPrime = new boolean[n+1];
        isNotPrime[0] = isNotPrime[1] = true;
        for (int i = 2 ; i*i <= n ; i++) {
            if (!isNotPrime[i]) {
                for (int j = i*i ; j<=n ; j+=i) {
                    isNotPrime[j] = true;
                }
            }
        }

        for (int i = 0 ; i < isNotPrime.length ; i++) {
            if (!isNotPrime[i]) {
                answer++;
            }
        }
        return answer;
    }

    public static String solution2(String s) {
        StringBuilder result = new StringBuilder();
        String[] splitArr = s.split(" ");
        for (int i = 0 ; i < splitArr.length ; i++) {
            if (i != 0) {
                result.append(" ");
            }
            for (int j = 0 ; j < splitArr[i].length() ; j++) {
                if (j % 2 == 0) {
                    if (splitArr[i].charAt(j) >= 'a' && splitArr[i].charAt(j) <= 'z') {
                        result.append((char)(splitArr[i].charAt(j) - ('a'-'A')));
                    } else {
                        result.append(splitArr[i].charAt(j));
                    }
                } else {
                    if (splitArr[i].charAt(j) >= 'A' && splitArr[i].charAt(j) <= 'Z') {
                        result.append((char)(splitArr[i].charAt(j) + ('a'-'A')));
                    } else {
                        result.append(splitArr[i].charAt(j));
                    }
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        char a = 'a';
        char b = 'A';
        char c = 'd';
        System.out.println((char)(c-(a-b)));
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

s	return
"try hello world"	"TrY HeLlO WoRlD"
 */
