package leetcode5;

import java.util.ArrayList;
import java.util.List;

public class S412_FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        boolean isFizz = false;
        boolean isBuzz = false;

        for (int i = 0 ; i < n ; i++) {
            isBuzz = false;
            isFizz = false;
            if ((i+1)%3==0){
                isFizz = true;
            }
            if ((i+1)%5 == 0) {
                isBuzz = true;
            }

            if (isBuzz && isFizz) {
                answer.add("FizzBuzz");
            } else if (isFizz) {
                answer.add("Fizz");
            } else if (isBuzz) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i+1));
            }
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
/*
Input: n = 3
Output: ["1","2","Fizz"]

Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]

Input: n = 15
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 */