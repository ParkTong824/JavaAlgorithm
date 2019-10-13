package javaAlgorithm1;

public class Solution29 {
	public static void main(String[] args) {
		
	}
	
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int count = 0;
        int lostFind = 0;
        for(int i =0 ; i<lost.length; i++) {
        	for(int j = 0 ; j<reserve.length;j++) {
        	    if(lost[i]==reserve[j]) {
        	    	lost[i] = 0;
        			reserve[j] = 0;
        			lostFind++;
        	    }
            }
        }
        for(int i =0 ; i<lost.length; i++) {
        	for(int j = 0 ; j<reserve.length;j++) {
        		if(lost[i] !=0 && lost[i]==reserve[j]-1) {
        			lost[i] = 0;
        			reserve[j] = 0;
        			count++;
        		}
        		
        	}
        }
        for(int i =0 ; i<lost.length; i++) {
        	for(int j = 0 ; j<reserve.length;j++) {
        		 if(lost[i] !=0 && reserve[j]!=0 && lost[i]==reserve[j]+1) {
        			lost[i] = 0;
        			reserve[j] = 0;
        			count++;
        		}
        		
        	}
        }
       
        answer = n-lost.length+count+lostFind;
        return answer;
    }

}


//n	lost	reserve	return
//5	[2, 4]	[1, 3, 5]	5
//5	[2, 4]	[3]	4
//3	[3]	[1]	2

