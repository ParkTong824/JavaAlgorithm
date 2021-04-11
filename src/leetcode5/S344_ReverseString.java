package leetcode5;

import java.util.Arrays;

public class S344_ReverseString {
    public static void reverseString(char[] s) {
        int arrMaxIndex = s.length-1;
        char[] tempArr = new char[s.length];
        for (int i = 0 ; i < s.length ; i++) {
            tempArr[i] = s[arrMaxIndex-i];
            tempArr[arrMaxIndex-i] = s[i];
        }
        s = tempArr;
        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);

    }
}
