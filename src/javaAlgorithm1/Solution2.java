package javaAlgorithm1;

public class Solution2 {
	public static void main(String[] args) {
		
		System.out.println(solution(626331));
		
	}


	public static int solution(int num) {
		int answer = 0;
		int n= num;
		int a= 0;
		while(n!=1 && n!=-1) {
			if(n%2==0) {
				n = n/2;

			}
			else if(n%2==1) {
				n=n*3+1;
			}
			
			else if(answer>500) {
				answer = -1;
				break;
			}
			answer += 1;
			
		}

		
		
		return answer;
	}
}



//
//1-1. 입력된 수가 짝수라면 2로 나눕니다. 
//1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
//2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.