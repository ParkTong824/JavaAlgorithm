package leetcode3;

public class S125_ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int front = 0;
        int tail = s.length()-1;
        s = s.toLowerCase();
        while (front<tail){
            boolean isAlpha = false;
            if (s.charAt(front)<'a' || s.charAt(front)>'z'){
                front++;
                isAlpha=true;
            }
            if (s.charAt(tail)<'a' || s.charAt(tail)>'z'){
                tail--;
                isAlpha=true;
            }
            if(isAlpha){
                continue;
            }
            if(s.charAt(front)!=s.charAt(tail)){
                return false;
            } else {
                front++;
                tail--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }
}
/*
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
 */