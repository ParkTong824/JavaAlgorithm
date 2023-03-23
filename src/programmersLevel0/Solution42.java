package programmersLevel0;

import java.util.HashSet;
import java.util.Set;

public class Solution42 {
    public static int solution(String[] spell, String[] dic) {
        Set<Character> checkSet = new HashSet<>();
        for (String i : spell) {
            checkSet.add(i.charAt(0));
        }
        for (String checkString : dic) {
            Set<Character> tempSet = new HashSet<>(checkSet);
            char[] checkArr = checkString.toCharArray();
            for (int i = 0 ; i < checkArr.length ; i++) {
                if (!tempSet.contains(checkArr[i])){
                    break;
                } else {
                    tempSet.remove(checkArr[i]);
                }
                if (i == checkArr.length-1 && tempSet.size() == 0) {
                    return 1;
                }
            }
        }

        return 2;
    }

    public static void main(String[] args) {
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
        solution(spell, dic);
    }
}
