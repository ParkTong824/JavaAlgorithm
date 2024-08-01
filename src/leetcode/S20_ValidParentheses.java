package leetcode;

import java.util.Stack;

public class S20_ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char pop = stack.pop();
                switch (c) {
                    case ')':
                        if (pop != '(') {
                            return false;
                        }
                        break;
                    case '}':
                        if (pop != '{') {
                            return false;
                        }
                        break;
                    case ']':
                        if (pop != '[') {
                            return false;
                        }
                        break;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

}

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Input: s = "()"
Output: true

Input: s = "()[]{}"
Output: true

Input: s = "(]"
Output: false

Input: s = "([])"
Output: true



Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 */