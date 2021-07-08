package leetcode3;

import java.util.Arrays;

public class S121_BestTimeBuySell {
    public static int maxProfit(int[] prices) {
        int answer= 0;
        int nowNum = prices[0];
        for (int i = 1 ; i < prices.length ; i++){
            if (nowNum<prices[i]){
                answer=(prices[i]-nowNum>answer?prices[i]-nowNum:answer);
            } else if (nowNum>prices[i]){
                nowNum=prices[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
/*
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 */