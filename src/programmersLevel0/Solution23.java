package programmersLevel0;

public class Solution23 {
    public static void main(String[] args) {
        String numbers = "onefourzerosixseven";
        solution(numbers);
    }
    public static long solution(String numbers) {
        StringBuilder answer = new StringBuilder();
        StringBuilder numberBuilder = new StringBuilder(numbers);
        while (numberBuilder.length() >0) {
            switch (numberBuilder.charAt(0)) {
                case 'z':
                    answer.append(0);
                    numberBuilder.delete(0,4);
                    break;
                case 'o':
                    answer.append(1);
                    numberBuilder.delete(0,3);
                    break;
                case 't':
                    switch (numberBuilder.charAt(1)){
                        case 'w':
                            answer.append(2);
                            numberBuilder.delete(0,3);
                            break;
                        case 'h':
                            answer.append(3);
                            numberBuilder.delete(0,5);
                            break;
                    }
                    break;
                case 'f':
                    switch (numberBuilder.charAt(1)){
                        case 'o':
                            answer.append(4);
                            numberBuilder.delete(0,4);
                            break;
                        case 'i':
                            answer.append(5);
                            numberBuilder.delete(0,4);
                            break;
                    }
                    break;
                case 's':
                    switch (numberBuilder.charAt(1)){
                        case 'i':
                            answer.append(6);
                            numberBuilder.delete(0,3);
                            break;
                        case 'e':
                            answer.append(7);
                            numberBuilder.delete(0,5);
                            break;
                    }
                    break;
                case 'e':
                    answer.append(8);
                    numberBuilder.delete(0,5);
                    break;
                case 'n':
                    answer.append(9);
                    numberBuilder.delete(0,4);
                    break;
            }
        }
        return Long.parseLong(answer.toString());
    }
}

/*
문제 설명
영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.

제한사항
numbers는 소문자로만 구성되어 있습니다.
numbers는 "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" 들이 공백 없이 조합되어 있습니다.
1 ≤ numbers의 길이 ≤ 50
"zero"는 numbers의 맨 앞에 올 수 없습니다.
입출력 예
numbers	result
"onetwothreefourfivesixseveneightnine"	123456789
"onefourzerosixseven"	14067
 */
