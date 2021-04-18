package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S22_GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        if (n == 0) {
            ans.add("");
        } else {
            for (int c = 0; c < n; ++c)
                for (String left: generateParenthesis(c))
                    for (String right: generateParenthesis(n-1-c))
                        ans.add("(" + left + ")" + right);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> answerList = generateParenthesis(n);
        System.out.println(answerList.toString());
    }
}

/*
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]

Input: n = 2
Output: ["()()","(())"]

Input: n = 1
Output: ["()"]
 */
