package leetcode;

import java.util.HashSet;
import java.util.Set;

public class S36_ValidSudoku {
    public static void main(String[] args) {
        char[][] board =   {{'.','.','.','.','.','.','.','.','2'},
                            {'.','.','.','.','.','.','6','.','.'},
                            {'.','.','1','4','.','.','8','.','.'},
                            {'.','.','.','.','.','.','.','.','.'},
                            {'.','.','.','.','.','.','.','.','.'},
                            {'.','.','.','.','3','.','.','.','.'},
                            {'5','.','8','6','.','.','.','.','.'},
                            {'.','9','.','.','.','.','4','.','.'},
                            {'.','.','.','.','5','.','.','.','.'}};

        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        Set<Character> checkSet1 = new HashSet<>();
        Set<Character> checkSet2 = new HashSet<>();
        boolean isRight = true;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (!checkSet1.add(board[i][j])) {
                        return isRight = false;
                    }
                }
                if (board[j][i] != '.') {
                    if (!checkSet2.add(board[j][i])) {
                        return isRight = false;
                    }
                }
            }
            checkSet1.clear();
            checkSet2.clear();
        }
        checkSet1.clear();
        checkSet2.clear();
        for (int i = 0; i < 9; i++) {
            if (board[i][i] != '.') {
                if (!checkSet1.add(board[i][i])) {
                    return isRight = false;
                }
            }
            if (board[i][8 - i] != '.') {
                if (!checkSet2.add(board[i][8 - i])) {
                    return isRight = false;
                }
            }
        }

        return isRight;
    }
}
/*

 */