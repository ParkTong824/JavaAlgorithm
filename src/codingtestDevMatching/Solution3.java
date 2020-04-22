package codingtestDevMatching;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {
    public int solution(int[] numbers, int K) {
        int answer = 0;
        int min = 0;

        for(int i = 0; i < numbers.length-1; i++) {
            if(Math.abs(numbers[i] - numbers[i+1]) < K) continue;
            min = Math.min(minSwap(numbers, i, K), minSwap(numbers, i+1, Math.abs(numbers[i] - numbers[i+1])));
        }

        return answer = (min >= 9) ? -1 : min;
    }


    public int minSwap(int[] numbers, int index, int K) {

        if(condition(numbers, K)) return 1;

        if(index == numbers.length-1) {
            if(condition(numbers, K)) {
                return 1;
            }else {
                return 9;
            }
        }

        int count = 9;
        for(int i = index ; i < numbers.length-1; i++) {

            if(Math.abs(numbers[i] - numbers[index]) >= K) {
                swapArr(numbers,index,i);
                count = Math.min(count, minSwap(numbers, index+1, K)+1);
                swapArr(numbers,i,index);
            }
        }

        return count;
    }

    public void swapArr(int[] numbers, int s, int e) {
        int temp = 0;
        temp = numbers[s];
        numbers[s] = numbers[e];
        numbers[e] = temp;
    }

    public boolean condition(int[] numbers, int K) {
        for(int i = 0; i < numbers.length-1; i++) {
            if(Math.abs(numbers[i] - numbers[i+1]) > K) return false;
        }
        return true;
    }
}
/*
numbers	k	result
[10, 40, 30, 20]	20	1
[3, 7, 2, 8, 6, 4, 5, 1]	3	2
 */
