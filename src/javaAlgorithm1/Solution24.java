package javaAlgorithm1;

import java.util.Arrays;

public class Solution24 {
	public static void main(String[] args) {
		
	}
	
	 public int[] solution(int[] arr, int divisor) {
	      int[] arr1 = arr;
	      int[] answer = {};
	      int j = 0;
	      int count = 1;
	      for(int i = 0 ; i<arr.length;i++){
	          if(arr[i]%divisor==0){
	              arr1[j] = arr1[i];
	              j++;
	              count++;
	          }
	      }
	      if(count==1){
	          int[] result = {-1};
	          answer = result;
	      }
	     else{
             int[] result = new int[count-1];
	      for(int i =0; i<count-1 ; i++){
              result[i] = arr1[i];
          }
	      Arrays.sort(result);
	      answer = result;
         }
	      
	      return answer;
	  }

}
