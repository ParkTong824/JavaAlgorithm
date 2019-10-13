package javaAlgorithm2;

import java.util.ArrayList;

public class Solution5 {
	public static void main(String[] args) {
		int[] people = {70, 80, 50};
		int limit = 100;
		int answer = solution(people,limit);
		
		
	}
	
	public static int solution(int[] people, int limit) {
        int answer = 0;
        int inBoat = 0;
        int countA = 0;
        ArrayList<Integer> wei = new ArrayList<Integer>();
        for(int i =0; i<people.length;i++) {
        	wei.add(people[i]);
        }
        wei.sort(null);
        while(wei.size()!=0) {
        	int countB=0;
        	for(int i = wei.size()-1 ; i>0;i--) {
        		if(wei.get(i)<=limit-wei.get(0)){
        			if(inBoat<wei.get(i)) {
        				inBoat =wei.get(i);
        				countB++;
        			}
        		}
        	}
        	if(countB>0) {
        		wei.remove(0);
        		wei.remove(wei.size()-countB);
        	}
        	else {
        		wei.remove(0);
        	}
        	countA++;
        }
        answer = countA;
        return answer;
    }

}

//people	limit	return
//[70, 50, 80, 50]	100	3
//[70, 80, 50]	100	3