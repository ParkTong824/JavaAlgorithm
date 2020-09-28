package leetcode;

import java.util.HashSet;

public class Solution03LongestLengthSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int answer = 0;
        int length = 0;
        String[] stringArr = s.split("");
        if (s.equals("")){
            return 0;
        }
        HashSet<String> stringSet = new HashSet<>();
        for (int i = 0 ; i < stringArr.length ; i++){
            for (int j = i ; j < stringArr.length ; j++ ){
                String iString = stringArr[j];
                if (!stringSet.add(iString)){
                    if (answer<length){
                        answer=length;
                    }
                    length = 0;
                    stringSet= new HashSet<>();
                    break;
                }else {
                    length++;
                    if (answer<length){
                        answer=length;
                    }
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        String s = " ";

        System.out.println(lengthOfLongestSubstring(s));
    }
}

/*
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
 */