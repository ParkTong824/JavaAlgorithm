package programmersLevel0;

public class Solution45 {
    public int solution(String my_string) {
        int answer = 0;
        char[] stringSplitArr = my_string.toCharArray();
        StringBuilder tempNumber = new StringBuilder();
        for (char i : stringSplitArr) {
            if ( !((i >= 'a' && i <='z') || (i >= 'A' && i <='Z'))) {
                tempNumber.append(i);
            } else {
                if (tempNumber.length() > 0) {
                    answer += Integer.parseInt(String.valueOf(tempNumber));
                    tempNumber = new StringBuilder();
                }
            }
        }
        if (tempNumber.length() > 0) {
            answer += Integer.parseInt(String.valueOf(tempNumber));
        }
        return answer;
    }
}
