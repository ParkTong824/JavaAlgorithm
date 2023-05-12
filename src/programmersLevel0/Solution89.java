package programmersLevel0;

import java.util.*;
import java.util.stream.Collectors;

public class Solution89 {
    public int solution(int[] array) {
        int answer = 0;
        Map<Integer,Integer> keyMap = new HashMap<>();
        for (int number : array) {
            if (keyMap.containsKey(number)) {
                keyMap.put(number, keyMap.get(number)+1);
            } else {
                keyMap.put(number, 1);
            }
        }
        List<Integer> valueList = keyMap.values().stream().sorted().collect(Collectors.toList());
        try {
            if ( valueList.get(valueList.size()-1) == valueList.get(valueList.size()-2) ) {
                return -1;
            } else {
                return valueList.get(valueList.size()-1);
            }
        } catch (IndexOutOfBoundsException e) {
            return valueList.get(valueList.size()-1);
        }
    }
}
