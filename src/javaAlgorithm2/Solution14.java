package javaAlgorithm2;

import java.util.Arrays;

public class Solution14 {
	public static void main(String[] args) {
		String s = "-3 1 4 5 -1 -7";
		solution(s);
		
	}
	
	public static String solution(String s) {
		String answer = "";
		
	      StringBuffer resultA = new StringBuffer();
	      String[] result = new String[2];
	      String[] arrSort = s.split(" ");
	      int[] toInt = new int[arrSort.length];
	      for(int i = 0 ; i<toInt.length; i++) {
	    	  toInt[i] = Integer.parseInt(arrSort[i]);
	      }
	      Arrays.sort(toInt);
	      
//	      if(arrSort[0].split("")[0].equals("-")) {
//	    	  result[1] = arrSort[0];
//		      result[0] = arrSort[arrSort.length-1];
//	      }
	      result[0] = Integer.toString(toInt[0]);
	      result[1] = Integer.toString(toInt[arrSort.length-1]);
	      
	      	    
	      resultA.append(result[0]);
	      resultA.append(" ");
	      resultA.append(result[1]);
	      answer = resultA.toString();
	      return answer;
	  }

}

//s	return
//1 2 3 4	1 4
//-1 -2 -3 -4	-4 -1
//-1 -1	-1 -1