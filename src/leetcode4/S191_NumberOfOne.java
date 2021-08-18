package leetcode4;

public class S191_NumberOfOne {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int answer = 0;
        int isOne = 1;
        for (int i = 0 ; i < 32 ; i++){
            if ((n & isOne) == 1){
                answer++;
            }
            n>>>=1;
        }
        return answer;
    }
}
/*
Input: n = 00000000000000000000000000001011
Output: 3

Input: n = 00000000000000000000000010000000
Output: 1

Input: n = 11111111111111111111111111111101
Output: 31
 */