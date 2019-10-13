package javaAlgorithm1;

public class Solution14 {
	public static void main(String[] args) {
		
	}
	
	 public int[] solution(int n, int m) {
	      int x =0;
	      int y =0;
		  int[] answer = new int[2];
		  int a =n;
	      int b =m;
	      int c = 1;
	      
	      if(a<b) {
	    	  a=m;
	    	  b=n;
	      }
	      
	      while(c>0) {
	    	  c=a%b;
	    	  a=b;
	    	  b=c;
	      }
	      int max = a;
	      int min = n*m/a;
	      answer[0] = max;
	      answer[1] = min;
	      
	      return answer;
	  }

}
