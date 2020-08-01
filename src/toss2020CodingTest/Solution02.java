package toss2020CodingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution02 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String isRight = "false";
        String[] inputArr = input.split(" ");

        int lastNum = 0;
        for (int i = 0 ; i<inputArr.length-1 ; i++){
            if(inputArr.length!=6){
                isRight = "false";
                break;
            }
            int nowNum = Integer.parseInt(inputArr[i]);
            if (lastNum<nowNum && nowNum<=45 && nowNum>0){
                lastNum = nowNum;
                isRight = "true";
            }else {
                isRight = "false";
                break;
            }
        }
        System.out.println(isRight);
    }
}
/*
규칙
로또 번호는 중복되지 않는 숫자 6개로 구성된다.
각 번호는 1 부터 45 까지의 숫자로 구성된다.
로또 번호는 오름차순으로 정렬되어야 한다.

위의 규칙을 모두 준수하는 로또 번호면 true 그렇지 않으면 false를 반환하는 코드를 구현해주시면 됩니다.
 */