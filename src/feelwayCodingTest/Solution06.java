package feelwayCodingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution06 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        System.out.println(solution(input));
    }

    public static int solution(String input){
        int answer = 0;
        int bound = Integer.parseInt(input);

        for (int i = 1 ; i <= bound ; i++){
            if (i%3==0||i%5==0){
                answer+=i;
            }
        }

        return answer;
    }
}
