package programmersLevel0;

public class Solution44 {
    int[][] answerBoard;
    public int solution(int[][] board) {
        int answer = 0;
        if (board.length == 1 ) {
            if (board[0][0] == 1) {
                return 0;
            } else {
                return 1;
            }
        }
        answerBoard = new int[board.length][board[0].length];
        int minusAnswer = 0;
        for (int i = 0 ; i < board.length ; i++) {
            for (int j = 0 ; j < board[0].length ; j++) {
                if (board[i][j] == 1) {
                    int[] isPossibleArr = new int[]{0,0};
                    if (i-1 < 0) {
                        isPossibleArr[0] = -1;
                    } else if (i+1 == board.length) {
                        isPossibleArr[0] = 1;
                    }
                    if (j-1 < 0) {
                        isPossibleArr[1] = -1;
                    } else if (j+1 == board[i].length) {
                        isPossibleArr[1] = 1;
                    }
                    int[] possibleHorizon = checkPossible(isPossibleArr[0], i);
                    int[] possibleVertical = checkPossible(isPossibleArr[1], j);
                    indicateDangerArea(possibleHorizon, possibleVertical);
                }
            }
        }
        for (int i = 0 ; i < board.length ; i++) {
            for (int j = 0 ; j < board[0].length ; j++) {
                if (answerBoard[i][j] == 0 ){
                    answer++;
                }
            }
        }
        return answer;
    }
    public int[] checkPossible(int possibleCheck, int index){
        switch (possibleCheck) {
            case -1:
                return new int[]{index,index+1};
            case 1:
                return new int[]{index-1, index};
            case 0:
            default:
                return new int[]{index-1, index, index+1};
        }
    }
    public void indicateDangerArea(int[] possibleHorizon, int[] possibleVertical) {
        for (int horizon : possibleHorizon) {
            for (int vertical : possibleVertical) {
                answerBoard[horizon][vertical] = 1;
            }
        }
    }
}
