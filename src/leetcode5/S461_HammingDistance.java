package leetcode5;

public class S461_HammingDistance {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int answer = 0;

        for (int i = 0; i < 32; i++) {
            answer += (xor >> i) & 1;
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}
/*
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, return the Hamming distance between them.



Example 1:

Input: x = 1, y = 4
Output: 2
Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
The above arrows point to positions where the corresponding bits are different.
Example 2:

Input: x = 3, y = 1
Output: 1

 */