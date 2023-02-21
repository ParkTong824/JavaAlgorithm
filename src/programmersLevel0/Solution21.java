package programmersLevel0;

import java.util.*;
import java.util.stream.Collectors;

public class Solution21 {
    public static String solution(String s) {
        String answer = "";
        SortedSet<Character> checkSet = new TreeSet<>();
        Set<Character> duplicateSet = new HashSet<>();
        for (int i = 0 ; i < s.length() ; i++) {
            if(!checkSet.add(s.charAt(i))) {
                duplicateSet.add(s.charAt(i));
            }
        }
        for (char a : duplicateSet) {
            checkSet.remove(a);
        }
        for (char a : checkSet) {
            answer +=a;
        }
        return answer;
    }
    public String solution1(String s) {
        return Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(s1 -> s1))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() <= 1)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String s = "abcabcadc";
        solution(s);
    }
}
/*
문제 설명
문자열 s가 매개변수로 주어집니다.
s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.

제한사항
0 < s의 길이 < 1,000
s는 소문자로만 이루어져 있습니다.

입출력 예
s	result
"abcabcadc"	"d"
"abdc"	"abcd"
"hello"	"eho"
 */