package leetcode5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class S205_IsomorphicStrings {
    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";

        System.out.println(isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> keyMap = new HashMap<>();
        Map<Character, Character> valueMap = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0 ; i < chars.length ; i++) {
            char sChar = chars[i];
            char tChar = t.charAt(i);

            if (keyMap.containsKey(sChar)) {
                if (keyMap.get(sChar) != tChar ) {
                    return false;
                }
            } else if (valueMap.containsKey(tChar)) {
                if (valueMap.get(tChar) != sChar ) {
                    return false;
                }
            } else {
                keyMap.put(sChar, tChar);
                valueMap.put(tChar, sChar);
            }
        }

        return true;
    }
}

/*
"badc"
t =
"baba"
Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true
 */
