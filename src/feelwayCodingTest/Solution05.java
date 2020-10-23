package feelwayCodingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution05 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        solution(input);
    }
    public static void solution(String input){
        int size = Integer.parseInt(input);
        for (int i = size ; i>0 ; i--){
            for (int j = 0 ; j<i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
