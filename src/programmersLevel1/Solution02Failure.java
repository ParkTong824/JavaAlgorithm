package programmersLevel1;

import java.util.Arrays;

public class Solution02Failure {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        Arrays.toString(solution(N,stages));
    }
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[][] stageArr = new double[N+1][2];
        int count = 0;
        int beforeStage = 0;
        int failStage = 1;
        stageArr[0][1]=1;
        Arrays.sort(stages);
        while (count<stages.length){
            if (stages[count]!=failStage){
                stageArr[failStage-1][0]=stageArr[failStage-1][0]/(stages.length-beforeStage);
                beforeStage=count;
                failStage++;
                stageArr[failStage-1][0]=0;
                stageArr[failStage-1][1]=failStage;
            }else {
                stageArr[failStage-1][0]++;
                count++;
            }
            if (count==stages.length&&failStage==N){
                stageArr[failStage-1][0]=stageArr[failStage-1][0]/(stages.length-beforeStage);
                stageArr[failStage][0]=2;
            }else if (count==stages.length&&failStage==N+1){
                stageArr[failStage-1][0]=2;
            }
        }

        Arrays.sort(stageArr,(o1, o2) -> {
            if (o1[0]==o2[0]){
                return -Double.compare(o1[1],o2[1]);
            }else{
                return Double.compare(o1[0],o2[0]);
            }
        });
        for (int i = 0 ; i < N ; i++){

            answer[i] = (int)stageArr[N-i-1][1];
        }
        return answer;
    }
}
/*
N	stages	result
5	[2, 1, 2, 6, 2, 4, 3, 3]	[3,4,2,1,5]
4	[4,4,4,4,4]	[4,1,2,3]


public String solution(String number, int k) {
        int idx = 0;
        char max;
        StringBuilder answer = new StringBuilder();

        if(number.charAt(0) == '0') return "0";
        for(int i = 0; i < number.length() - k; i++) {
            max = '0';
            for(int j = idx; j <= k + i; j++) {
                if(max < number.charAt(j)) {
                    max = number.charAt(j); idx = j + 1;
                }
            }
            answer.append(max);
        }
        return answer.toString();
    }
 */
