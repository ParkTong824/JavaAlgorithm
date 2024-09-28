package leetcode5;

import java.util.HashMap;
import java.util.Map;

public class S383_RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) {
            return false;
        }

        Map<Character,Integer> magazineMap = new HashMap<>();
        Map<Character,Integer> ransomMap = new HashMap<>();

        boolean isRansomFinish = false;

        for (int i = 0 ; i < magazine.length() ; i++) {
            char c = magazine.charAt(i);
            if (!magazineMap.containsKey(c)) {
                magazineMap.put(c,1);
            } else {
                magazineMap.put(c,magazineMap.get(c)+1);
            }
            if (!isRansomFinish) {
                char r = ransomNote.charAt(i);
                if (!ransomMap.containsKey(r)) {
                    ransomMap.put(r,1);
                } else {
                    ransomMap.put(r,ransomMap.get(r)+1);
                }

                if (i+1 == ransomNote.length()) {
                    isRansomFinish = true;
                }
            }
        }
        for (char c : ransomMap.keySet()) {
            if (!(magazineMap.containsKey(c) && ransomMap.get(c) <= magazineMap.get(c))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String a = "a";
        String b = "b";

        System.out.println();
    }
}
/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
 */