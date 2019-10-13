package javaAlgorithm1;

import java.util.Arrays;

public class Solution1 {
	public static void main(String[] args) {
		
	
	 System.out.println(solution(123));
		
	}
	
    public static int solution(int n) {
        int answer = 0;
        int length = String.valueOf(n).length();
        
        int[] answers = new int[length];
        int index = 0;
        int k = n;
        
        while (k/10 != 0) {
           	int b = k % 10;
        	k = k/10;
 
        	
        	answers[index] = b;
        	index++;
        }
        answers[index] = k; 
        
        int sum = 0;
        
        for(int nums: answers) {
        	sum += nums;
        }
       
        System.out.println(Arrays.toString(answers));
        
        answer = sum;

        return answer;
    }
}

/*
입력값 〉	123
기댓값 〉	6
실행 결과 〉	실행한 결괏값 0이(가) 기댓값 6와(과) 다릅니다.
테스트 2
입력값 〉	987
기댓값 〉	24
 * */

