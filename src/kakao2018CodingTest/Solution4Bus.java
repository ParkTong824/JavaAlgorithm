package kakao2018CodingTest;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution4Bus {
    public static void main(String[] args) {
        int n = 2;
        int t = 1;
        int m = 2;
        String[] timetable = {"08:00","08:00","08:00","09:00"};

        System.out.println(solution(n,t,m,timetable));

    }
    public static int[] nextBus(int[] bus,int time){
        bus[1]=bus[1]+time;
        if (bus[1]>=60){
            bus[1]=bus[1]%60;
            bus[0]++;
        }
        return bus;
    }
    public static String solution(int n, int t, int m, String[] timetable) {
        String answer = "";

        //timetable sort 과정
        int[][] splitTable = new int[timetable.length][2];
        for (int i = 0 ; i < splitTable.length ; i++){
            String[] split = timetable[i].split(":");
            splitTable[i][0] = Integer.parseInt(split[0]);
            splitTable[i][1] = Integer.parseInt(split[1]);
        }
        Arrays.sort(splitTable,((o1, o2) -> {
            if (o1[0]==o2[0]){
                return Integer.compare(o1[1],o2[1]);
            }else{
                return Integer.compare(o1[0],o2[0]);
            }
        }));

        //sort Queue에 저장
        Queue<int[]> timeQue = new LinkedList<>();
        for(int i = 0 ; i < timetable.length ; i++){
            timeQue.add(splitTable[i]);
        }

        int count = n;
        int member= m;
        boolean isFull = true;
        int[] bus = {9,0};
        int[] frontBus = {};
        int[] lastPerson ={};
        while (count>0){
            int[] crew = timeQue.peek();

            if (bus[0]>=crew[0]){
                if (bus[0]>crew[0]){
                    lastPerson = timeQue.poll();
                    member--;
                } else {
                    if (bus[1]>=crew[1]){
                        lastPerson = timeQue.poll();
                        member--;
                    } else {
                        member=m;
                        count--;
                        nextBus(bus,t);
                        continue;
                    }
                }
            } else {
                count--;
                if(count==0&&member>0){
                    isFull=false;
                    break;
                }
                member=m;
                int a = bus[0];
                int b = bus[1];
                frontBus= new int[]{a, b};
                nextBus(bus,t);
            }

            if (timeQue.isEmpty()&&member>0){
                return answer=String.format("%02d",bus[0])+":"+String.format("%02d",bus[1]);
            }
            if(member==0){
                count--;
                member=m;
                nextBus(bus,t);
            }
        }
        if(lastPerson.length==0){
            answer=String.format("%02d",frontBus[0])+":"+String.format("%02d",frontBus[1]);
        }else if (lastPerson[1]>0){
            answer=String.format("%02d",lastPerson[0])+":"+String.format("%02d",(lastPerson[1]-1));
        }else {
            answer=String.format("%02d",(lastPerson[0]-1))+":"+(59);
        }
        if (!isFull){
            answer=String.format("%02d",bus[0])+":"+String.format("%02d",bus[1]);
        }


        return answer;
    }


}
/*
입력 형식
셔틀 운행 횟수 n, 셔틀 운행 간격 t, 한 셔틀에 탈 수 있는 최대 크루 수 m, 크루가 대기열에 도착하는 시각을 모은 배열 timetable이 입력으로 주어진다.

0 ＜ n ≦ 10
0 ＜ t ≦ 60
0 ＜ m ≦ 45
timetable은 최소 길이 1이고 최대 길이 2000인 배열로, 하루 동안 크루가 대기열에 도착하는 시각이 HH:MM 형식으로 이루어져 있다.
크루의 도착 시각 HH:MM은 00:01에서 23:59 사이이다.
출력 형식
콘이 무사히 셔틀을 타고 사무실로 갈 수 있는 제일 늦은 도착 시각을 출력한다. 도착 시각은 HH:MM 형식이며, 00:00에서 23:59 사이의 값이 될 수 있다.

입출력 예제
n	t	m	timetable	answer
1	1	5	[08:00, 08:01, 08:02, 08:03]	09:00
2	10	2	[09:10, 09:09, 08:00]	09:09
2	1	2	[09:00, 09:00, 09:00, 09:00]    08:59

	10, 60, 45, ["23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59"]
기댓값 〉	"18:00"
 */