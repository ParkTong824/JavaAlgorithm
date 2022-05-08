package test;

import java.util.*;

public class Solution12 {
    public static int solution(int [][] p) {
        int answer = 0;
        Map<Integer, Set<Integer>> preferMap = new HashMap<>();
        Arrays.sort(p, ((o1, o2) -> {
            if (o1[0] == o2[0]){
                return Integer.compare(o1[1],o2[1]);
            } else {
                return Integer.compare(o1[0],o2[0]);
            }
        }));
        for (int[] pArr : p) {
            if (pArr[0] < pArr[1]) {
                if (preferMap.containsKey(pArr[0])) {
                    preferMap.get(pArr[0]).add(pArr[1]);
                } else {
                    preferMap.put(pArr[0], new HashSet<>(Arrays.asList(pArr[1])));
                }
            } else {
                if (!preferMap.containsKey(pArr[1])){
                    continue;
                }
                if (preferMap.get(pArr[1]).contains(pArr[0])) {
                    answer++;
                    preferMap.get(pArr[1]).remove(pArr[0]);
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[][] p = {{1,3},{3,1},{3,5},{2,5},{5,3}};

        System.out.println(solution(p));

    }
}
/*
P	answer
[[1,3],[3,1],[3,5],[2,5],[5,3]]	2
입출력 예 설명
입출력 예 #1
1번 직원은 3번 직원을 선호하고, 3번 직원은 1번 직원을 선호하기 때문에 서로 선호하는 관계입니다.
또한, 3번 직원은 5번 직원을 선호하고, 5번 직원도 3번 직원을 선호하기 때문에 서로 선호하는 관계입니다.
2번 직원은 5번 직원을 선호하지만, 5번 직원은 2번 직원에 대한 선호도 표시를 하지 않았으므로 서로 선호하는지 알 수 없습니다.
따라서 서로 선호하는 관계는 1⇔3, 3⇔5인 두 개이므로 2를 return 합니다.
 */