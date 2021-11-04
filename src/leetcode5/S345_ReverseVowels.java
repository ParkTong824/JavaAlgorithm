package leetcode5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class S345_ReverseVowels {
    public static String reverseVowels(String s) {
        char[] sArr = s.toCharArray();
        int head = 0;
        int tail = sArr.length-1;
        Set<Character> vowelSet = new HashSet<>();
        vowelSet.add('i');
        vowelSet.add('a');
        vowelSet.add('e');
        vowelSet.add('o');
        vowelSet.add('u');
        boolean front = false;
        boolean back = false;
        while (head<tail) {
            if (vowelSet.contains(sArr[head])){
                front=true;
            } else {
                head++;
            }
            if (vowelSet.contains(sArr[tail])){
                back=true;
            } else {
                tail--;
            }
            if (front&&back){
                char temp = sArr[head];
                sArr[head] = sArr[tail];
                sArr[tail] = temp;
                head++;
                tail--;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0 ; i < sArr.length ; i++) {
            stringBuilder.append(sArr[i]);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }

}
/*
Input: s = "hello"
Output: "holle"

Input: s = "leetcode"
Output: "leotcede"
 */