package programmersLevel0;

public class Solution44 {
    public int solution(int[][] board) {
        int answer = 0;
        int minusAnswer = 0;
        for (int i = 0 ; i < board.length ; i++) {
            for (int j = 0 ; j < board[0].length ; j++) {
                if (board[i][j] == 1) {
                    int isPossible = 0;
                    if (i-1 < 0) {
                        isPossible++;
                    } else if (i+1 == board.length) {
                        isPossible++;
                    }
                    if (j-1 < 0) {
                        isPossible++;
                    } else if (j+1 == board[i].length) {
                        isPossible++;
                    }
                    switch (isPossible) {
                        case 0:
                            minusAnswer+=8;
                            break;
                        case 1:
                            minusAnswer+=5;
                            break;
                        case 2:
                            minusAnswer+=3;
                            break;
                    }
                }
            }
        }
        return answer;
    }
}
