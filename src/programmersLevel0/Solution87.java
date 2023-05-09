package programmersLevel0;

public class Solution87 {
    public int solution(int n) {
        int pizza = 7;
        return n%pizza>0?n/pizza+1:n/pizza;
    }
}
