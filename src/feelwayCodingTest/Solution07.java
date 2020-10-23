package feelwayCodingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution07 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] inputArr = new String[Integer.parseInt(input)];
        for (int i = 0 ; i < Integer.parseInt(input) ; i++){
            inputArr[i] = br.readLine();
        }

        System.out.println(solution(inputArr));
    }

    public static String solution(String[] inputArr){
        String answer = "";
        int[][] requestArr = new int[inputArr.length][2];
        for (int i = 0 ; i < inputArr.length ; i++){
            String[] splitArr = inputArr[i].split(" ");
            requestArr[i][0] = Integer.parseInt(splitArr[0]);
            requestArr[i][1] = Integer.parseInt(splitArr[1]);
        }
        int count = 0;
        while (count<inputArr.length) {
            double bigCost = 0;
            int bigCostIndex = 0;
            for (int i = 0; i < requestArr.length; i++) {
                if (bigCost < requestArr[i][1] / requestArr[i][0]) {
                    bigCostIndex = i;
                    bigCost = requestArr[i][1] / requestArr[i][0];
                }
            }
            answer = answer+(bigCostIndex+1);
            requestArr[bigCostIndex][1]=0;
            count++;
            if (count!=inputArr.length){
                answer = answer + " ";
            }
        }
        return answer;
    }
}
/*
Arrays.sort(requestArr, (o1, o2) -> {
            if (o1[0]==o2[0]){
                return Integer.compare(o1[1],o2[1]);
            }else {
                return Integer.compare(o1[0],o2[0]);
            }
        });
 */