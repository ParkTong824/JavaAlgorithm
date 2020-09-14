package programmersLevel3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution01 {
    public static void main(String[] args) {

    }

    public static String solution(int n, int t, int m, String[] timetable) {
        String answer = "";
        int[] substringTimetable = new int[timetable.length];
        for (int i = 0 ; i < timetable.length ; i++){
            substringTimetable[i] = Integer.parseInt(timetable[i].substring(0,2)+timetable[i].substring(3));
        }
        Arrays.sort(substringTimetable);

        int busTime = 900;
        Queue<Integer> timeQue = new LinkedList<>();
        for (int i : substringTimetable){
            timeQue.add(substringTimetable[i]);
        }

        for (int i = 0 ; i < n ; i++){
            int member = m;
            while (member!=0){
                if (timeQue.peek()<=busTime){
                    m--;
                    timeQue.poll();
                }else {
                    break;
                }
            }
            busTime += t ;
            if (busTime%100>=60){
                busTime += 40;
            }
        }
        return answer;
    }

}

/*
n	t	m	timetable	answer
1	1	5	[08:00, 08:01, 08:02, 08:03]	09:00
2	10	2	[09:10, 09:09, 08:00]	09:09
2	1	2	[09:00, 09:00, 09:00, 09:00]	08:59
1	1	5	[00:01, 00:01, 00:01, 00:01, 00:01]	00:00
1	1	1	[23:59]	09:00
10	60	45	[23:59,23:59, 23:59, 23:59, 23:59, 23:59, 23:59, 23:59, 23:59, 23:59, 23:59, 23:59, 23:59, 23:59, 23:59, 23:59]
 */