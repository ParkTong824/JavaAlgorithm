package test;

import java.util.Arrays;

public class Solution07 {
    public static int solution(int[] bricks, int n, int k){
        if (k==1){
            return 0;
        }
        int answer = 0;
        int[] block = new int[bricks.length-2];
        for (int i = 1 ; i < bricks.length-1; i ++){
            block[i-1] = n - bricks[i];
        }

        for (int i = 0 ; i < k-1 ; i++){
            int minBlockCount = -1;
            int minBlockIndex = -1;
            for (int j = 0 ; j < block.length ; j++){
                if (block[j]==0){
                    continue;
                }
                if (minBlockCount==-1){
                    minBlockCount=block[j];
                    minBlockIndex=j;
                    continue;
                }
                minBlockIndex = minBlockCount<=block[j]?minBlockIndex:j;
                minBlockCount = minBlockCount<=block[j]?minBlockCount:block[j];
            }
            answer+=minBlockCount;
            block[(minBlockIndex-1<0?minBlockIndex:minBlockIndex-1)]=0;
            block[(minBlockIndex+1==block.length?minBlockIndex:minBlockIndex+1)]=0;
            block[minBlockIndex]=0;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] bricks = {0,1,2,3,4};
        int n = 5;
        int k = 2;
        System.out.println(solution(bricks,n,k));
    }
}
