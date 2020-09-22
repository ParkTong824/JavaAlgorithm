package programmersLevel2;

import java.util.LinkedList;
import java.util.Queue;

public class Solution11BridgeTruck {
    public static void main(String[] args) {
        int bridge = 100;
        int weight = 100;
        int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};

        System.out.println(solution(bridge,weight,truck_weights));
    }
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int currentWeight = 0;
        Queue<Integer> bridgeQue = new LinkedList<>();
        Queue<Integer> truckQue = new LinkedList<>();
        for (int i : truck_weights){
            truckQue.add(i);
        }
        for (int i = 0 ; i <bridge_length ; i++){
            bridgeQue.add(0);
        }
        while (truckQue.size()!=0){
            answer++;
            int truckWeight = truckQue.peek();
            currentWeight= currentWeight-bridgeQue.poll();
            if (currentWeight+truckWeight<=weight){
                bridgeQue.add(truckQue.poll());
                currentWeight = currentWeight+truckWeight;
            }else {
                bridgeQue.add(0);
            }
        }

        answer = answer+bridge_length;
        return answer;
    }
}
/*
bridge_length	weight	truck_weights	return
2	10	[7,4,5,6]	8
100	100	[10]	101
100	100	[10,10,10,10,10,10,10,10,10,10]	110
 */