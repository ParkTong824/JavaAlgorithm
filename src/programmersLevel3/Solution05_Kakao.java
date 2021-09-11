package programmersLevel3;

public class Solution05_Kakao {
    public int solution(String dartResult) {
        int answer = 0;
        char[] dartArr = dartResult.toCharArray();
        int lastNum = 0;
        int nowNum = 0;
        for (int i = 0 ; i < dartArr.length ; i++) {
            if (dartArr[i]>='0' && dartArr[i]<='9'){
                if(dartArr[i]=='0' && nowNum==1){
                    nowNum= 10;
                } else {
                    nowNum = Character.getNumericValue(dartArr[i]);
                }
            } else if(dartArr[i]=='S' || dartArr[i]=='D' || dartArr[i]=='T'){
                switch (dartArr[i]){
                    case 'D': nowNum=nowNum*nowNum;
                        break;
                    case 'T': nowNum=nowNum*nowNum*nowNum;
                        break;
                }
                if(i+1<dartArr.length){
                    if(dartArr[i+1]=='*' || dartArr[i+1]=='#'){
                        switch (dartArr[i+1]){
                            case '*':
                                lastNum = lastNum * 2;
                                nowNum = nowNum * 2;
                                break;
                            case '#': nowNum=nowNum*(-1);
                                break;
                        }
                        answer+=lastNum;
                        lastNum=nowNum;
                    }
                }
            }
        }
        answer+=lastNum;

        return answer;
    }
}
