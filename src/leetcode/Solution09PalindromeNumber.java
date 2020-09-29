package leetcode;

public class Solution09PalindromeNumber {
    public boolean isPalindrome(int x) {

        if (x<0){
            return false;
        } else if (x==0) {
            return true;
        }
        int reverseNum = 0;
        int num = 0;
        int originNum = x;
        while (originNum>0){
            num = originNum%10;
            originNum = originNum/10;
            reverseNum = reverseNum*10 + num;
        }

        return reverseNum==x;
    }

    public static void main(String[] args) {

    }
}
