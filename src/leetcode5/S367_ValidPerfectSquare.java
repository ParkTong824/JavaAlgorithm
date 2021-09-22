package leetcode5;

public class S367_ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int startNum = 1;
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