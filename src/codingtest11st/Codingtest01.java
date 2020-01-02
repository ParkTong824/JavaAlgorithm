package codingtest11st;

import java.util.*;

public class Codingtest01 {
    public static void main(String[] args) {
        int N = 14;
        System.out.println(Arrays.toString(solution(N)));
    }

    public static int[] solution(int N) {
        int[] answer = {};
        int[] result = {0, 0};
        Queue<Integer> numberQue = new LinkedList<>();
        Map<Integer, Integer> baseMap = new HashMap<>();
        for (int i = 2; i < 10; i++) {
            int number = N;
            int multiple = 1;
            while (number != 0) {
                int remain = number % i;
                number /= i;
                numberQue.offer(remain);
                //pull peek
            }
            while (numberQue.size() != 0) {
                int num = numberQue.poll();
                if (num == 0) {
                    continue;
                } else {
                    multiple *= num;
                }
            }
            baseMap.put(i, multiple);
        }
        for (int i = 2; i < 10; i++) {
            if (baseMap.get(i) >= result[1]) {
                result[0] = i;
                result[1] = baseMap.get(i);
            }
        }
        answer = result;
        return answer;
    }
}
