package leetcode6;

public class S541_ReverseString2 {
    public String reverseStr(String s, int k) {
        StringBuilder str = new StringBuilder(s);

        for (int index = 0; index < s.length(); index += k << 1) {
            int leftIndex = index - 1, rightIndex = Math.min(index + k, s.length());

            while (++leftIndex < --rightIndex) {
                str.setCharAt(leftIndex, s.charAt(rightIndex));
                str.setCharAt(rightIndex, s.charAt(leftIndex));
            }
        }

        return str.toString();
    }
}

/*
Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.



Example 1:

Input: s = "abcdefg", k = 2
Output: "bacdfeg"


Example 2:

Input: s = "abcd", k = 2
Output: "bacd"


Constraints:

1 <= s.length <= 104
s consists of only lowercase English letters.
1 <= k <= 104
 */