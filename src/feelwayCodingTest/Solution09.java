package feelwayCodingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution09 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String size = br.readLine();
        String index = br.readLine();
        String count = br.readLine();

        System.out.println(solution(index,count));
    }

    public static String solution(String index, String count){
        String answer = "";
        String[] indexArr = index.split(" ");
        int[] intArr = new int[indexArr.length];
        for (int i = 0 ; i < indexArr.length;i++){
            intArr[i]=Integer.parseInt(indexArr[i]);
        }
        int intCount = Integer.parseInt(count)+1;
        for (int i = 0 ; i< intCount ; i++){
            int standard = intArr[i];
            int aux = i - 1;

            while (aux >= 0 && standard < intArr[aux]) {
                intArr[aux + 1] = intArr[aux];
                aux--;
            }

            intArr[aux + 1] = standard;
        }

        for (int i = 0 ; i<intArr.length ; i++){
            answer=answer+intArr[i]+" ";
        }
        return answer;
    }
}
/*
8
10 88 39 21 83 99 57 7
6
10 21 39 57 83 88 99 7
 */
