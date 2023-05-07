package programmersLevel0;

public class Solution85 {
    public int solution(int slice, int n) {
        return n/slice+(n%slice>0 ? 1 : 0);
    }
}
