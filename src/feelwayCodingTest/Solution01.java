package feelwayCodingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution01 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solution(input));
    }
    public static int solution(String input){
        int length = Integer.parseInt(input);
        int answer = 0;
        for (int i = 1 ; i <= length ; i ++){
            int remain = length-i;
            int second = i;
            int third = remain-second;
            while (true){
                if (third<second){
                    break;
                }
                if (third<second+i){
                    answer++;
                }
                second++;
                third--;
            }
        }

        return answer;
    }
}
/*
삼각형 만들기
input 9
output 3
 20    8
 */