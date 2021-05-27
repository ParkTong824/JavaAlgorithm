package leetcode2;

public class S59_SpiralMatrix2 {
    public static void main(String[] args) {
        int n = 3;
        generateMatrix(n);
    }
    public static int[][] generateMatrix(int n) {
        int[][] answer = new int[n][n];
        int currentVer = 0;
        int currentHor = 0;
        int remain = n;
        int nowNum = 1;
        boolean isUp = false;
        boolean isLeft = false;
        while (remain>0){
            if (remain==n){
                for (int i = 0 ; i < remain ; i++){
                    answer[currentHor][currentVer]=nowNum;
                    currentVer++;
                    nowNum++;
                }
                currentVer--;
                currentHor++;
                remain--;
                isLeft=true;
            } else {
                for (int i = 0 ; i < remain ; i++){
                    answer[currentHor][currentVer]=nowNum;
                    nowNum++;
                    if(isUp && i<remain-1){
                        currentHor--;
                    } else if(!isUp && i<remain-1) {
                        currentHor++;
                    }
                }

                isUp=!isUp;
                if (isLeft){
                    currentVer--;
                } else {
                    currentVer++;
                }
                for (int i = 0 ; i < remain ; i++){
                    answer[currentHor][currentVer]=nowNum;
                    nowNum++;
                    if (isLeft && i<remain-1){
                        currentVer--;
                    } else if(!isLeft && i<remain-1) {
                        currentVer++;
                    }
                }
                if(isUp){
                    currentHor--;
                } else {
                    currentHor++;
                }
                remain--;
                isLeft=!isLeft;
            }
        }
        return answer;
    }

}
/*
Input: n = 3
Output: [[1,2,3],[8,9,4],[7,6,5]]

Input: n = 1
Output: [[1]]
 */