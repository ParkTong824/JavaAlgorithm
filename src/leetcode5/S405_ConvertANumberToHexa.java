package leetcode5;

public class S405_ConvertANumberToHexa {
    public static void main(String[] args) {
    }
    public String toHex(int num) {
        if (num == 0) return "0";

        StringBuilder sb = new StringBuilder();

        while(num != 0) {

            int hexDigit = num & 0xF;

            if (hexDigit < 10)  sb.append(hexDigit);
            else    sb.append((char)('a' + hexDigit - 10));

            num = num >>> 4;
        }

        return sb.reverse().toString();
    }
}
/*
Given a 32-bit integer num, return a string representing its hexadecimal representation. For negative integers, two’s complement method is used.

All the letters in the answer string should be lowercase characters, and there should not be any leading zeros in the answer except for the zero itself.

Note: You are not allowed to use any built-in library method to directly solve this problem.



Example 1:

Input: num = 26
Output: "1a"
Example 2:

Input: num = -1
Output: "ffffffff"

 */
