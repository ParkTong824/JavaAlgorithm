package leetcode2;

public class S97_InterleavingString {
    public static boolean isInterleave(String s1, String s2, String s3) {
        int firstIndex = 0;
        int secondIndex = 0;
        int resultIndex = 0;
        boolean result = true;
        for (int i = 0 ; i < s3.length() ; i++){
            if(firstIndex<s1.length() && s3.charAt(resultIndex)==s1.charAt(firstIndex)){
                firstIndex++;
                resultIndex++;
            } else if (secondIndex<s2.length() && s3.charAt(resultIndex)==s2.charAt(secondIndex)){
                secondIndex++;
                resultIndex++;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        System.out.println(isInterleave(s1,s2,s3));
    }
}
/*
Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
Output: true

Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"
Output: false

Input: s1 = "", s2 = "", s3 = ""
Output: true
 */