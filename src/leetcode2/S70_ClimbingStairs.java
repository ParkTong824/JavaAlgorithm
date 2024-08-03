package leetcode2;

public class S70_ClimbingStairs {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(climbStairs(n));
    }
    public static int climbStairs(int n) {
        double sqrt = Math.sqrt(5);
        return (int) ( ( Math.pow( (1+sqrt)/ 2, n+1) - Math.pow((1-sqrt)/ 2, n+1) ) / sqrt );
    }
}
/*
3
1 2 3
0 1 2 3  4   5    6     7      8
1 1 2 3  5   8   13    17     23
x 0 1  3   6   10    15     21
  0 1 12 123 1234 12345 123456
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
10

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
11

4  =>  5
1 1 1 1
2 1 1
1 2 1
1 1 2
2 2
100

5  => 8
1 1 1 1 1
1 1 1 2
1 1 2 1
1 2 1 1
2 1 1 1
2 2 1
2 1 2
1 2 2

6 => 12
1 1 1 1 1 1
1 1 1 1 2
1 1 1 2 1
1 1 2 1 1
1 2 1 1 1
2 1 1 1 1
1 1 2 2
1 2 1 2
2 1 1 2
1 2 2 1
2 1 2 1
2 2 1 1
1 <= n <= 45
 */