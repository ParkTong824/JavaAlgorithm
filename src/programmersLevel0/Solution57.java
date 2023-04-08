package programmersLevel0;

import java.util.Arrays;

public class Solution57 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length-1] * numbers[numbers.length-2];
    }
}
