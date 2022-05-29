package leetcode6;

public class S557_ReverseWords {
    public static void main(String[] args) {
        String test = "Let's take LeetCode contest";
        System.out.println(reverseWords(test));
    }
    public static String reverseWords(String s) {
        String[] splitArr = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0 ; i < splitArr.length ; i++) {
            char[] tempArr = splitArr[i].toCharArray();
            for (int j = tempArr.length-1 ; j >=0 ; j--) {
                result.append(tempArr[j]);
            }
            if (i != splitArr.length-1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
/*
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Input: s = "God Ding"
Output: "doG gniD"
 */