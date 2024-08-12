package leetcode3;

public class S125_ValidPalindrome {
    public static boolean isPalindrome(String s) {
        char[] charArr = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "").toCharArray();
        for (int i = 0 ; i < charArr.length ; i++) {
            if (charArr[i] != charArr[charArr.length-1-i]) {
                return false;
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
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
 removing all non-alphanumeric characters, it reads the same forward and backward.
 Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
 */