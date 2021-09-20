package leetcode5;

import java.util.Arrays;

public class S338_CountingBits {
    public static int[] countBits(int n) {
        int[] answer = new int[n+1];
        answer[0]=0;
        for(int i=1;i<=n;i++){
            answer[i]=answer[i/2]+i%2;
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(countBits(n)));
    }
}
