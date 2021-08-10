package leetcode2;

public class S63_UniquePaths2 {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int[][] checkArr = new int[obstacleGrid.length][obstacleGrid[0].length];
        boolean isEnd = false;
        if(obstacleGrid[0][0]==0) {
            checkArr[0][0] = 1;
        } else {
            return 0;
        }
        for (int i = 1 ; i < obstacleGrid.length ; i++){
            if (isEnd){
                checkArr[i][0]=0;
                continue;
            }
            if (obstacleGrid[i][0]!=1){
                checkArr[i][0]=1;
            } else {
                isEnd=true;
            }
        }
        isEnd = false;
        for (int i = 1 ; i < obstacleGrid[0].length ; i++) {
            if (isEnd){
                checkArr[0][i]=0;
                continue;
            }
            if (obstacleGrid[0][i]!=1){
                checkArr[0][i]=1;
            } else {
                isEnd=true;
            }
        }
        for (int i = 1 ; i < obstacleGrid.length ; i++) {
            for (int j = 1 ; j < obstacleGrid[i].length ; j++){
                if (obstacleGrid[i][j]==0){
                    checkArr[i][j] = checkArr[i][j-1]+checkArr[i-1][j];
                }
            }
        }
        return checkArr[checkArr.length-1][checkArr[0].length-1];
    }

    public static void main(String[] args) {
        int[][] obstacleGrid = {{0,1,0,0,0},{1,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }
}
/*
Input: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
Output: 2

Input: obstacleGrid = [[0,1],[0,0]]
Output: 1

[[0,1,0,0,0],[1,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0]]
10
 */