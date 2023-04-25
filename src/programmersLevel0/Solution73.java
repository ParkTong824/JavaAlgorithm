package programmersLevel0;

public class Solution73 {
    public int solution(int n, int k) {
        k -= n/10;
        return n * 12000 + k * 2000;
    }
}
