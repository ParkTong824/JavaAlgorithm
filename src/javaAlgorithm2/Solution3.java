package javaAlgorithm2;

import java.util.ArrayList;

public class Solution3 {
	
	public static void main(String[] args) {
		int [] heights = {1, 5, 3, 6, 7, 6, 5};
		int[] answer = solution(heights);
	}
	
	public static int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        ArrayList<Integer> high = new ArrayList<Integer>();
        int[] receive = new int[heights.length];
        int countA = 0;
        for(int i =heights.length-1; i>-1; i--) {
        	high.add(heights[i]);
        }
        while(high.size()!=0) {
        	int countB = 0;
        for(int i = 0; i<high.size(); i++) {
        	if(high.get(0)>=high.get(i)) {
        		countB++;
        		if(countB == high.size()) {
        			receive[countA]=0;
            		high.remove(0);
            		countA++;
            		break;
        		}
        	}
        	else {
        		high.remove(0);
        		receive[countA]=heights.length-countA-countB;
        		countA++;
        		break;
        	}
        }
        }
        int j = heights.length-1;
        for(int i =0 ; i<heights.length;i++) {
        	answer[i] = receive[j];
        	j--;
        }
        return answer;
    }

}


//송신 탑(높이)	수신 탑(높이)
//5(4)	4(7)
//4(7)	2(9)
//3(5)	2(9)
//2(9)	-
//1(6)	-
//heights	return
//[6,9,5,7,4]	[0,0,2,2,4]
//[3,9,9,3,5,7,2]	[0,0,0,3,3,3,6]
//[1,5,3,6,7,6,5]	[0,0,2,0,0,5,6]