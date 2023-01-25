package programmersLevel0;

public class Solution01 {
    private static final String[] checkArr = {"aya", "ye", "woo", "ma"};
    private static final int[] checkStringLengthArr = {3,2,3,2};
    public static int solution(String[] babbling) {
        int answer = 0;
        for (int i = 0 ; i < babbling.length ; i++) {
            String tempBabbling = babbling[i];
            if (tempBabbling.length() < 2) {
                continue;
            }
            int checkIndex = 0;
            boolean isPossible = true;
            while (isPossible) {
                for (int j = 0 ; j < checkArr.length ; j++) {
                    if (tempBabbling.indexOf(checkArr[j]) == checkIndex) {
                        checkIndex+=checkStringLengthArr[j];
                        break;
                    }
                    if (j == checkArr.length-1) {
                        isPossible = false;
                        break;
                    }
                }
                if (checkIndex == tempBabbling.length() && isPossible) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] test = {"aya", "yee", "u", "maa", "wyeoo"};
        System.out.println(solution(test));
//        System.out.println("ye".indexOf("ye"));
    }
}

/*
머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다.
조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을 최대 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다.
문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ babbling의 길이 ≤ 100
1 ≤ babbling[i]의 길이 ≤ 15
babbling의 각 문자열에서 "aya", "ye", "woo", "ma"는 각각 최대 한 번씩만 등장합니다.
즉, 각 문자열의 가능한 모든 부분 문자열 중에서 "aya", "ye", "woo", "ma"가 한 번씩만 등장합니다.
문자열은 알파벳 소문자로만 이루어져 있습니다.
입출력 예
babbling	result
["aya", "yee", "u", "maa", "wyeoo"]	1
["ayaye", "uuuma", "ye", "yemawoo", "ayaa"]	3
 */
