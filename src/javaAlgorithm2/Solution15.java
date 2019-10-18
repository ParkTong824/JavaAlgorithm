package javaAlgorithm2;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution15 {
	public static void main(String[] args) {
		
	}
	
	public int solution(int[] nums) {
        int answer = 0;
        int count = 1;
        Arrays.sort(nums);
        ArrayList<Integer> arrNum = new ArrayList<Integer>();
        for(int i = 0 ; i<nums.length;i++) {
        	arrNum.add(nums[i]);
        }
        while(count==arrNum.size()) {
        	if(arrNum.get(count)==arrNum.get(count-1)) {
        		arrNum.remove(count);
        	}
        	else {
        		count++;
        	}
        }
        
        
        return answer;
    }

}
