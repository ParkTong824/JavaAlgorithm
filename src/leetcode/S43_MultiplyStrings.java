package leetcode;

import java.math.BigInteger;

public class S43_MultiplyStrings {
    public static void main(String[] args) {
        char a = '6';
        char b = '3';

        System.out.println(a*b);
    }
    public String multiply(String num1, String num2) {
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        return String.valueOf(n1.multiply(n2));
    }
}
/*
Input: num1 = "2", num2 = "3"
Output: "6"

Input: num1 = "123", num2 = "456"
Output: "56088"
 */