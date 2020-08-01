package toss2020CodingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Stack;

public class Solution04 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println("Hello Goorm! Your input is " + input);
        String[] inputArr = input.split(" ");

        HashSet<String> inputSet = new HashSet<>();
        for (int i = 0 ; i < inputArr.length ; i++){
            String iArr = inputArr[i];
            if(!inputSet.contains(iArr)){
                inputSet.add(iArr);

            }
        }
    }
}
