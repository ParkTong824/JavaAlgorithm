package toss2020CodingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution06 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] inputArr = input.split(";");
        String[][] resultArr = new String[inputArr.length][];
        for (int i = 0 ; i < inputArr.length ; i ++){
            resultArr[i] = inputArr[i].split(" ");
        }

    }
}
