package leetcode5;

public class S367_ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        int numLength = (int)(Math.log10(num)+1);
        int startNum = 1;
        int answerLength = 0;
        if (numLength>2){
            if (numLength%2==1){
                answerLength=numLength/2+1;
            } else {
                answerLength=numLength/2;
            }
            for (int i = 1 ; i < answerLength ; i++){
                startNum*=10;
            }
        }
        while (true){
            int compareNum = startNum*startNum;
            if (num==compareNum){
                return true;
            } else if (num<compareNum) {
                return false;
            } else if (num>compareNum*compareNum) {
                startNum = compareNum+1;
            } else {
                    startNum++;
            }
        }
    }

    public static void main(String[] args) {
        int num = 100;
        System.out.println((int)Math.log10(num)+1);
    }
}
/*
Input: num = 16
Output: true

Input: num = 14
Output: false
 */