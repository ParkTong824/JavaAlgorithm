package javaAlgorithm1;

public class Solution26 {
	public static void main(String[] args) {
		
	}
	
	public String solution(String s) {
	      String answer = "";
	      if(s.length()%2==0) {
	    	  answer = s.substring(s.length()/2-1,s.length()/2+1);
	      }
	      else if(s.length()%2==1) {
	    	  answer = s.substring(s.length()/2,s.length()/2+1);
	      }
	      return answer;
	  }

}
