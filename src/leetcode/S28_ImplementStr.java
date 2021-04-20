package leetcode;

public class S28_ImplementStr {
    public static int strStr(String haystack, String needle) {
        int answerIndex = 0;
        char[] hayArr = haystack.toCharArray();
        char[] neeArr = needle.toCharArray();
        if (neeArr.length==0){
            return 0;
        } else if (neeArr.length > hayArr.length){
            return -1;
        } else {
            while (hayArr.length-answerIndex>=neeArr.length) {
                if (hayArr[answerIndex]==neeArr[0]) {
                    int index = answerIndex;
                    for (int i = 0 ; i < neeArr.length ; i++) {
                        if(hayArr[index]==neeArr[i]){
                            if (i==neeArr.length-1){
                                return answerIndex;
                            }
                            index++;
                            continue;
                        }else {
                            break;
                        }
                    }
                }
                answerIndex++;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String a = "abcd";
        String b = "a";
        System.out.println(strStr(a,b));
    }
}
/*
return haystack.indexOf(needle);

Input: haystack = "hello", needle = "ll"
Output: 2

Input: haystack = "aaaaa", needle = "bba"
Output: -1

Input: haystack = "", needle = ""
Output: 0
 */
