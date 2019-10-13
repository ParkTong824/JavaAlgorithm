package javaAlgorithm1;

public class Solution21 {
	public static void main(String[] args) {
		
	}
	
	boolean solution(String s) {
        boolean answer = true;
        int leng = s.length();
        String[] sentence = new String[leng];
        sentence = s.split("");
        int pCount = 0;
        int yCount = 0;
        
        for(int i=0; i<leng ; i++) {
        	if(sentence[i].equals("p") || sentence[i].equals("P")) {
        		pCount++;
        	}
        	else if(sentence[i].equals("y") || sentence[i].equals("Y")) {
        		yCount++;
        	}
        }
        if(pCount != yCount) {
        	answer = false;
        }
        
        System.out.println(pCount);
        System.out.println(yCount);


        return answer;
    }

}
