package programmersLevel0;

public class Solution49 {
    public int solution(int[][] dots) {
        int xLength = 0;
        int yLength = 0;
        int[] checkDot = dots[0];
        for (int i = 1 ; i < dots.length ; i++) {
            if (xLength == 0 && checkDot[0] != dots[i][0]) {
                xLength = Math.abs(checkDot[0] - dots[i][0]);
            }
            if (yLength == 0 && checkDot[1] != dots[i][1]) {
                yLength = Math.abs(checkDot[1] - dots[i][1]);
            }
            if (xLength != 0 && yLength != 0) {
                break;
            }
        }

        return xLength * yLength;
    }
}
