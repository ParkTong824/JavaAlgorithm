package javaAlgorithm2;

public class Solution12 {
	public static void main(String[] args) {
		
	}
	
	public int solution(int n) {
	      int answer = 0;
	      int[] intArr = new int[n+1];
	      int division = 1234567;
	      intArr[0] = 0;
	      intArr[1] = 1;
	      for(int i =2 ; i<n+1;i++) {
	    	  intArr[i] = ((intArr[i-1]%division) + (intArr[i-2]%division))%(division);
	      }
	      answer = intArr[n];
	      return answer;
	  }

}

//입출력 예
//n	return
//3	2
//5	5
//입출력 예 설명
//피보나치수는 0번째부터 0, 1, 1, 2, 3, 5, ... 와 같이 이어집니다.