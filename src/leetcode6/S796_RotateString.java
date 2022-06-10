package leetcode6;

public class S796_RotateString {
    public static boolean rotateString(String s, String goal) {
        boolean result = true;
        int count = 0;
        char[] goalArr = goal.toCharArray();
        int checkIndex = 0;
        while (result && count<s.length()) {
            if (s.charAt(checkIndex) == goalArr[count]){
                count++;
            } else if (count != 0 && s.charAt(checkIndex) != goalArr[count]) {
                result = false;
            }
            checkIndex++;
            if (checkIndex==s.length()) {
                checkIndex = 0;
            }
        }

        return result;
    }

    public static void main(String[] args) {
            String s = "abcde";
            String goal = "abced";
            System.out.println(rotateString(s, goal));
    }
}
/*
Input: s = "abcde", goal = "cdeab"
Output: true

Input: s = "abcde", goal = "abced"
Output: false
 */