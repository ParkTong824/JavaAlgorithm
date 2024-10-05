package leetcode5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class S345_ReverseVowels {
    public static String reverseVowels(String s) {
        int frontPivot = 0;
        int backPivot = s.length()-1;
        char[] reverseRequiredArr = {'A','E','I','O','U','a','e','i','o','u'};
        boolean isFront = false;
        boolean isBack = false;
        StringBuilder answer = new StringBuilder(s);
        while (frontPivot < backPivot) {
            if (!isFront && Arrays.binarySearch(reverseRequiredArr, s.charAt(frontPivot))<0) {
                frontPivot++;
            } else {
                isFront = true;
            }

            if (!isBack && Arrays.binarySearch(reverseRequiredArr, s.charAt(backPivot))<0) {
                backPivot--;
            } else {
                isBack = true;
            }

            if (isFront && isBack) {
                char temp = s.charAt(frontPivot);
                answer.setCharAt(frontPivot, s.charAt(backPivot));
                answer.setCharAt(backPivot, temp);
                isFront = false;
                isBack = false;
                frontPivot++;
                backPivot--;
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        String s = "IceCreAm";

//        System.out.println(Arrays.binarySearch(reverseRequiredArr, s.charAt(0)));
//        System.out.println(reverseVowels(s));
    }

}
/*
Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Input: s = "IceCreAm"
Output: "AceCreIm"

Explanation:
The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Input: s = "leetcode"
Output: "leotcede"



Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.
 */