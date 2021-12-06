package devMatching2021;

import java.util.HashMap;
import java.util.Map;

public class Solution03_1 {
    public static int solution(String s) {
        char[][] temp = {
                {'q','w','e','r','t','y','u','i','o'},
                {'p','a','s','d','f','g','h','j','k'},
                {'l','z','x','c','v','b','n','m'}
        };
        Map<Character,int[]> keyMap = new HashMap<>();
        for (int i = 0 ; i < temp.length ; i++){
            for (int j = 0 ; j < temp[i].length ; j++) {
                keyMap.put(temp[i][j],new int[]{i,j});
            }
        }
        int answer = 0;
        int[] checkArr = new int[s.length()-1];
        for (int i = 0 ; i < s.length()-1 ; i++) {
            int[] firstIndex = keyMap.get(s.charAt(i));
            int[] secondIndex = keyMap.get(s.charAt(i+1));
            int plusNum = Math.abs(firstIndex[0]-secondIndex[0])+Math.abs(firstIndex[1]-secondIndex[1]);
            checkArr[i] = plusNum;
            answer+=plusNum;
        }
        for (int i = 2 ; i < s.length() ; i++) {
            for (int j = 0 ; j <= s.length()-i-1 ; j++) {
                for (int k = j ; k < j+i ; k++) {
                    answer+=checkArr[k];
                }
            }
        }


        return answer;
    }
    public static void main(String[] args) {
        String s = "tooth";
        System.out.println(solution(s));
    }
}
/*
abcdef
 ab  bc  cd  de  ef
  abc bcd cde def
  abcd bcde cdef
    abcde bcdef
     abcdef

5  2  1  2  3
 7  3  3  5
  8  5  6
   10  8
    18
"tooth"	52
"zzz"	0
 */
