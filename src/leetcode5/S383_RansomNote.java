package leetcode5;

import java.util.HashMap;
import java.util.Map;

public class S383_RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> magazineMap = new HashMap<>();
        for (int i = 0 ; i < magazine.length() ; i++) {
            if (magazineMap.containsKey(magazine.charAt(i))) {
                magazineMap.put(magazine.charAt(i),magazineMap.get(magazine.charAt(i))+1);
            } else {
                magazineMap.put(magazine.charAt(i),1);
            }
        }
        for (int i = 0 ; i < ransomNote.length() ; i++) {
            if (!magazineMap.containsKey(ransomNote.charAt(i))){
                return false;
            } else {
                if (magazineMap.get(ransomNote.charAt(i))>0){
                    magazineMap.put(ransomNote.charAt(i),magazineMap.get(ransomNote.charAt(i))-1);
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String a = "a";
        String b = "b";

        System.out.println();
    }
}
/*
Input: ransomNote = "a", magazine = "b"
Output: false

Input: ransomNote = "aa", magazine = "ab"
Output: false

Input: ransomNote = "aa", magazine = "aab"
Output: true
 */