package leetcode5;

public class S374_GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        if (n == 1) {
            return 1;
        }
        int firstNum = 1;
        int secondNum = n;
        while (true) {
            int pivot = firstNum + (secondNum-firstNum)/2;
            int apiAnswer = guess(pivot);
            if (apiAnswer == 0) {
                return pivot;
            }

            if (pivot == firstNum) {
                pivot++;
            }

            if (apiAnswer == -1) {
                secondNum = pivot;
            } else {
                firstNum = pivot;
            }
        }
    }
    private int guess(int num) {
        return 0;
    }
}
/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */
/*
We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined API int guess(int num), which returns three possible results:

-1: Your guess is higher than the number I picked (i.e. num > pick).
1: Your guess is lower than the number I picked (i.e. num < pick).
0: your guess is equal to the number I picked (i.e. num == pick).
Return the number that I picked.



Example 1:

Input: n = 10, pick = 6
Output: 6
Example 2:

Input: n = 1, pick = 1
Output: 1
Example 3:

Input: n = 2, pick = 1
Output: 1

 */