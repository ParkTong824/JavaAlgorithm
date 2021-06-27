package test;

public class Solution03 {
    public static void main(String[] args) {
        int N = 6;
        int K = 4;
        int[][] T = {{1,3},{3,4},{2,4},{2,4},{2,3},{1,2}};
        System.out.println(solution(N,K,T));
    }
    public static int solution(int N,int K, int [][]T) {
        int answer = 0;
        int nowDate = 1;
        while (nowDate<=K){
            int compareNum = -1;
            int index = 0;
            for (int i = 0 ; i < N ; i ++){
                if (T[i][0]!=0){
                    if (nowDate>=T[i][0] && nowDate<=T[i][1]){
                        if (compareNum==-1) {
                            compareNum=T[i][1]-nowDate;
                            index = i;
                        } else {
                            index = compareNum<=T[i][1]-nowDate?index:i;
                            compareNum = compareNum<=T[i][1]-nowDate?compareNum:T[i][1]-nowDate;
                        }
                    }
                }
            }
            if (compareNum!=-1){
                answer++;
                T[index][0]=0;
            }
            nowDate++;
        }
        return answer;
    }
}
/*
4	4	[[1,3],[1,1],[2,3],[3,4]]	4
6	4	[ [1,3],[3,4],[2,4],[2,4],[2,3],[1,2] ]	4
 */