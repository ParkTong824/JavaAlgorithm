package programmersLevel0;

public class Solution60 {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        boolean isLeft = false;
        int tempNumber = 0;
        int pivotNumber = 0;
        if (direction.equals("left")) {
            pivotNumber = numbers[numbers.length-1];
            for (int i = numbers.length-1 ; i >= 0 ; i--) {
                if (i-1 >=0) {
                    tempNumber = numbers[i-1];
                    numbers[i-1] = tempNumber;
                } else {

                }
            }
        } else {
            for (int i = 0 ; i < numbers.length ; i++) {

            }
        }


        return answer;
    }
}
