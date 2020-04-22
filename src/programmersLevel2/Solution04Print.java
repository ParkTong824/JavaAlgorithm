package programmersLevel2;

import java.util.LinkedList;
import java.util.Queue;

public class Solution04Print {
    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        solution(priorities,location);
    }
    public static int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> prioritiesQue = new LinkedList<>();
        for (int i = 0 ; i < priorities.length ; i++){
            prioritiesQue.add(i);
        }
        int mostBig = 0;

        while (prioritiesQue.contains(location)){
            int indexNo = prioritiesQue.poll();
            int size = prioritiesQue.size();
            int priority = priorities[indexNo];
            int same = 0 ;
            Queue<Integer> pollQue = new LinkedList<>(prioritiesQue);
            for (int i = 0 ; i < size ; i++){
                int index = pollQue.poll();
                if (priority<mostBig){
                    prioritiesQue.add(indexNo);
                    break;
                } else if (priority<priorities[index]){
                    prioritiesQue.add(indexNo);
                    mostBig=priorities[i];
                    break;
                }else if(priority==index){
                    same++;
                }
            }
            if (size>prioritiesQue.size()){
                answer++;
                mostBig=0;
            }else if(same==prioritiesQue.size()){
                answer++;
            }
        }
        return answer;
    }
}

/*
priorities	location	return
[2, 1, 3, 2]	2	1
[1, 1, 9, 1, 1, 1]	0	5
 */