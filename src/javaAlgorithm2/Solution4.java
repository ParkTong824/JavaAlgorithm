package javaAlgorithm2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution4 {
	
	public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int length = bridge_length;
        Queue<Integer> where = new LinkedList<Integer>();
        ArrayList<Integer> truck = new ArrayList<Integer>();
        for(int i =0 ; i<truck_weights.length; i++) {
        	truck.add(truck_weights[i]);
        }
        while(truck.size()!=0) {
        	where.offer(1);
        }
        return answer;
    }

}
