package devMatching2021;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution03 {
    public static int solution(String s) {
        if (s.length()==1){
            return 0;
        }
        long answer = 0;
        Map<Character,int[]> keyMap = new HashMap<>();
        char[][] temp = {
                {'q','w','e','r','t','y','u','i','o'},
                {'p','a','s','d','f','g','h','j','k'},
                {'l','z','x','c','v','b','n','m'}
        };
        for (int i = 0 ; i < temp.length ; i++){
            for (int j = 0 ; j < temp[i].length ; j++) {
                keyMap.put(temp[i][j],new int[]{i,j});
            }
        }

        Map<String, Integer> cacheMap = new HashMap<>();

        for (int i = 2 ; i <= s.length() ; i++) {
            for (int j = 0 ; j+i-1<s.length(); j++) {
                String subset=s.substring(j,j+i);
                if (cacheMap.containsKey(subset)){
                    answer = answer+cacheMap.get(subset);
                } else {
                    int plusNum = 0;
                    if (cacheMap.containsKey(subset.substring(0,subset.length()-1))) {
                        int[] lastIndex = keyMap.get(subset.charAt(subset.length()-2));
                        int[] checkIndex = keyMap.get(subset.charAt(subset.length()-1));
                        plusNum = cacheMap.get(subset.substring(0,subset.length()-1))+Math.abs(checkIndex[0]-lastIndex[0])+Math.abs(checkIndex[1]-lastIndex[1]);
                        cacheMap.put(subset,plusNum);
                        answer = answer + plusNum;
                    } else {
                        int[] charIndex = keyMap.get(subset.charAt(0));
                        int[] tempIndex;
                        for (int k = 1 ; k < subset.length() ; k++) {
                            tempIndex = keyMap.get(subset.charAt(k));
                            plusNum = plusNum + Math.abs(tempIndex[0]-charIndex[0])+Math.abs(tempIndex[1]-charIndex[1]);
                            charIndex = keyMap.get(subset.charAt(k));
                        }
                        cacheMap.put(subset,plusNum);
                        answer = answer + plusNum;
                    }

                }
            }
        }
       return (int) (answer%(Math.pow(10,9)+7));
    }
    public static int checkCacheMap() {

    }

    public static void main(String[] args) {
        String s = "abcc";
        System.out.println(solution(s));
    }
}

/*
s	result
"abcc"	23
"tooth"	52
"zzz"	0
 */