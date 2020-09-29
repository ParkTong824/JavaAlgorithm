package leetcode;

public class Solution07ReverseInteger {
    public static int reverse(int x) {
        boolean isMinus = false;
        int res=0;
        int surplus;
        if (x<0) {
            isMinus = true;
            x = -(x);
        }
        do {
            surplus = x%10;
            if (res > Integer.MAX_VALUE/10 || surplus == -8) return 0;
            res = res*10 + surplus;
            x = x/10;
        } while (x>0);

        return (isMinus? -(res) : res);
    }

    public static void main(String[] args) {
        int s = 1253423649;

        System.out.println(reverse(s));
    }
}
/*
Input: 123
Output: 321

Input: -123
Output: -321

Input: 120
Output: 21
 */