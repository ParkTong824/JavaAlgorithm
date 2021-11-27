package leetcode5;

public class S463_IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int answer = 0;
        for (int i = 0 ; i < grid.length ; i++) {
            for (int j = 0 ; j < grid[0].length ; j++) {
                if (grid[i][j]==1){
                    if (i-1<0) {
                        answer++;
                    } else {
                        if (grid[i-1][j]==0){
                            answer++;
                        }
                    }
                    if (i+1==grid.length) {
                        answer++;
                    } else {
                        if (grid[i+1][j]==0) {
                            answer++;
                        }
                    }
                    if (j-1<0) {
                        answer++;
                    } else {
                        if (grid[i][j-1]==0) {
                            answer++;
                        }
                    }
                    if (j+1==grid[i].length) {
                        answer++;
                    } else {
                        if (grid[i][j+1]==0) {
                            answer++;
                        }
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
