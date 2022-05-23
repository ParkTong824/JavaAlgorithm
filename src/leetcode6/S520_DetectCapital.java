package leetcode6;

public class S520_DetectCapital {
    public static void main(String[] args) {
        String test = "Leetcode";
        System.out.println(detectCapitalUse(test));
    }
    public static boolean detectCapitalUse(String word) {
        if (word.length()<=1) {
            return true;
        }
        char[] splitArr = word.toCharArray();
        boolean isUpper = false;
        for (int i = 0 ; i < splitArr.length ; i++) {
            boolean temp = checkUpperClass(splitArr[i]);
            if (i == 0) {
                isUpper = temp;
            } else {
                if (isUpper != temp) {
                    if (i == 1 && isUpper == true) {
                        isUpper = temp;
                    } else {
                        return false;
                    }
                }

                if (i == splitArr.length-1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkUpperClass(char check) {
        if (check >= 'a' && check <= 'z') {
            return false;
        } else {
            return true;
        }
    }
}
/*
Input: word = "USA"
Output: true

Input: word = "FlaG"
Output: false
 */