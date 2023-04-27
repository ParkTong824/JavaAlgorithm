package programmersLevel0;

public class Solution75 {
    public String solution(String my_string, String letter) {
        StringBuilder checkString = new StringBuilder();
        for (int i = 0 ; i < my_string.length() ; i++) {
            if (!letter.equals(String.valueOf(my_string.charAt(i)))) {
                checkString.append(my_string.charAt(i));
            }
        }
        return checkString.toString();
    }
}
