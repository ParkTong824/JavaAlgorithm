package programmersLevel0;

import java.util.Stack;

public class Solution51 {
    public static int solution(String s) {
        int answer = 0;
        Stack<Integer> checkStack = new Stack<>();
        String[] stringSplit = s.split(" ");
        for (String i : stringSplit) {
            if (i.equals("Z")) {
                checkStack.pop();
            } else {
                checkStack.push(Integer.parseInt(i));
            }
        }
        for (int i : checkStack) {
            answer+=i;
        }
        return answer;
    }

    public static void main(String[] args) {
        String check = "1 2 Z 3";
        solution(check);
    }
}
