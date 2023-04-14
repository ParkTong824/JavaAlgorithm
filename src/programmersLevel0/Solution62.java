package programmersLevel0;

public class Solution62 {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int yIndex = 0;
        int xIndex = 0;
        for (int i = 0 ; i < num_list.length; i++) {
            answer[yIndex][xIndex] = num_list[i];
            xIndex++;
            if (xIndex == n) {
                xIndex = 0;
                yIndex++;
            }
        }
        return answer;
    }
}
