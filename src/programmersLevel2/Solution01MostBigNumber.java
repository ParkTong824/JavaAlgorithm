package programmersLevel2;

import java.util.Arrays;

public class Solution01MostBigNumber {
    public static void main(String[] args) {
        int[] numbers = {34,32,3,33,36,124,123,12};
        solution(numbers);
    }
    public static int[] StringArrToIntArr(String[] s) {
        int[] result = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            result[i] = Integer.parseInt(s[i]);
        }
        return result;
    }
    public static String solution(int[] numbers) {
        String answer = "";
        String[][] stringSplit = new String[numbers.length][];
        int[][] numberSplit = new int[numbers.length][];
        for (int i = 0 ; i< numbers.length ; i++){
            stringSplit[i]=String.valueOf(numbers[i]).split("");
            numberSplit[i]=StringArrToIntArr(stringSplit[i]);
        }
        Arrays.sort(numberSplit,((o1, o2) -> {
            if (o1[0]==o2[0]){
                if (o1.length==1){
                    return Integer.compare(o1[0],o2[1]);
                }else if(o2.length==1){
                    return Integer.compare(o1[1],o2[0]);
                }else {
                    return Integer.compare(o1[1],o2[1]);
                }
            }else{
                return Integer.compare(o1[0],o2[0]);
            }
        }));

        return answer;
    }
}
/*
제한 사항
numbers의 길이는 1 이상 100,000 이하입니다.
numbers의 원소는 0 이상 1,000 이하입니다.
정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
입출력 예
numbers	return
[6, 10, 2]	6210
[3, 30, 34, 5, 9]	9534330
 */