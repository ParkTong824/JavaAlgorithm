package javaAlgorithm1;

import java.util.Arrays;

public class Solution22 {
	public static void main(String[] args) {
		
	}
	
	public String[] solution(String[] strings, int n) {
	      String[] answer = {};
	      String[] a = new String[strings.length];
	      for(int i =0; i<strings.length ; i++) {
	    	  a[i]= strings[i].substring(n-1,n)+strings[i];
	    	  
	      }
	     Arrays.sort(a);
	     
	     for(int i =0 ; i<strings.length;i++) {
	    	 answer[i] = a[i].substring(0);
	     }
	     
	      return answer;
	  }
}



//strings	n	return
//[sun, bed, car]	1	[car, bed, sun]
//[abce, abcd, cdx]	2	[abcd, abce, cdx]
//입출력 예 설명
//입출력 예 1
//sun, bed, car의 1번째 인덱스 값은 각각 u, e, a 입니다. 이를 기준으로 strings를 정렬하면 [car, bed, sun] 입니다.
//
//입출력 예 2
//abce와 abcd, cdx의 2번째 인덱스 값은 c, c, x입니다. 따라서 정렬 후에는 cdx가 가장 뒤에 위치합니다. 
//abce와 abcd는 사전순으로 정렬하면 abcd가 우선하므로, 답은 [abcd, abce, cdx] 입니다.
