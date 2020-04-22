package programmersLevel2;

import java.util.LinkedList;
import java.util.Queue;

public class Solution03Stock {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
        solution(prices);
    }
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> pricesQue = new LinkedList<>();
        for (int i = 0 ; i < prices.length ; i++){
            pricesQue.add(prices[i]);
        }

        for (int i = 0 ; i < prices.length-1 ; i++){
            int price = pricesQue.poll();
            int minusTime = 0;
            answer[i] = 0;
            for (int j = i+1 ; j<prices.length ; j++){
                if (price<=prices[j]){
                    minusTime++;
                    answer[i]=minusTime;
                }else{
                    minusTime++;
                    answer[i]=minusTime;
                    break;
                }
            }
            if (i==prices.length-2){
                answer[i+1]=0;
                break;
            }
        }

        return answer;
    }
}
/*
prices	return
[1, 2, 3, 2, 3]	[4, 3, 1, 1, 0]
 */
