package javaAlgorithm1;

public class Solution18 {
	public static void main(String[] args) {
		
	}
	
	public String solution(int n) {
	      String answer = "";
	      int a = n;
	      String[] sentence = new String[a];
	      for(int i =0 ; i<a ; i++) {
            if(i%2==1) {
	    		 sentence[i] = "박";
	    	  }
	    	  else if(i%2==0) {
	    		  sentence[i] = "수";
	    	  }
	      }
	      
	      for(int i = 0; i<a ; i++) {
	    	  answer += sentence[i];
	      }
	      return answer;
	  }
	
}
