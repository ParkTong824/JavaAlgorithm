package leetcode2;

import java.util.Arrays;

public class S66_PlusOne {
    public static void main(String[] args) {
        int[] digits = {9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits) {
        digits[digits.length-1] ++;
        for (int i = 0 ; i < digits.length ; i++){
            if (digits[digits.length-1-i]==10){
                digits[digits.length-1-i]=0;
                try {
                    digits[digits.length-1-(i+1)]++;
                } catch (ArrayIndexOutOfBoundsException e) {
                    int[] answer = new int[digits.length+1];
                    answer[0] = 1;
                    System.arraycopy(digits,0,answer,1,digits.length);
                    return answer;
                }
            } else {
                break;
            }
        }
        return digits;
    }
}
