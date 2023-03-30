package programmersLevel0;

public class Solution48 {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        for (String keyword : keyinput) {
            switch (keyword) {
                case "left":
                    if (answer[0] > board[0]/-2) {
                        answer[0]--;
                    }
                    break;
                case "right":
                    if (answer[0] < board[0]/2) {
                        answer[0]++;
                    }
                    break;
                case "up":
                    if (answer[1] < board[1]/2) {
                        answer[1]++;
                    }
                    break;
                case "down":
                    if (answer[1] > board[1]/-2) {
                        answer[1]--;
                    }
                    break;
            }
        }
        return answer;
    }
}
