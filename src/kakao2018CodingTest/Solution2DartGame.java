package kakao2018CodingTest;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2DartGame {

    public static void main(String[] args) {
        String dartResult = "1D2S#10S";

        System.out.println(solution(dartResult));
    }

    public static int solution(String dartResult) {
        int answer = 0;
        char[] dartArr = dartResult.toCharArray();
        Queue<Integer> doubleOption = new LinkedList<>();
        Queue<Integer> bonusOption = new LinkedList<>();
        int minusOption = 0;
        for (int i = dartArr.length-1 ; i >= 0 ; i--){
            if (dartArr[i]=='S'){
                bonusOption.add(1);
            }else if (dartArr[i]=='D'){
                bonusOption.add(2);
            }else if(dartArr[i]=='T'){
                bonusOption.add(3);
            }else{
                if(dartArr[i]=='*'){
                    doubleOption.add(2);
                    doubleOption.add(1);
                }else if(dartArr[i]=='#'){
                    minusOption = 1;
                }else {
                    int bonus = bonusOption.poll();
                    int result = 0;
                    if(dartArr[i]=='0'&&(i-1)>-1&&dartArr[i-1]=='1'){
                        for (int j = 0 ; j < bonus; j++){
                            if (j==0){
                                result = 10;
                            }else{
                                result = 10 * result;
                            }
                        }
                        i=i-1;
                    } else {
                        for (int j = 0 ; j < bonus; j++){
                            if (j==0){
                                result = Character.getNumericValue(dartArr[i]);
                            }else{
                                result = Character.getNumericValue(dartArr[i]) * result;
                            }
                        }
                    }
                    if (doubleOption.peek()!=null){
                        if (doubleOption.peek()==2){
                            result = result * 2;
                            doubleOption.poll();
                        }else if(doubleOption.peek()==1){
                            result = result * 2;
                            doubleOption.poll();
                            if (!doubleOption.isEmpty()){
                                result = result * 2;
                                doubleOption.poll();
                            }
                        }
                    }
                    if(minusOption!=0){
                        result = result * (-1);
                        minusOption = 0;
                    }

                    answer = answer + result;
                }
            }
        }
        return answer;
    }
}
/*
다트 게임은 총 3번의 기회로 구성된다.
각 기회마다 얻을 수 있는 점수는 0점에서 10점까지이다.
점수와 함께 Single(S), Double(D), Triple(T) 영역이 존재하고 각 영역 당첨 시 점수에서 1제곱, 2제곱, 3제곱 (점수1 , 점수2 , 점수3 )으로 계산된다.
옵션으로 스타상(*) , 아차상(#)이 존재하며 스타상(*) 당첨 시 해당 점수와 바로 전에 얻은 점수를 각 2배로 만든다. 아차상(#) 당첨 시 해당 점수는 마이너스된다.
스타상(*)은 첫 번째 기회에서도 나올 수 있다. 이 경우 첫 번째 스타상(*)의 점수만 2배가 된다. (예제 4번 참고)
스타상(*)의 효과는 다른 스타상(*)의 효과와 중첩될 수 있다. 이 경우 중첩된 스타상(*) 점수는 4배가 된다. (예제 4번 참고)
스타상(*)의 효과는 아차상(#)의 효과와 중첩될 수 있다. 이 경우 중첩된 아차상(#)의 점수는 -2배가 된다. (예제 5번 참고)
Single(S), Double(D), Triple(T)은 점수마다 하나씩 존재한다.
스타상(*), 아차상(#)은 점수마다 둘 중 하나만 존재할 수 있으며, 존재하지 않을 수도 있다.
0~10의 정수와 문자 S, D, T, *, #로 구성된 문자열이 입력될 시 총점수를 반환하는 함수를 작성하라.

점수는 0에서 10 사이의 정수이다.
보너스는 S, D, T 중 하나이다.
옵선은 *이나 # 중 하나이며, 없을 수도 있다.
예) 1S2D*3T
3번의 기회에서 얻은 점수 합계에 해당하는 정수값을 출력한다.

입출력 예제
예제	dartResult	answer	설명
1	1S2D*3T	 37	 11 * 2 + 22 * 2 + 33
2	1D2S#10S	9	12 + 21 * (-1) + 101
3	1D2S0T	3	12 + 21 + 03
4	1S*2T*3S	23	11 * 2 * 2 + 23 * 2 + 31
5	1D#2S*3S	5	1 2 * (-1) * 2 + 21 * 2 + 31
6	1T2D3D#	-4	13 + 22 + 32 * (-1)
7	1D2S3T*	59	12 + 21 * 2 + 33 * 2
 */