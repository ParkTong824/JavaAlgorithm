package javaAlgorithm2;

public class Solution11 {
	public static String solution(String s) {
	      String answer = "";
	      char[] arrWord = new char[s.length()];
	      int count = 0;
	      //단어 구분위한 count 값
	      boolean word = false;
	      for(int i =0; i<s.length();i++) {
	    	  arrWord[i] =(s.charAt(i));
	      }
	      while(count!=arrWord.length-1) {
	    	  if((int)arrWord[count]==32) {
	    		  count++;
	    		  word = false;
	    		  continue;
	    	  }
	    	  
	    	  else if(word == false) {
	    		  if((int)arrWord[count]>47 && (int)arrWord[count]<58) {
	    			  count++;
	    			  word = true;
	    			  continue;
	    		  }
	    		  else if((int)arrWord[count]>96 && arrWord[count]<123) {
	    			  arrWord[count]=(char)((int)arrWord[count]-32);
	    			  count++;
	    			  word = true;
	    			  continue;
	    		  }
	    	  }
	    	  
	    	  else if((int)arrWord[count]<91 &&(int)arrWord[count]>64) {
	    		  arrWord[count] = (char)((int)arrWord[count]+32);
	    		  count++;
	    	  }
	    	  else {
	    		  count++;
	    	  }
	      }
	      String str = String.valueOf(arrWord);
	      answer = str;
	    return answer;
	  }

}
