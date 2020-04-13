package kakao2018CodingTest;

import java.util.LinkedList;
import java.util.Queue;

public class Solution3Chache {
    public static void main(String[] args) {
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};

        System.out.println(solution(cacheSize,cities));
    }
    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> cacheQue = new LinkedList<>();
        if(cacheSize==0){
            answer = 5*cities.length;
        }else{
            for (int i = 0 ; i < cities.length ; i++){
                if (cacheQue.size()<cacheSize){//cacheSize 보다 queue size 작을때
                    if(!cacheQue.contains(cities[i].toUpperCase())){
                        cacheQue.add(cities[i].toUpperCase());
                        answer=answer+5;
                    }else{
                        answer = answer+1;
                        cacheQue.remove(cities[i].toUpperCase());
                        cacheQue.add(cities[i].toUpperCase());
                    }

                }else { // queue 사이즈 찼을때
                    if(!cacheQue.contains(cities[i].toUpperCase())){ // cache miss
                        answer=answer+5;
                        cacheQue.remove();
                        cacheQue.add(cities[i].toUpperCase());
                    }else{ // cache hit
                        answer = answer+1;
                        cacheQue.remove(cities[i].toUpperCase());
                        cacheQue.add(cities[i].toUpperCase());
                    }
                }
            }
        }
        return answer;
    }
}

/*

 */