package javaAlgorithm1;

import java.util.Arrays;

public class Solution9 {
	public static void main(String[] args) {
		
		solution(0,3);
		
	}
	
	 public static long[] solution(int x, int n) {
	      long[] answer = new long[n];
	      int multi = 1;
	      int a = x;
	      
	      for(int i=0 ; i<n ; i++) {
	    	  answer[i] = a*multi ;
	    	  multi++;
	      }
	      if(a>0) {
	      Arrays.sort(answer);
	      }
	      System.out.println(Arrays.toString(answer));
	      return answer;
	  }
	
}
