package programmersLevel0;

public class Solution55 {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0 ; i < my_string.length() ; i++) {
            char check = my_string.charAt(i);
            if (!(check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u')) {
                answer.append(check);
            }
        }
        return answer.toString();
    }
}
