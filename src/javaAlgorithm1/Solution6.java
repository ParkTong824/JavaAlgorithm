package javaAlgorithm1;

import java.util.Arrays;

public class Solution6 {
	public static void main(String[] args) {
			solution("sDf",6);
		
	}
	
	
	public static String solution(String s, int n) {
		      String answer = "";
		      
		      char[] charArr = new char[s.length()];
		      int [] charToInt = new int[s.length()];
		      char[] intToChar = new char[s.length()];
		      int i = 0;
		   
		      for( i = 0 ; i< s.length() ; i++) {
		    	  
		    	  charArr[i] = s.charAt(i);
		    	  charToInt[i] = charArr[i] + n;
		    	 
		    	 
		      
		      
		      if(charArr[i]<=90 && charToInt[i]>90) {
		    	  charToInt[i] = charToInt[i]-26;
		    	  
		      }
		      
		      else if(charArr[i]>=97 && charToInt[i]>122) {
		    	  charToInt[i] = charToInt[i] - 26;
		      }
		      
		      else if(charArr[i]==32){
		    	  charToInt[i] = 32;
		      }
		      intToChar[i] = (char)charToInt[i];
		      }
		      
		    
		      System.out.println(Arrays.toString(charArr));
		      System.out.println(Arrays.toString(charToInt));
		      System.out.println(Arrays.toString(intToChar));
		      
		      StringBuilder sb = new StringBuilder();
		      for (int j = 0; j < intToChar.length; j++) {
				sb.append(intToChar[j]);
			}
		      
		      answer = sb.toString();
		      System.out.println(answer);

		      return answer;
		  }

}


//어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
//예를 들어 AB는 1만큼 밀면 BC가 되고, 3만큼 밀면 DE가 됩니다. z는 1만큼 밀면 a가 됩니다. 
//문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
//
//제한 조건
//공백은 아무리 밀어도 공백입니다.
//s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
//s의 길이는 8000이하입니다.
//n은 1 이상, 25이하인 자연수입니다.
//입출력 예
//s	n	result
//AB	1	BC
//z	1	a
//a B z	4	e F d