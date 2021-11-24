package leetcode5;

public class S459_RepeatedSubstring {
    public boolean repeatedSubstringPattern(String s) {
        int start = 0;
        String substr = s.substring(start, start + 1);
        int copy = 0;
        int end = 1;

        while (end < s.length()) {
            if (s.length() % substr.length() != 0) {
                copy = 0;
                substr = s.substring(start, end + 1);
                end++;
            } else {
                if (substr.equals(s.substring(end, end + substr.length()))) {
                    copy++;
                    end += substr.length();
                } else {
                    substr = s.substring(start, end + 1);
                    copy = 0;
                    end++;
                }
            }
        }

        return copy != 0;
    }

    public static void main(String[] args) {

    }
}
/*
Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.

Input: s = "aba"
Output: false

Input: s = "abcabcabcabc"
Output: true
Explanation: It is the substring "abc" four times or the substring "abcabc" twice.
 */