package test;

import java.util.Arrays;

public class Solution01 {
    public static int[][] solution(int N, int[][] mine) {
        int[][] answer = new int[N][N];
        for (int i = 0 ; i < mine.length; i++) {
            answer[mine[i][0]-1][mine[i][1]-1]=-1;
            answer = plusMineCount(answer,mine[i]);
        }
        return answer;
    }
    public static int[][] plusMineCount(int[][] answer, int[] mine){
        int minusY= mine[0]-2;
        int plusY = mine[0];
        int minusX= mine[1]-2;
        int plusX = mine[1];
        if (minusY>=0){
            if (minusX>=0){
                if(answer[minusY][minusX]!=-1){
                    answer[minusY][minusX]++;
                }
            }
            if(answer[minusY][mine[1]-1]!=-1){
                answer[minusY][mine[1]-1]++;
            }
            if (plusX<answer.length){
                if(answer[minusY][plusX]!=-1){
                    answer[minusY][plusX]++;
                }
            }
        }
        if (plusY<answer.length){
            if (minusX>=0){
                if(answer[plusY][minusX]!=-1){
                    answer[plusY][minusX]++;
                }
            }
            if(answer[plusY][mine[1]-1]!=-1){
                answer[plusY][mine[1]-1]++;
            }
            if (plusX<answer.length){
                if(answer[plusY][plusX]!=-1){
                    answer[plusY][plusX]++;
                }
            }
        }
        if (minusX>=0){
            if(answer[mine[0]-1][minusX]!=-1){
                answer[mine[0]-1][minusX]++;
            }
        }
        if(answer[mine[0]-1][mine[1]-1]!=-1){
            answer[mine[0]-1][mine[1]-1]++;
        }
        if (plusX<answer.length){
            if(answer[mine[0]-1][plusX]!=-1){
                answer[mine[0]-1][plusX]++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int N = 9;
        int[][] mine = {
                {1, 1}, {1, 7}, {2, 7}, {3, 6}, {4, 1}, {4, 4}, {4, 8}, {8, 4}, {8, 5}, {9, 6}
        };
        System.out.println(Arrays.toString(solution(N,mine)[0]));
        System.out.println(Arrays.toString(solution(N,mine)[1]));
        System.out.println(Arrays.toString(solution(N,mine)[2]));
        System.out.println(Arrays.toString(solution(N,mine)[3]));
        System.out.println(Arrays.toString(solution(N,mine)[4]));
        System.out.println(Arrays.toString(solution(N,mine)[5]));
        System.out.println(Arrays.toString(solution(N,mine)[6]));
        System.out.println(Arrays.toString(solution(N,mine)[7]));
        System.out.println(Arrays.toString(solution(N,mine)[8]));

    }
}
/*
9	[ [1, 1], [1, 7], [2, 7], [3, 6], [4, 1], [4, 4], [4, 8], [8, 4], [8, 5], [9, 6] ]
[[-1, 1, 0, 0, 0, 2,-1, 2, 0],
[ 1, 1, 0, 0, 1, 3,-1, 2, 0],
[ 1, 1, 1, 1, 2,-1, 3, 2, 1],
[-1, 1, 1,-1, 2, 1, 2,-1, 1],
[ 1, 1, 1, 1, 1, 0, 1, 1, 1],
[ 0, 0, 0, 0, 0, 0, 0, 0, 0],
[ 0, 0, 1, 2, 2, 1, 0, 0, 0],
[ 0, 0, 1,-1,-1, 2, 1, 0, 0],
[ 0, 0, 1, 2, 3,-1, 1, 0, 0]]
 */
