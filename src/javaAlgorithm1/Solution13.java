package javaAlgorithm1;

import java.util.Arrays;

public class Solution13 {
	public static void main(String[] args) {
		System.out.println(solution(455324));
		
	}
	
	 public static int[] solution(long n) {
		 int length = String.valueOf(n).length();
		 int [] answer = new int[length];
		 int index = 0;
		 long k = n;
		 
		 while(k/10 !=0) {
			 int a = (int) (k%10);
			 k = k/10;
			 
			 answer[index] = a;
			 index++;
		 }
		 answer[index] = (int) k;
		 
		 System.out.println(Arrays.toString(answer));
	      return answer;
	  }

}

//자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
//예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
//
//제한 조건
//n은 10,000,000,000이하인 자연수입니다.
//입출력 예
//n	return
//12345	[5,4,3,2,1]