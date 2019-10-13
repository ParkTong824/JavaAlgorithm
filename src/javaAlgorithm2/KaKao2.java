package javaAlgorithm2;

import java.awt.List;
import java.util.HashMap;

public class KaKao2 {
	public static void main(String[] args) {
		
	}
	
	public int[] solution(int N, int[] stages) {
        int[] answer = {};
        double[] per = new double[stages.length];
        List listA = new List();
        for(int i =0 ; i<stages.length ; i++) {
        	
        }
        HashMap<Integer,Integer> coun = new HashMap<>();
        
        
        for(int i=0 ; i<stages.length; i ++) {
        	per[i] = stages[i]/N;
        }
        return answer;
    }

}

//N	stages	result
//5	[2, 1, 2, 6, 2, 4, 3, 3]	[3,4,2,1,5]
//4	[4,4,4,4,4]	[4,1,2,3]