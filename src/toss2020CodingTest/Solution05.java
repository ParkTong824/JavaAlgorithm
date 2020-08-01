package toss2020CodingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution05 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1 = br.readLine();
        String input2 = br.readLine();

        String[] input1Arr = input1.split(" ");
        String[] input2Arr = input2.split(" ");
        String answer = "";
        int money = 0;
        for(int i = 0 ; i < input1Arr.length ; i++){
            int input1Int = Integer.parseInt(input1Arr[i]);
            int input2Int = Integer.parseInt(input2Arr[i]);
            if (input1Int > input2Int+money){
                answer = answer + String.valueOf(input1Int-(input2Int+money));
                money = 0;
            }else {
                answer = answer + "0";
                money = (input2Int+money)-input1Int;

            }

            if(i != input1Arr.length-1){
                answer = answer + " ";
            }
        }

        System.out.println(answer);

    }
}
