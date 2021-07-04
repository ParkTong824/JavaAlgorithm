package test;

import java.util.Arrays;

public class Solution04 {
    public int solution(int[] prices, int[] discounts) {
        int answer = 0;
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int disIndex = discounts.length-1;
        for (int i = prices.length-1 ; i >= 0 ; i--){
            if (disIndex>=0){
                answer +=prices[i]*(100-discounts[disIndex])/100;
                disIndex--;
            } else {
                answer +=prices[i];
            }
        }
        return answer;
    }
}
/*
prices	discounts	result
[13000, 88000, 10000]	[30, 20]	82000
[32000, 18000, 42500]	[50, 20, 65]	45275
 */