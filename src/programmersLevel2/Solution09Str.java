package programmersLevel2;

import java.util.Arrays;

public class Solution09Str {
    public static void main(String[] args) {

    }

    public String solution(String s) {
        String answer = "";
        String[] splitArr = s.split(" ");
        int[] toIntegerArr = new int[splitArr.length];
        for (int i = 0 ; i < splitArr.length ; i++){
            toIntegerArr[i] = Integer.parseInt(splitArr[i]);
        }
        Arrays.sort(toIntegerArr);

        answer=toIntegerArr[0] + " " + toIntegerArr[toIntegerArr.length-1];
        return answer;
    }
}

/*
1 2 3 4	  1 4
-1 -2 -3 -4  	-4 -1
-1 -1	-1 -1
 */