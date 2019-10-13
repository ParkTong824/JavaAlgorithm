package javaAlgorithm2;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution7 {
	
	public static void main(String[] args) {
		
		int[] scoville = {1,2,3,9,10,12};
		int K = 7;
		solution(scoville , K);
	}

	
	public static int solution(int[] scoville, int K) {
        int answer = 0;
        int count = 0;
        int[] scov = scoville;
        ArrayList<Integer> food = new ArrayList<Integer>();
        Arrays.sort(scov);
        for(int i=0 ; i<scov.length;i++) {
        	if(scov[i]<K) {
        		food.add(scov[i]);
        	}
        	else {
        		break;
        	}
        }
        while(food.size()!=0) {
        	food.add(food.get(0)+(food.get(1)*2));
        	food.remove(0);
        	food.remove(0);
        	food.sort(null);
        	count++;
        	if(food.get(0)>K) {
        		break;
        	}
        }
        answer = count;
        
        
        return answer;
    }
}

//scoville	K	return
//[1, 2, 3, 9, 10, 12]	7	2
//입출력 예 설명
//스코빌 지수가 1인 음식과 2인 음식을 섞으면 음식의 스코빌 지수가 아래와 같이 됩니다.
//새로운 음식의 스코빌 지수 = 1 + (2 * 2) = 5
//가진 음식의 스코빌 지수 = [5, 3, 9, 10, 12]