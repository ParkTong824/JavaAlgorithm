package leetcode2;

public class S70_ClimbingStairs {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(climbStairs(n));
    }
    public static int climbStairs(int n) {
        return climbStair(0,n);
    }
    public static int climbStair(int i, int n){
        if (i > n){
            return 0;
        }
        if (i == n){
            return 1;
        }
        return climbStair(i+1,n)+climbStair(i+2,n);
    }
}
/*
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

4  =>  5
1 1 1 1
2 1 1
1 2 1
1 1 2
2 2

5  => 8
1 1 1 1 1
1 1 1 2
1 1 2 1
1 2 1 1
2 1 1 1
2 2 1
2 1 2
1 2 2

1 <= n <= 45
 */