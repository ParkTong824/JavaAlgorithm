package codingtestDevMatching;

public class Solution03 {
    public static int solution(int N, int[][] L) {
        int answer = 1;
        if (!checkSquare(L)) {
            return 0;
        }
        return answer;
    }
    public static boolean checkSquare(int[][] square){
        for (int i = 0 ; i < square.length-1 ; i++) {
            int[] tempArr = squareIndex(square[i]);
            int top = tempArr[0];
            int bottom = tempArr[1];
            int left = tempArr[2];
            int right = tempArr[3];
            for (int j = i+1 ; j < square.length ; j++) {
                int[] checkArr = squareIndex(square[j]);
                int checkTop = checkArr[0];
                int checkBottom = checkArr[1];
                int checkLeft = checkArr[2];
                int checkRight = checkArr[3];
                if (checkOverLap(top,checkTop,bottom,checkBottom)) {
                    if (checkOverLap(left,checkLeft,right,checkRight)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
    public static int[] squareIndex(int[] square) {
        int[] indexArr = new int[4];
        indexArr[0] = Math.max(square[1],square[3]);
        indexArr[1] = Math.min(square[1],square[3]);
        indexArr[2] = Math.min(square[0],square[2]);
        indexArr[3] = Math.max(square[0],square[2]);

        return indexArr;
    }
    public static boolean checkOverLap(int originA, int checkA, int originB, int checkB) {
        if (originA >=checkA && originB <= checkB) {
            return true;
        } else if (originA <=checkA && originB >= checkB) {
            return true;
        } else if (originA>=checkA && originA <= checkB) {
            return true;
        } else if (originB <=checkB && originB >=checkA) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] L = {{5,7,6,6},{3,9,5,4},{8,2,7,6}};

        System.out.println(solution(3,L));
    }
}

/*
N	L	return
3	[[5,7,6,6],[3,9,5,4],[8,2,7,6]]	1
예제 설명
주어진 라벨이 다음과 같을때,

L1	L2	L3
[5,7,6,6]	[3,9,5,4]	[8,2,7,6]
L1과 L2는 서로 겹치고, L3는 겹치는 마크가 없는 상태이다. 3개의 마크가 겹치지 않는 조건을 위해서 회피할 수 있는 방법은 다음과 같다.

L1을 -X축으로 1번 이동하는 방법
L2를 +Y축, +X축으로 2번 이동하는 방법
L3를 +X축으로 1번 이동하고, L2를 +X축으로 1번 이동하는 방법
3가지 방법에서 최소 이동 횟수는 1이다.


 */