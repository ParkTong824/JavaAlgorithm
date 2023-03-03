package programmersLevel0;

import java.util.HashMap;
import java.util.Map;

public class Solution31 {
    public static int solution(String before, String after) {
        int answer = 0;
        Map<Integer, Map<Character,Integer>> checkMap = new HashMap<>();
        checkMap.put(0, new HashMap<>());
        checkMap.put(1, new HashMap<>());
        for (int i = 0 ; i < before.length() ; i++) {
            if (checkMap.get(0).containsKey(before.charAt(i))) {
                checkMap.get(0).put(before.charAt(i),checkMap.get(0).get(before.charAt(i))+1);
            }
            if (!checkMap.get(0).containsKey(before.charAt(i))) {
                checkMap.get(0).put(before.charAt(i),1);
            }

            if (checkMap.get(1).containsKey(after.charAt(i))) {
                checkMap.get(1).put(after.charAt(i),checkMap.get(1).get(after.charAt(i))+1);
            }
            if (!checkMap.get(1).containsKey(after.charAt(i))) {
                checkMap.get(1).put(after.charAt(i),1);
            }
        }

        for (char checkKey : checkMap.get(0).keySet()) {
            if (checkMap.get(0).get(checkKey) == checkMap.get(1).get(checkKey)) {
                checkMap.get(1).remove(checkKey);
            } else {
                return 0;
            }
        }
        if (checkMap.get(1).keySet().size() > 0) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        String before = "allpe";
        String after = "apple";
        solution(before,after);
    }
}

/*
문제 설명
문자열 before와 after가 매개변수로 주어질 때,
before의 순서를 바꾸어 after를 만들 수 있으면 1을,
만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.

제한사항
0 < before의 길이 == after의 길이 < 1,000
before와 after는 모두 소문자로 이루어져 있습니다.
입출력 예
before	after	result
"olleh"	"hello"	1
"allpe"	"apple"	0
 */
