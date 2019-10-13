package javaAlgorithm1;

public class Solution23 {
	public static void main(String[] args) {
		
	}
	
	public long solution(int a, int b) {
	      long answer = 0;
	      int large= Math.max(a, b);
	      int small= Math.min(a, b);
	      int sum = 0;
	      int leng = large-small;
	      for(int i =0; i <leng; i++) {
	    	  sum +=small;
	    	  small++;
	      }
	      answer = sum;
	      return answer;
	  }

}
