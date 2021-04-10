package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S17_LetterCombination {
    public static void main(String[] args) {
        String digits = "";
        List<String> answer = letterCombinations(digits);
        System.out.println(answer.toString());
    }
    public static List<String> letterCombinations(String digits) {
        if (digits ==""){
            return new ArrayList<>();
        }
        String[] combinationArr = stringBuild(new String[]{},digits);
        List<String> answer = Arrays.asList(combinationArr);

        return answer;
    }
    public static String[] stringBuild(String[] digitArr, String digits){
        int digit = (Integer.parseInt(String.valueOf(digits.charAt(0)))-2)*3;
        String[] newDigitArr;
        if (digitArr.length==0){
            newDigitArr = new String[]{
                    Character.toString(97 + digit),
                    Character.toString(97 + digit+1),
                    Character.toString(97 + digit+2)
            };
        } else{
            newDigitArr = new String[digitArr.length*3];
        }

        int newArrIndex = 0;
        for (int i = 0 ; i < digitArr.length ; i++){
            newDigitArr[newArrIndex++]=digitArr[i]+(char)(97+digit);
            newDigitArr[newArrIndex++]=digitArr[i]+(char)(97+digit+1);
            newDigitArr[newArrIndex++]=digitArr[i]+(char)(97+digit+2);
        }

        if (digits.length()>1) {
            newDigitArr = stringBuild(newDigitArr, digits.substring(1,digits.length()));
        }

        return newDigitArr;
    }
}
/*
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

Input: digits = ""
Output: []

Input: digits = "2"
Output: ["a","b","c"]
 */
