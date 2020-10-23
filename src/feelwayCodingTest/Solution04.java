package feelwayCodingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution04 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        System.out.println(solution(input));
    }

    public static String solution(String input){
        String answer = "";
        String[] inputArr = input.split(" ");
        double average = 0;

        double sum = 0;
        for (int i = 0 ; i < inputArr.length ; i++){
            sum+=Double.parseDouble(inputArr[i]);
        }
        average = sum/inputArr.length;

        if (average>=90){
            answer = String.format("%.2f",average)+" A";
        }else if (average>=80){
            answer = String.format("%.2f",average)+" B";
        }else if (average>=70){
            answer = String.format("%.2f",average)+" C";
        }else if (average>=60){
            answer = String.format("%.2f",average)+" D";
        }else {
            answer = String.format("%.2f",average)+" F";
        }

        return answer;
    }
}
