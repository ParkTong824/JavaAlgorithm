package programmersLevel0;

import java.util.Arrays;

public class Solution84 {
    public double solution(int[] numbers) {

        return Arrays.stream(numbers).asDoubleStream().sum()/numbers.length;
    }
}
