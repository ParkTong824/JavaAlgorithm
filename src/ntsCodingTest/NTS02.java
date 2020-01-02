package ntsCodingTest;

import java.util.HashSet;

public class NTS02 {
    public static void main(String[] args) {
        long n = 2322;
        System.out.println(solution(n));
    }
    public static int solution(long n){
        int answer = 0;
        long nNum = n;
        HashSet<Integer> numSet = new HashSet<>();
        while(nNum!=0){
            int num = (int)nNum%10;
            nNum=nNum/10;

            if(numSet.add(num)&&n%num==0){
                answer++;
            }
        }
        return answer;
    }
}
