package leetcode5;

import java.util.*;

public class S500_keyboardRow {
    public static void main(String[] args) {
        String[] test = {"Hello","Alaska","Dad","Peace"};

        System.out.println(Arrays.toString(findWords(test)));
    }
    public static String[] findWords(String[] words) {
        Map<Integer, Set> checkMap = new HashMap<>();
        checkMap.put(0,new HashSet<>(Arrays.asList("q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "[", "]", "\\")));
        checkMap.put(1,new HashSet<>(Arrays.asList("a", "s", "d", "f", "g", "h", "j", "k", "l", ";", "'")));
        checkMap.put(2,new HashSet<>(Arrays.asList("z", "x", "c", "v", "b", "n", "m", ",", ".", "/")));
        List<String> result = new ArrayList<>();
        for (int i = 0 ; i < words.length ; i++) {
            String[] tempArr = words[i].split("");
            int lineNum = 0;
            for (int j = 0 ; j < 3 ; j++) {
                if (checkMap.get(j).contains(tempArr[0].toLowerCase())) {
                    lineNum = j;
                    break;
                }
            }
            boolean isContain = true;
            for (int j = 1 ; j < tempArr.length ; j++) {
                if (!checkMap.get(lineNum).contains(tempArr[j].toLowerCase())){
                    isContain = false;
                    break;
                }
            }
            if (isContain) {
                result.add(words[i]);
            }
        }
        String[] answer = new String[result.size()];
        for (int i = 0 ; i < result.size() ; i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}
