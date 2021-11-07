package leetcode5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class S387_FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> indexMap = new HashMap<>();
        Set<Character> checkSet = new HashSet<>();
        int result = -1;
        for (int i = 0 ; i < s.length() ; i++) {
            if (checkSet.add(s.charAt(i))) {
                indexMap.put(s.charAt(i),i);
            } else {
                if (indexMap.containsKey(s.charAt(i))){
                    indexMap.remove(s.charAt(i));
                }
            }
        }
        for ( char key : indexMap.keySet()) {
            if (result==-1 || indexMap.get(key)<result) {
                result = indexMap.get(key);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
}
