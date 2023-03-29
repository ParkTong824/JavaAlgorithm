package programmersLevel0;

public class Solution47 {
    public int solution(int[] numbers) {
        int answer = -100000001;
        for (int i = 0 ; i < numbers.length ; i++) {
            if (i == numbers.length-1){
                break;
            }
            for (int j = i+1 ; j < numbers.length ; j++) {
                if (numbers[i] * numbers[j] > answer) {
                    answer = numbers[i] * numbers[j];
                }
            }
        }
        return answer;
    }
}
