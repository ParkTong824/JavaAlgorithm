package devMatching2021;

public class Solution01 {
    public static int solution(String[] drum) {
        int answer = 0;
        for ( int i = 0 ; i < drum.length ; i++) {
            int[] nowIndex = new int[]{0,i};
            int starCount = 0;
            boolean isFinish = false;
            while (true) {
                if (starCount==2){
                    break;
                }
                if (nowIndex[1]<0 || nowIndex[1]>=drum[0].length()){
                    break;
                }
                if(nowIndex[0]==drum.length){
                    isFinish=true;
                    break;
                }
                switch (drum[nowIndex[0]].charAt(nowIndex[1])){
                    case '#':
                        nowIndex[0]++;
                        break;
                    case '>':
                        nowIndex[1]++;
                        break;
                    case '<':
                        nowIndex[1]--;
                        break;
                    case '*':
                        nowIndex[0]++;
                        starCount++;
                        break;
                }
            }
            if (isFinish) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] drum = {"######",">#*###","####*#","#<#>>#",">#*#*<","######"};
        System.out.println(solution(drum));
    }
}

/*
drum	return
["######",">#*###","####*#","#<#>>#",">#*#*<","######"]	4
 */
