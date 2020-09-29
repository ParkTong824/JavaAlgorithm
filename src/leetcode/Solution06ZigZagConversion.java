package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution06ZigZagConversion {
    public static String convert(String s, int numRows) {
        List<List<String>> convertArr = new ArrayList<>();
        for (int i = 0 ; i < numRows ; i++){
            convertArr.add(i,new ArrayList<>());
        }
        String[] sArr = s.split("");
        String answer = "";
        int index = 0;
        int count = 0;
        while (index!=sArr.length){
            if (count==0){
                for (int i = 0 ; i < numRows ; i++){
                    if (index==sArr.length){
                        break;
                    }
                    convertArr.get(i).add(sArr[index]);
                    index++;
                }
                if (numRows==1){
                    count=0;
                }else {
                    count=numRows-2;
                }
            } else {
                convertArr.get(count).add(sArr[index]);
                count--;
                index++;
            }
        }

        for (int i = 0 ; i < numRows ; i++){
            for (int j = 0 ; j < convertArr.get(i).size() ; j++){
                answer+=convertArr.get(i).get(j);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "AB";

        System.out.println(convert(s,1));
    }
}
/*
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
P   A   H   N
A P L S I I G
Y   I   R

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
P     I    N
A   L S  I G
Y A   H R
P     I
 */