package programmersLevel0;

public class Solution53 {
    public int solution(String my_string) {
        int answer = 0;
        for (int i = 0 ; i < my_string.length() ; i++) {
            char checkCharacter = my_string.charAt(i);
            if (checkCharacter >= '0' && checkCharacter <= '9') {
                answer += Integer.parseInt(String.valueOf(checkCharacter));
            }
        }
        return answer;
    }
}
