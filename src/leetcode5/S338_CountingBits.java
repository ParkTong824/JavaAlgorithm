package leetcode5;

import java.util.Arrays;

public class S338_CountingBits {
    public static int[] countBits(int n) {
        int[] answer = new int[n+1];
        for(int i = 1; i <= n; i++){
            answer[i] = (i & 1) + answer[i/2];
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 32;
        System.out.println(Arrays.toString(countBits(n)));
    }
}
/*
Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n),
ans[i] is the number of 1's in the binary representation of i.

1
2 3
1 2

1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31
1 1 2 1 2 2 3 1 2  2  3  2  3  3  4  1  2  2  3  2  3  3  4  2  3  3  4  3  4  4  5

8 9 10 11 12 13 14 15
1 2 2 3 2 3 3 4
1000 1001 1010 1011 1100 1101 1110 1111
16 17 18 19
1 2 2 3
20 21 22 23
2 3 3 4
24 25 26 27
2 3 3 4
28 29 30 31
3 4 4 5
10000 10001 10010 10011 10100 10101 10110 10111 11000 11001 11010 11011 11100 11101 11110 11111

Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10
Example 2:

Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101
 */