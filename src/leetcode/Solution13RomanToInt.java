package leetcode;

import java.awt.print.Pageable;

public class Solution13RomanToInt {
    public static int romanToInt(String s) {
        int answer = 0 ;
        String[] sArr = s.split("");
        for (int i = 0 ; i < sArr.length ; i++){
            if (sArr[i].equals("M")){
                answer+=1000;
            }else if (sArr[i].equals("D")){
                answer+=500;
            }else if (sArr[i].equals("C")){
                if (i+1<sArr.length&&sArr[i+1].equals("M")){
                    answer+=900;
                    i++;
                }else if (i+1<sArr.length&&sArr[i+1].equals("D")){
                    answer+=400;
                    i++;
                }else {
                    answer+=100;
                }
            }else if (sArr[i].equals("L")){
                answer+=50;
            }else if (sArr[i].equals("X")){
                if (i+1<sArr.length&&sArr[i+1].equals("C")){
                    answer+=90;
                    i++;
                }else if (i+1<sArr.length&&sArr[i+1].equals("L")){
                    answer+=40;
                    i++;
                }else {
                    answer+=10;
                }
            }else if (sArr[i].equals("V")){
                answer+=5;
            }else {
                if (i+1<sArr.length&&sArr[i+1].equals("X")){
                    answer+=9;
                    i++;
                }else if (i+1<sArr.length&&sArr[i+1].equals("V")){
                    answer+=4;
                    i++;
                }else {
                    answer+=1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";

        System.out.println(romanToInt(s));
    }
}
/*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
Input: "MCMXCIV"
Output: 1994
 */
