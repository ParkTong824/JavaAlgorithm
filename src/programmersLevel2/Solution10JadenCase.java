package programmersLevel2;

public class Solution10JadenCase {
    public static void main(String[] args) {

    }

    public String solution(String s) {
        String answer = "";
        String[] splitArr = s.split(" ");

        for (int i = 0 ; i < splitArr.length ; i ++){
            char[] wordSplit = splitArr[i].toCharArray();
            for (int j = 0 ; j < wordSplit.length ; j++){
                if (wordSplit[j]<'A'){
                    answer+=wordSplit[j];
                    continue;
                }
                if (j==0){
                    if (wordSplit[j]<='Z'){
                        answer+=wordSplit[j];
                        continue;
                    }else {
                        wordSplit[j]= (char) (wordSplit[j]-32);
                        answer+=wordSplit[j];
                    }
                }else {
                    if (wordSplit[j]>='a'){
                        answer+=wordSplit[j];
                        continue;
                    }else {
                        wordSplit[j]= (char) (wordSplit[j]+32);
                        answer+=wordSplit[j];
                    }
                }
            }

            if (i!=splitArr.length-1){
                answer = answer + " ";
            }
        }
        if (s.length()!=answer.length()){
            answer+=" ";
        }
        return answer;
    }
}

/*
s	return
3people unFollowed me	3people Unfollowed Me
for the last week	For The Last Week
 */