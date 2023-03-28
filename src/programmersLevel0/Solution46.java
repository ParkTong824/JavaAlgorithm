package programmersLevel0;

public class Solution46 {
    public static String solution(String polynomial) {
        String answer = "";
        String[] variableArr = polynomial.split(" \\+ ");
        int param = 0;
        int onlyCon = 0;
        for (int i = 0 ; i < variableArr.length ; i++) {
            if (variableArr[i].charAt(variableArr[i].length()-1) == 'x') {
                if (variableArr[i].length() == 1) {
                    param++;
                } else {
                    param += Integer.parseInt(variableArr[i].substring(0,variableArr[i].length()-1));
                }
            } else {
                onlyCon+= Integer.parseInt(variableArr[i]);
            }
        }
        String changeParam = "";

        if ( param > 0 && onlyCon >0) {
            if (param == 1) {
                answer = "x + "+onlyCon;
            } else {
                answer = param+"x + "+onlyCon;
            }
        } else if ( param > 0) {
            if (param == 1) {
                answer = "x";
            } else {
                answer = param+"x";
            }
        } else {
            answer = String.valueOf(onlyCon);
        }
        return answer;
    }

    public static void main(String[] args) {
        String x = "3x + 7 + x";
        solution(x);
    }
}
