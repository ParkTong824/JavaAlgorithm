package leetcode5;

public class S205_IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        boolean sIs = false;
        boolean tIs = false;
        for (int i = 1 ; i < s.length() ; i++){
            if (s.charAt(i)==s.charAt(i-1)){
                sIs = true;
            }
            if (t.charAt(i)==t.charAt(i-1)){
                tIs = true;
            }
        }
        return sIs==tIs;
    }
}

/*
Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true
 */
