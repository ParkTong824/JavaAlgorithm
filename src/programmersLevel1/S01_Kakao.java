package programmersLevel1;

import java.util.HashMap;
import java.util.Map;

public class S01_Kakao {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        int[] checkArr = new int[id_list.length];
        Map<String, Integer> checkMap = new HashMap<>();
        Map<String, Integer> userMap = new HashMap<>();
        for (int i = 0 ; i < report.length ; i++) {
            String[] tempArr = report[i].split(" ");
            if (checkMap.containsKey(tempArr[1])) {
                checkMap.put(tempArr[1],checkMap.get(tempArr[1])+1);
            } else {
                checkMap.put(tempArr[1],1);
            }

            if (userMap.containsKey(tempArr[0])) {
                checkMap.put(tempArr[0],checkMap.get(tempArr[0])+1);
            } else {
                checkMap.put(tempArr[0],1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Map<String, Integer> test = new HashMap<>();
        String testString = "test";
        test.put("test",1);

        System.out.println(test.get("test"));

    }
}
/*
id_list	report	k	result
["muzi", "frodo", "apeach", "neo"]	["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"]	2	[2,1,1,0]
["con", "ryan"]	["ryan con", "ryan con", "ryan con", "ryan con"]	3	[0,0]
 */
