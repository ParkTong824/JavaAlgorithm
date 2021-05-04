package leetcode2;

public class S58_LengthOFLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        String[] sArr = s.split(" ");
        if (sArr.length==0){
            return 0;
        }
        return sArr[sArr.length-1].length();
    }
}
/*
Input: s = "Hello World"
Output: 5
Example 2:

Input: s = " "
Output: 0
 */
