package leetcode5;

public class S392_IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.length()==0) {
            return true;
        }
        int checkIndex = 0;
        for (int i = 0 ; i < t.length(); i++) {
            if (s.charAt(checkIndex)==t.charAt(i)) {
                checkIndex++;
            }
            if (s.length()==checkIndex) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
/*
Input: s = "abc", t = "ahbgdc"
Output: true

Input: s = "axc", t = "ahbgdc"
Output: false
 */