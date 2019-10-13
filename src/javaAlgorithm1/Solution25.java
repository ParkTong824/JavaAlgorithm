package javaAlgorithm1;

import java.util.Arrays;

public class Solution25 {
	public static void main(String[] args) {
	}
	
	public int[] solution(int []arr) {
     
        int[] arrA = arr;
        int[] result = new int[arrA.length];
        int j = 0;
        int count = 0;
        result[0] = arrA[0];
        
        for(int i =0 ; i<arrA.length ; i++) {
        	if(arrA[i]==result[j]) {
        		continue;
        	}
        	else if(arrA[i]!=result[j]) {
        		result[j+1] = arrA[i];
        		j++;
        		count++;
        	}
        }
        int [] answer = new int[count+1];
        for(int i = 0 ; i<count+1;i++) {
        	answer[i] = result[i];
        }
        return answer;
	}
}
