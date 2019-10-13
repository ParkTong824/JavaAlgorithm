package javaAlgorithm1;
//Phone Number solution
import java.util.Arrays;

public class Solution10 {
	public static void main(String[] args) {
		System.out.println(solution10("01028783198"));
		
	}
	public static String solution10(String phone_number) {
	    int leng = phone_number.length();  
		String[] answer = new String[leng];
		answer = phone_number.split("");
		StringBuilder stb = new StringBuilder();
		
		for(int i=0 ; i<(leng-4); i ++) {
			answer[i] = "*";
		}
		
		for(int i =0 ; i<leng ; i++) {
			stb.append(answer[i]);
		}
		
	      
	      return stb.toString();
	  }

}
