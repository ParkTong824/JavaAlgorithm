package feelwayCodingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution03 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        System.out.println(solution(input));
    }
    public static int solution(String input){
        int answer = 0;
        String[] inputArray = input.split(" ");
        int size = Integer.parseInt(inputArray[0]);
        int[] intArray = new int[size];
        int sum = 0;
        for (int i = 0 ; i < intArray.length ; i++){
            intArray[i]=Integer.parseInt(inputArray[i+1]);
            sum +=intArray[i];
        }
        int myAddr = sum/size;
        for (int i = 0 ; i < size ; i++){
            answer+=Math.abs(myAddr-intArray[i]);
        }
        return answer;
    }
}
