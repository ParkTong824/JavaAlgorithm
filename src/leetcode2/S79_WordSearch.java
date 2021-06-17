package leetcode2;

public class S79_WordSearch {
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";

        System.out.println(exist(board,word));
    }
    public static boolean exist(char[][] board, String word) {
        char[] wordArr = word.toCharArray();
        for (int i = 0; i < board.length ; i++){
            for (int j = 0 ; j < board[0].length ; j++){
                if (board[i][j]==wordArr[0]){
                    int iIndex = i;
                    int jIndex = j;
                    boolean isFinish = false;
                    for (int k = 0 ; k < wordArr.length ; k++){
                        if (isExist(board,wordArr,iIndex,jIndex,k)){
                            if (k==wordArr.length-1){
                                isFinish=true;
                            }
                            continue;
                        }else {
                            break;
                        }
                    }
                    if (isFinish){
                        return true;
                    }
                }
            }
        }

        return false;
    }
    public static boolean isExist(char[][] board,char[] wordArr, int iIndex, int jIndex, int k){
        if (iIndex-1>=0){
            if (board[iIndex-1][jIndex]==wordArr[k]){
                iIndex--;
                board[iIndex-1][jIndex]=0;
                return true;
            }
        }
        if (iIndex+1!=board.length){
            if (board[iIndex+1][jIndex]==wordArr[k]){
                iIndex--;
                board[iIndex+1][jIndex]=0;
                return true;
            }
        }
        if (jIndex-1>=0){
            if (board[iIndex][jIndex-1]==wordArr[k]){
                jIndex--;
                board[iIndex][jIndex-1]=0;
                return true;
            }
        }
        if (jIndex+1!=board.length){
            if (board[iIndex][jIndex+1]==wordArr[k]){
                jIndex++;
                board[iIndex][jIndex+1]=0;
                return true;
            }
        }
        return false;
    }

}
/*
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true

Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
Output: true

Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
Output: false
 */