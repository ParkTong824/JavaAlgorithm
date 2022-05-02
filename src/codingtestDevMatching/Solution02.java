package codingtestDevMatching;

import java.util.*;

public class Solution02 {
    public static long[][] solution(int[] H) {

        int[] tempArr = H.clone();
        Arrays.sort(tempArr);
        Map<Long,Long> answerMap = new HashMap<>();

        int minNum = tempArr[0];
        int maxNum = tempArr[tempArr.length-1];

        for (int i = 0 ; i < H.length ; i++) {
            for (long j = minNum ; j <= H[i] ; j++) {
                int nowIndex = i;
                boolean isContain = false;
                while (nowIndex < H.length) {
                    if (H[nowIndex]<j) {
                        break;
                    } else if (H[nowIndex] == j || isContain) {
                        isContain = true;

                        if (answerMap.containsKey(j)) {
                            answerMap.put(j, answerMap.get(j)+1);
                        } else {
                            answerMap.put(j, 1L);
                        }
                    }
                    nowIndex++;
                }
            }
        }
        Object[] keyArr = answerMap.keySet().toArray();
        Arrays.sort(keyArr);

        long[][] answer = new long[keyArr.length][2];
        for (int i = 0 ; i < keyArr.length ; i++) {
            answer[i][0] = (long) keyArr[i];
            answer[i][1] = answerMap.get(keyArr[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] H = {3,2,1,1,3};
        long[][] answer = solution(H);
        System.out.println(Arrays.toString(answer[0]));
        System.out.println(Arrays.toString(answer[1]));
        System.out.println(Arrays.toString(answer[2]));
    }
}

/*
H	return
[3,2,1,1,3]	[[1,11],[2,2],[3,2]]
예제 설명
직사각형을 [왼쪽 아래 꼭짓점의 좌표, 오른쪽 위 꼭짓점의 좌표]로 표현했을 때,

높이가 3인 꽉 끼는 직사각형은 [(0, 0), (1, 3)], [(4,0), (5,3)]으로 2개이고,

높이가 2인 꽉 끼는 직사각형은 [(0, 0), (2, 2)], [(1, 0), (2, 2)]로 2개이다.

높이가 1인 꽉 끼는 직사각형은 [(0, 0), (5, 1)]을 비롯해 총 11개가 있다.
 */
