package javaAlgorithm2;

import java.util.LinkedList;
import java.util.Queue;

public class Solution6 {

	public static void main(String[] args) {
		int prices[] = {1,2,3,2,3};
		
		solution(prices);
	}
	
	public static int[] solution(int[] prices) {
        int[] answer = {};
        Queue<Integer> stocks = new LinkedList<Integer>();
        Queue<Integer> stocksA = new LinkedList<Integer>();
        int[] result = new int[prices.length];
        for(int i =0 ; i<prices.length; i++) {
        	stocks.add(prices[i]);
        }
        for(int i =0; i<prices.length; i++) {
        	stocksA = stocks;
        	int count = 0;
        	int a = stocksA.poll();
        	while(stocksA.size()!=0) {
        		if(a<=stocksA.element()) {
        			count++;
        			stocksA.remove();
        		}
        		else {
        			result[i] = count;
        			break;
        		}
        		result[i] = count;
        	}
        	stocks.poll();
        }
        return answer;
    }
}


//prices	return
//[1, 2, 3, 2, 3]	[4, 3, 1, 1, 0]
//입출력 예 설명
//1초 시점의 ₩1은 끝까지 가격이 떨어지지 않았습니다.
//2초 시점의 ₩2은 끝까지 가격이 떨어지지 않았습니다.
//3초 시점의 ₩3은 1초뒤에 가격이 떨어집니다. 따라서 1초간 가격이 떨어지지 않은 것으로 봅니다.
//4초 시점의 ₩2은 1초간 가격이 떨어지지 않았습니다.
//5초 시점의 ₩3은 0초간 가격이 떨어지지 않았습니다.