package javaAlgorithm1;

public class Solution12 {
	public static void main(String[] args) {
		System.out.println(solution(144));
	}
	
	public static long solution(long n) {
	      long answer = 0;
	      double a= Math.sqrt(n);
	      
	      if(a>(int)a) {
	    	  answer = -1;
	      }
	      else {
	    	 answer = (long) Math.pow((a+1), 2);
	      }

	      return answer;
	  }

}

//임의의 정수 n에 대해, n이 어떤 정수 x의 제곱인지 아닌지 판단하려 합니다.
//n이 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
//
//제한 사항
//n은 1이상, 50000000000000 이하인 정수입니다.
//입출력 예
//n	return
//121	144
//3	-1