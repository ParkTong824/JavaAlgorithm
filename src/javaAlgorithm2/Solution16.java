package javaAlgorithm2;

import java.util.ArrayList;

public class Solution16 {
	public static void main(String[] args) {
		int[][] land = {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};
		solution(land);
		
	}
	
	 public static int solution(int[][] land) {
        int answer = 0;
        int count = 0;
        
        int maxNum = -1;
        int sum = 0;
        ArrayList<Integer> result = new ArrayList<Integer>();
        while(count !=land.length) {
        	int max = 0;
        	for(int i = 0 ; i<4 ; i++) {
        		if(i == maxNum) {
        			continue;
        		}
        		max = (land[count][i]>max ? land[count][i] : max);
        	}
        	for(int i = 0; i<4 ; i++) {
        		if(land[count][i] == max) {
        			maxNum = i;
        		}
        	}
        	result.add(max);
        	count++;
        	
        }
        for(int i= 0; i<result.size() ; i++) {
        	sum = sum + result.get(i);
        }
        answer = sum;
        return answer;
    }

}
