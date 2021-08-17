package leetcode3;

public class S125_ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int front = 0;
        int tail = s.length()-1;
        s = s.toLowerCase();
        while (front<tail){
            boolean isAlpha = false;
            if (isChar(s,front)){
                front++;
                isAlpha=true;
            }
            if (isChar(s,tail)){
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

    public static boolean isChar(String s , int index){
        boolean isNotChar = false;
        if(!(s.charAt(index)>='a' && s.charAt(index)<='z')){
            isNotChar = true;
        }else {
            return false;
        }
        if (!(s.charAt(index)>='A' && s.charAt(index)<='Z')){
            isNotChar = true;
        }else {
            return false;
        }
        if (!(s.charAt(index)>='0' && s.charAt(index)<='9')){
            isNotChar = true;
        }else {
            return false;
        }

        return isNotChar;
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