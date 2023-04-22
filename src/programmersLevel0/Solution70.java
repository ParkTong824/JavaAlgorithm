package programmersLevel0;

public class Solution70 {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        while (age>0) {
            answer.insert(0,(char)('a'+(age%10)));
            age/=10;
        }
        return answer.toString();
    }
}
