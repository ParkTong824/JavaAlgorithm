package toss2020CodingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Solution03 {
    public static void main(String[] args) throws Exception {
        // [!!주의!!] Function.compute 함수는 이미 구현되어있지만, 숨김처리되어 있습니다. 호출해서 테스트 해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String output = "";
        String[] inputArr = input.split(" ");
        HashMap<String,Integer> inputHash = new HashMap<>();

        for (int i = 0 ; i< inputArr.length ; i++){
            if (inputHash.containsKey(inputArr[i])){
                output += inputHash.get(inputArr[i]);
            }else {
//                int comp = Function.compute(Integer.parseInt(inputArr[i]));
//                output += comp;
//                inputHash.put(inputArr[i],comp);
            }

            if (i != inputArr.length-1){
                output +=" ";
            }
        }
    }
}
