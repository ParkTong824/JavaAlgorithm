package leetcode5;

import java.util.HashMap;
import java.util.Map;

public class S389_FindTheDifference {
    public static char findTheDifference(String s, String t) {
        if (s.length()==0) {
            return t.charAt(0);
        }
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0 ; i < s.length() ; i++) {
            if (sMap.containsKey(s.charAt(i))) {
                sMap.put(s.charAt(i), sMap.get(s.charAt(i))+1);
            } else {
                sMap.put(s.charAt(i),1);
            }
            if (tMap.containsKey(t.charAt(i))) {
                tMap.put(t.charAt(i), tMap.get(t.charAt(i))+1);
            } else {
                tMap.put(t.charAt(i),1);
            }
            if (i==s.length()-1){
                i++;
                if (tMap.containsKey(t.charAt(i))) {
                    tMap.put(t.charAt(i), tMap.get(t.charAt(i))+1);
                } else {
                    tMap.put(t.charAt(i),1);
                }
            }
        }
        for (char key : sMap.keySet()) {
            if (sMap.get(key)==tMap.get(key)) {
                tMap.remove(key);
            }
        }
        return tMap.keySet().stream().findFirst().get();
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";

        System.out.println(findTheDifference(s,t));
    }
}
/*
Input: s = "abcd", t = "abcde"
Output: "e"
Explanation: 'e' is the letter that was added.

Input: s = "", t = "y"
Output: "y"

Input: s = "a", t = "aa"
Output: "a"

Input: s = "ae", t = "aea"
Output: "a"
 */
