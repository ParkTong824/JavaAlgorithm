package leetcode5;

import java.util.HashMap;
import java.util.Map;

public class S409_LongestPalindrome {
    public int longestPalindrome(String s) {
        int answer = 0;
        Map<Character, Integer> map = new HashMap<>();
        boolean isSingle = false;
        for (char a : s.toCharArray()) {
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }
        for (char a : map.keySet()) {
            if (map.get(a) == 1) {
                isSingle = true;
            } else if (map.get(a) > 1) {
                answer += (map.get(a) / 2) * 2;
                if (!isSingle && map.get(a) % 2 == 1) {
                    isSingle = true;
                }
            }
        }

        if (isSingle) {
            answer++;
        }

        return answer;
    }
    public static void main(String[] args) {

    }
}
/*
Given a string s which consists of lowercase or uppercase letters, return the length of the longest
palindrome
 that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome.



Example 1:

Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
Example 2:

Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.
 */
