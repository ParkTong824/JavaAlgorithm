package leetcode6;

import java.util.ArrayList;
import java.util.List;

public class S682_BaseballGame {
    public int calPoints(String[] ops) {
        List<Integer> opsList = new ArrayList<>();
        for (int i = 0 ; i < ops.length ; i++) {
            switch (ops[i]){
                case "C":
                    opsList.remove(opsList.size()-1);
                    break;
                case "D":
                    opsList.add(opsList.get(opsList.size()-1)*2);
                    break;
                case "+":
                    opsList.add(opsList.get(opsList.size()-2)+opsList.get(opsList.size()-1));
                    break;
                default:
                    opsList.add(Integer.parseInt(ops[i]));
                    break;
            }
        }
        int answer = 0;
        for (int i = 0 ; i < opsList.size() ; i++) {
            answer+=opsList.get(i);
        }

        return answer;
    }
}
/*
Input: ops = ["5","2","C","D","+"]
Output: 30
Explanation:
"5" - Add 5 to the record, record is now [5].
"2" - Add 2 to the record, record is now [5, 2].
"C" - Invalidate and remove the previous score, record is now [5].
"D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
"+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
The total sum is 5 + 10 + 15 = 30.

Input: ops = ["5","-2","4","C","D","9","+","+"]
Output: 27

"+" - Record a new score that is the sum of the previous two scores. It is guaranteed there will always be two previous scores.
"D" - Record a new score that is double the previous score. It is guaranteed there will always be a previous score.
"C" - Invalidate the previous score, removing it from the record. It is guaranteed there will always be a previous score.

 */
