package leetcode;

public class Solution05LongestPalindromic {
    public static String longestPalindrome(String s) {
        String[] sArr = s.split("");
        String answer = "";
        int[] longestArr = new int[3];
        for (int i = 0 ; i < sArr.length ; i++){
            for (int j = sArr.length-1 ; j>i ; j--){
                if (j-i<=longestArr[0]){
                    break;
                }
                boolean isPalind = true;
                int head = i;
                int tail = j;
                while (isPalind){
                    if (sArr[head].equals(sArr[tail])){
                        head++;
                        tail--;
                    }else {
                        break;
                    }

                    if (head>=tail){
                        if (longestArr[0]<j-i){
                            longestArr[0] = j-i;
                            longestArr[1] = i;
                            longestArr[2] = j;
                        }
                        break;
                    }
                }

            }
        }
        for (int i = longestArr[1] ; i < longestArr[2]+1 ; i++){
            answer+=sArr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "cbbd";

        System.out.println(longestPalindrome(s));
    }
}
/*
Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.

Input: "cbbd"
Output: "bb"
 */