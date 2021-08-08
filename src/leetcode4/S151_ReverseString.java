package leetcode4;

import java.util.Arrays;

public class S151_ReverseString {
    public static String reverseWords(String s) {
        String[] splitArr = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = splitArr.length-1 ; i >=0 ; i--){
            if (!splitArr[i].equals("")){
                if (i< splitArr.length-1){
                    stringBuilder.append(" ");
                }
                stringBuilder.append(splitArr[i]);

            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = "  hello world  ";

        System.out.println(reverseWords(s));
    }
}
/*
Input: s = "the sky is blue"
Output: "blue is sky the"

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.

Input: s = "a good   example"
Output: "example good a"
 */