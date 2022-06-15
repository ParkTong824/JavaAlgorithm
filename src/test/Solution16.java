package test;

import java.util.Arrays;

public class Solution16 {
    public static int[][] solution(int n, boolean horizontal) {
        int[][] answer = new int[n][n];
        int nowHorIndex = 0;
        int nowVerIndex = 0;
        boolean nowHor = !horizontal;
        boolean nowMinus = false;
        int nowLength = 1;
        for (int i = 1 ; i <= n*n ; i++) {
            answer[nowHorIndex][nowVerIndex] = i;
            if (!nowMinus){
                if (nowHor && nowHorIndex < nowLength) {
                    nowHorIndex++;
                } else if (!nowHor && nowVerIndex < nowLength) {
                    nowVerIndex++;
                } else {
                    if (nowHorIndex == nowLength && nowVerIndex == nowLength){
                        nowMinus = true;
                        if (nowHor) {
                            nowVerIndex--;
                        } else {
                            nowHorIndex--;
                        }
                    } else if (nowHorIndex == nowLength) {
                        nowVerIndex++;
                    } else if (nowVerIndex == nowLength) {
                        nowHorIndex++;
                    }
                    nowHor = !nowHor;
                }
            } else {
                if (nowHor && nowHorIndex >0 ) {
                    nowHorIndex--;
                } else if (!nowHor && nowVerIndex > 0) {
                    nowVerIndex--;
                } else {
                    if ((nowHor && nowHorIndex == 0) || (!nowHor && nowVerIndex == 0)){
                        if (nowHor) {
                            nowVerIndex++;
                        } else {
                            nowHorIndex++;
                        }
                        nowHor = !nowHor;
                        nowLength++;
                        nowMinus = false;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 4;
        boolean horizontal = true;
        int[][] test = solution(n,horizontal);
        System.out.println(Arrays.toString(test[0]));
        System.out.println(Arrays.toString(test[1]));
        System.out.println(Arrays.toString(test[2]));
        System.out.println(Arrays.toString(test[3]));
    }
}

/*
4  true
 1, 2, 9,10,25,26
 4, 3, 8,11,24,27
 5, 6, 7,12,23,28
16,15,14,13,22,29
17,18,19,20,21,30
36,35,34,33,32,31
 */
