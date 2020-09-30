package leetcode;

import java.awt.print.Pageable;

public class Solution12IntToRoman {
    public static String intToRoman(int num) {
        String answer = "";
        int remain = num;
        int result = 0;
        while (remain>0){
            if (remain>=1000){
                result= remain/1000;
                for (int i = 0 ; i < result ; i++){
                    answer+="M";
                }
                remain=remain%1000;

            }else if (remain>=500){
                if (remain>=900){
                    remain=remain%900;
                    answer+="CM";
                }else {
                    remain=remain%500;
                    answer+="D";
                }
            }else if (remain>=100){
                if (remain>=400){
                    remain=remain%400;
                    answer+="CD";
                }else {
                    result = remain/100;
                    for (int i = 0 ; i < result ; i++){
                        answer+="C";
                    }
                    remain = remain%100;
                }
            }else if (remain>=50){
                if (remain>=90){
                    remain=remain%90;
                    answer+="XC";
                }else {
                    remain = remain%50;
                    answer += "L";
                }
            }else if (remain>=10){
                if (remain>=40){
                    remain=remain%40;
                    answer+="XL";
                }else{
                    result = remain/10;
                    for (int i = 0 ; i < result ; i++){
                        answer+="X";
                    }
                    remain=remain%10;
                }
            }else if (remain>=5){
                if (remain==9){
                    answer+="IX";
                    break;
                }else {
                    remain=remain-5;
                    answer+="V";
                }
            }else {
                if (remain==4){
                    answer+="IV";
                    break;
                }else {
                    for (int i = 0 ; i < remain ; i++){
                        answer+="I";
                    }
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int input = 9;

        System.out.println(intToRoman(input));
    }
}
/*
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
Input: 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.

Input: 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */