package leetcode5;

public class S342_PowerOfFour {
    public static void main(String[] args) {

    }
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
        while (n>=1){
            if (n==1){
                return true;
            } else if (n%4!=0){
                return false;
            } else {
                n/=4;
            }
        }
        return false;
    }
}
/*
Input: n = 16
Output: true
Example 2:

Input: n = 5
Output: false
Example 3:

Input: n = 1
Output: true
 */