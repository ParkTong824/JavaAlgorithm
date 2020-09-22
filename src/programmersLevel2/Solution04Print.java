package programmersLevel2;

import java.util.*;

public class Solution04Print {
    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        System.out.println(solution(priorities,location));
    }
    public static int solution(int[] priorities, int location) {
        int answer = 1;
        Queue<Integer> printQue = new LinkedList<>();

        for (int i : priorities){
            printQue.add(i);
        }
        Arrays.sort(priorities);
        Stack<Integer> printStack = new Stack<>();
        for (int i : priorities){
            printStack.add(i);
        }
        while (true){
            int nowPrint = printQue.poll();

            if (location==0&&printStack.peek()==nowPrint){
                return answer;
            }
            if (printStack.peek()<=nowPrint){
                printStack.pop();
                answer++;
                location--;
            }else {
                printQue.add(nowPrint);
                location--;
            }
            if (location==-1){
                location = printStack.size()-1;
            }
        }
    }
}

/*
priorities	location	return
[2, 1, 3, 2]	2	1
[1, 1, 9, 1, 1, 1]	0	5
 */