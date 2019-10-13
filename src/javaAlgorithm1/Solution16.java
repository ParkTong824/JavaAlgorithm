package javaAlgorithm1;

import java.util.Arrays;
import java.util.Collections;

public class Solution16 {
	public static void main(String[] args) {
		
		
	}
	
	public static long solution(long n) {
		  long answer = 0;
	      int index = 0;
	      int leng = String.valueOf(n).length();
	      long[] result = new long[leng];
	      long k = n;
	      while(k/10 !=0) {
	    	  long a = k%10;
	    	  k = k/10;
	    	  
	    	  result[index] = a;
	    	  index++;
	      }
	      result[index] = k;
	      Arrays.sort(result);

	      String arraysToString = "";
	      int j = leng;
	      for(int i=0 ; i<leng ; i++) {
	    	  arraysToString += result[j-1];
	    	  j--;
	      }

	     
	      answer = Long.parseLong(arraysToString);
	      
	      
	      
	      return answer;
	  }


}

//
//함수 solution은 정수 n을 매개변수로 입력받습니다.
//n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
//예를들어 n이 118372면 873211을 리턴하면 됩니다.
//
//제한 조건
//n은 1이상 8000000000 이하인 자연수입니다.
//입출력 예
//n	return
//118372	873211