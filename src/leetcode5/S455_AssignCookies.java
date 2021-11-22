package leetcode5;

import java.util.HashSet;
import java.util.Set;

public class S455_AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Set<Integer> checkSet = new HashSet<>();
        for (int i = 0 ; i < s.length ; i++) {
            checkSet.add(s[i]);
        }
        int answer = 0;
        for (int i = 0 ; i < g.length ; i++) {
            if (checkSet.contains(g[i])){
                answer++;
                checkSet.remove(g[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
