package leetcode5;

import java.util.HashSet;
import java.util.Set;

public class S202_HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> numSet = new HashSet<>();
        while (n!=1&& numSet.add(n)) {
            n = returnNum(n);
        }

        return n==1;
    }
    public int returnNum(int n){
        int sum = 0;
        while (n>0) {
            int nowNum = n%10;
            n = n/10;
            sum +=(nowNum*nowNum);
        }
        return sum;
    }
}
