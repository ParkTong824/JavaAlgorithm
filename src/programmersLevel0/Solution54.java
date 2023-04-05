package programmersLevel0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution54 {
    public int[] solution(String my_string) {
        List<Integer> checkList = new ArrayList<>();
        for (int i = 0 ; i < my_string.length() ; i++) {
            char checkCharacter = my_string.charAt(i);
            if (checkCharacter >='0' && checkCharacter <= '9') {
                checkList.add(Integer.parseInt(String.valueOf(checkCharacter)));
            }
        }
        int[] answer = new int[checkList.size()];
        for (int i = 0 ; i < checkList.size() ; i++) {
            answer[i] = checkList.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
