package programmersLevel3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Solution03 {
    static int maxProfit(int price[], int start, int end) {

        if (end <= start){
            return 0;
        }

        int profit = 0;

        for (int i = start; i < end; i=i+2) {

            for (int j = i + 1; j <= end; j++) {

                if (price[j] > price[i]) {

                    int curr_profit = price[j] - price[i]
                            + maxProfit(price, start, i - 1) + maxProfit(price, j + 1, end);

                    profit = Math.max(profit, curr_profit);
                } else{

                }
            }
        }

        return profit;
    }

    static List<int[]> maxProfit(int price[][]){
        List<int[]> profit = new ArrayList<>();

        int minPrice = price[0][0];
        int minDay = 1;
        int maxPrice = price[0][1];

        int[] profitArr;

        for (int i = 1 ; i < price.length ; i++){

            if(maxPrice<price[i][1]){
                maxPrice=price[i][1];
            }else if (maxPrice==price[i][1]){

                profitArr = new int[]{minPrice, minDay, maxPrice, i};
                profit.add(profitArr);
                minPrice = price[i][0];
                maxPrice = price[i][1];
            }else {
                profitArr = new int[]{minPrice, minDay, maxPrice, i};
                profit.add(profitArr);
                minDay=i+1;
                minPrice = price[i][0];
                maxPrice = price[i][1];
            }
            if (i == price.length-1 && maxPrice == price[i][1]){
                profitArr = new int[]{minPrice, minDay, maxPrice, i+1};
                profit.add(profitArr);
            }
        }

        return profit;
    }

    public static void main(String[] args)
    {
        int price[][] = { {100, 180}, {260, 310},{100,120},{10,
                40},{10,450} ,{535, 695} };
        int n = price.length;
        List<int[]> profit = maxProfit(price);
        System.out.println(profit.size());
        System.out.println(Arrays.toString(profit.get(0)));
        System.out.println(Arrays.toString(profit.get(1)));
        System.out.println(Arrays.toString(profit.get(2)));
    }
}
