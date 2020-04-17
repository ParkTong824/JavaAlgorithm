package codingtestDevsisters;

import java.util.Stack;

public class Solution02 {
    public static void main(String[] args) {
        int[] snowballs = {1, 6, 4, 2, -2, -5};
        solution(snowballs);
    }

    public static int[] solution(int[] snowballs) {
        int[] answer = {};
        Stack<Integer> snowballsStack = new Stack<>();
        boolean isPlus = false;
        for (int i = 0; i < snowballs.length; i++) {
            int snowball = snowballs[i];
            if (snowballsStack.isEmpty()) {
                snowballsStack.add(snowball);
                if (snowball > 0) {
                    isPlus = true;
                }
            } else {
                if (isPlus) {
                    if (snowball > 0) {
                        snowballsStack.add(snowball);
                        continue;
                    } else {
                        while (!snowballsStack.isEmpty()) {
                            if (snowballsStack.peek() + snowball > 0) {
                                break;
                            } else if (snowballsStack.peek() + snowball == 0) {
                                snowballsStack.pop();
                                break;
                            } else {
                                snowballsStack.pop();
                            }
                            if (snowballsStack.size()==0){
                                snowballsStack.add(snowball);
                                isPlus=false;
                                break;
                            }
                        }
                        if(snowballsStack.isEmpty()&&(i!=snowballs.length-1)){
                            snowballsStack.add(snowball);
                            isPlus=false;
                        }
                    }
                } else {
                    if (snowball < 0) {
                        snowballsStack.add(snowball);
                    } else {
                        snowballsStack.add(snowball);
                        isPlus=true;
                    }

                }
            }
        }
        int arrSize = snowballsStack.size();
        answer = new int[snowballsStack.size()];
        for (int i = arrSize-1 ; i >= 0 ; i--){
            answer[i] = snowballsStack.pop();
        }

        System.out.println(answer[0]);
        System.out.println(answer[1]);
        return answer;
    }
}
/*
snowballs	result
[4, 5, -4]	[4, 5]
[5, -5]	[]
[5, -1, -2, -3, -4]	[5]
[1, 5, -5, 5, -5, 5, -5, -2]	[-2]
[1, 6, 4, 2, -2, -5]	[1, 6]
 */