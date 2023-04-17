package programmersLevel0;

public class Solution65 {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0 ; i < rsp.length() ; i++) {
            char checkChar = rsp.charAt(i);
            if ( checkChar == '0' ) {
                answer.append("5");
            } else if ( checkChar == '2' ) {
                answer.append("0");
            } else {
                answer.append("2");
            }
        }
        return answer.toString();
    }
}
