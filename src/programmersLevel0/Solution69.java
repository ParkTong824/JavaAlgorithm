package programmersLevel0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution69 {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0 ; i < emergency.length; i++) {
            indexMap.put(emergency[i], i);
        }
        Arrays.sort(emergency);
        for (int i = 0 ; i < emergency.length; i++) {
            int tempNum = emergency[i];
            answer[indexMap.get(tempNum)] = emergency.length-i;
        }
        return answer;
    }
}
