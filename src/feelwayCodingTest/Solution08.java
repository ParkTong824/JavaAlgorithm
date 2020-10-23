package feelwayCodingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution08 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        System.out.println(solution(input));
    }

    public static String solution(String input){
        String answer = "";
        int num = Integer.parseInt(input);
        if (num%2==0){
            answer="even";
        }else {
            answer="odd";
        }
        return answer;
    }
}
