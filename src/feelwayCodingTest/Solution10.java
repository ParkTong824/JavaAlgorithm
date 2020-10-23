package feelwayCodingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution10 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        solution(input);
    }

    public static void solution(String input){
        String[] inputArr = input.split("");
        Map<String,Integer> charMap = new HashMap<>();

        for (int i = 0 ; i < inputArr.length ; i++){
            String character = inputArr[i];
            if (character.equals(" ")){
                continue;
            }
            character = character.toLowerCase();

            if (charMap.containsKey(character)){
                charMap.replace(character,charMap.get(character)+1);
            }else {
                charMap.put(character,1);
            }
        }
        for (char i = 'a' ; i<='z' ; i++){
            String line = i+" : ";
            String charToString = String.valueOf(i);
            if (charMap.containsKey(charToString)){
                line=line+charMap.get(charToString);
            }else {
                line=line+"0";
            }
            System.out.println(line);
        }
    }
}
