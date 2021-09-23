package leetcode5;

public class S367_ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int numLength = (int)(Math.log10(num)+1);
        int startNum = 1;
        int answerLength = 0;
        if (numLength>2){
            if (numLength%2==1){
                answerLength=numLength/2+1;
            } else {
                answerLength=numLength/2;
            }
            for (int i = 0 ; i < answerLength ; i++){
                startNum*=10;
            }
        }
        while (true){
            int compareNum = startNum*startNum;
            if (num==compareNum){
                return true;
            } else if (num<compareNum){
                return false;
            } else {
                    startNum++;
            }
        }
    }
}
/*
Input: num = 16
Output: true

Input: num = 14
Output: false
 */