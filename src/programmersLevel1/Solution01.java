package programmersLevel1;

public class Solution01 {
    public static void main(String[] args) {
        System.out.println(solution("   ABCvnernalf     asudjvojs sdn cvkap "));
    }

    public static String solution(String s) {
        String answer = "";

        String[] sentenseSplit = s.split(" ");

        for (int i = 0 ; i<sentenseSplit.length ; i++){
            if(sentenseSplit[i].length()==0){
                continue;
            }
            char[] wordSplit = sentenseSplit[i].toCharArray();

            for (int j = 0 ; j<wordSplit.length ; j++){
                if (j%2==0&&wordSplit[j]>='a'){
                    wordSplit[j]-=32;
                }else if(j%2==1&&wordSplit[j]<='Z'){
                    wordSplit[j]+=32;
                }
            }
            if(!answer.equals("")){
                answer+=" ";
            }
            answer += String.valueOf(wordSplit);
        }

        return answer;
    }
}
/*
    문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
        첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
        입출력 예
        s	return
        try hello world	TrY HeLlO WoRlD
 */

