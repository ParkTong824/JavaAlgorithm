package javaAlgorithm2;

import java.util.Arrays;

public class Solution13 {
	public static void main(String[] args) {
		
	}
	
	public int solution(int[] A, int[] B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i =0 ; i<A.length ; i++) {
        	answer = answer + A[i]*B[A.length-1-i];
        }

        return answer;
    }
	

}
