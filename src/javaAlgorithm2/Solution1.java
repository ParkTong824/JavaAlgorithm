package javaAlgorithm2;

import java.util.Arrays;

public class Solution1 {
	public static void main(String[] args) {
		
	}
	
	public String solution(int n) {
	      String answer = "";
	      int a = 1;
	      double again = Math.pow(3,a);
	      double dec = 0;
	      int input = n;
	      double decA = 0;
	      while(dec<n) {
	    	  dec = dec + Math.pow(3, a);
	    	  a++;
//	    	배열 길이 구하기
	      }
	      int leng = a-1;
	      int[] resultA = new int[leng];
	      decA = dec-Math.pow(3, leng);
	      int resultNum = (int) (input - decA);
	      for(int i = 0 ; i<leng ; i++){
	    	  resultA[i]=(int) (resultNum/(Math.pow(3, leng-1-i)));
	    	  resultNum = (int) (resultNum%(Math.pow(3, leng-1-i)));
	      }
	      String[] answerA = new String[leng];
	     
	      for(int i =0 ; i<leng ; i++) {
	    	  answerA[i] = String.valueOf(resultA[i]);
	    	  if(resultA[i]==0) {
	    		  answerA[i]="1";
	    	  }
	    	  else if(resultA[i]==1) {
	    		  answerA[i]="2";
	    	  }
	    	  else if(resultA[i]==2) {
	    		  answerA[i]="4";
	    	  }
	      }
	      if(resultA[leng-1]==1) {
	    	  answerA[leng-1]="1";
	      }
	      else if(resultA[leng-1]==2) {
	    	  answerA[leng-1]="2";
	      }
	      int j =leng-1;
	      while(resultA[j]==0) {
	    	  if(resultA[j]==0) {
	    		  answerA[j] ="4";
	    		  j--;
	    	  }
	      }
	      for(int i =leng ; i>0;i--) {
	    	  if(answerA[leng-1]=="4") {
	    		  answerA[leng-2] = (answerA[leng-2]=="4"?answerA[leng-2]:String.valueOf(resultA[leng-2]));
	    	  }
	      }
	      if(n==3) {
	    	  answerA[0]="4";
	      }
	      StringBuilder sb = new StringBuilder();
	      for(int i =0;i<leng ; i++) {
	      sb.append(answerA[i]);
	      }
	      answer = sb.toString();
	      return answer;
	  }
}

//10진법	124 나라	10진법	124 나라
//1	1	6	14
//2	2	7	21
//3	4	8	22
//4	11	9	24
//5	12	10	41