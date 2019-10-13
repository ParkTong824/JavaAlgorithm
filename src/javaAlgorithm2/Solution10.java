package javaAlgorithm2;

public class Solution10 {
	public static void main(String[] args) {
		String[] words = {"abc", "cdb"};
		solution(2, words);
	}
	
	public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        String[] word = new String[words.length];
        int count = 2;
        int var = 0;
        for(int i=0; i<words.length; i++) {
        	word[i] = words[i];
        }
        for(int i =1 ; i<word.length; i++) {
        		if(word[i-1].charAt(word[i-1].length()-1)==word[i].charAt(0)) {
        			for(int j =0 ; j<i; j++) {
        				if(word[i].equals(word[j])) {
        					var = 1;
        					break;
        				}
        			}
        		}
        		else if(word[i-1].charAt(word[i-1].length()-1)!=word[i].charAt(0) || var==1) {
        			break;
        		}
        		count++;
        }
        answer[0] = count%n;
        answer[1] = count/n+1;
        if(count%n == 0) {
        	answer[0] =n;
        	answer[1] = count/n;
        }
        else if(count == word.length+1) {
        	answer[0] = 0;
        	answer[1] = 0;
        }
        
        return answer;
    }
	
	
	
//	public static int[] solution(int n, String[] words) {
//        int[] answer = new int[2];
//        String[] word = new String[words.length];
//        ArrayList<String[]> wordArr = new ArrayList<String[]>();
//        int count = 2;
//        int result = 0;
//        for(int i =0 ; i<words.length; i++) {
//        	word[i] = words[i];
//        	wordArr.add(word[i].split(""));
//        }
//        for(int i =1 ; i<words.length ; i++) {
//        	if(wordArr.get(i)[0].equals(wordArr.get(i-1)[word.length-1])) {
//        		for(int j=0 ; j<i ; j++) {
//        			if(wordArr.get(j).equals(wordArr.get(i))){
//        				result =1;
//        				break;
//        			}
//        			
//        		}
//        		if(result == 1) {
//    				break;
//    			}
//        		else {
//        			count++;
//        		}
//        	}
//        }
//        answer[0] = count/n;
//        answer[1] = count%n;
//        
//        if(count%n == 0) {
//        	answer[1] = n;
//        }
//        else if(count == words.length+1) {
//        	answer[0] = 0;
//        	answer[1] = 0;
//        }
//
//        return answer;
//    }

}