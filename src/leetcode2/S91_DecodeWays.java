package leetcode2;

public class S91_DecodeWays {
    public static void main(String[] args) {
        String s = "0";
        System.out.println(numDecodings(s));
    }
    public static int numDecodings(String s) {
        if (s.charAt(0)=='0'){
            return 0;
        }
        int result = decodeReculsive(s);

        return result;
    }
    public static int decodeReculsive(String s){
        int result = 0;
        if (s.length()<=1){
            return 1;
        }
        if (s.charAt(0)=='1'||s.charAt(0)=='2'){
            result+=decodeReculsive(s.substring(1));
            if (s.charAt(1)<'7'){
                result+=decodeReculsive(s.substring(2));
            }
        } else {
            result+=decodeReculsive(s.substring(1));
        }

        return result;
    }
}
/*
Input: s = "12"
Output: 2
Explanation: "12" could be decoded as "AB" (1 2) or "L" (12).

Input: s = "226"
Output: 3
Explanation: "226" could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).

Input: s = "0"
Output: 0
Explanation: There is no character that is mapped to a number starting with 0.
The only valid mappings with 0 are 'J' -> "10" and 'T' -> "20", neither of which start with 0.
Hence, there are no valid ways to decode this since all digits need to be mapped.

Input: s = "06"
Output: 0
Explanation: "06" cannot be mapped to "F" because of the leading zero ("6" is different from "06").
 */
