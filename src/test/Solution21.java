package test;

import java.util.*;
import java.util.stream.Collectors;

public class Solution21 {
    static Map<Integer, Set<Integer>> checkMap;
    public static int[] solution(int n, int[] x1, int[] y1, int[] x2, int[] y2) {
        int[] answer = new int[n];
        checkMap = new HashMap<>();

        for (int i = 0 ; i < n ; i++) {
            int[] nowArea = {x1[i], x2[i], y1[i], y2[i]};
            Set<Integer> nowAreaCheckSet = new HashSet<>();
            for (int j = i+1 ; j < n ; j++) {
                int[] compareArea = {x1[j], x2[j], y1[j], y2[j]};
                if (isNearArea(nowArea, compareArea)) {
                    nowAreaCheckSet.add(j);
                }
            }
            checkMap.put(i,nowAreaCheckSet);
        }
        for (int i : checkMap.keySet()) {
            for (int j : checkMap.get(i).stream().collect(Collectors.toList())){
                checkMap.get(j).add(i);
                checkMap.get(j).addAll(checkMap.get(i));
            }
        }
        for (int i = 0 ; i < n ; i++) {
            answer[i] = checkMap.get(i).size();
            if (answer[i] == 0) {
                answer[i] = 1;
            }
        }
        return answer;
    }

    public static boolean isNearArea(int[] nowArea, int[] compareArea) {
        //x축 비교
        if (nowArea[0] == compareArea[0] || nowArea[0] == compareArea[1] || nowArea[1] == compareArea[1] || nowArea[1] == compareArea[0]) {

            if (nowArea[0] == compareArea[0] || nowArea[1] == compareArea[1]) {

                if (nowArea[2] == compareArea[3] || nowArea[3] == compareArea[2]) {
                    return true;
                }

            } else {

                if (nowArea[2] == compareArea[2] || nowArea[3] == compareArea[3]) {
                    return true;

                } else if (nowArea[2] > compareArea[2]) {

                     if (nowArea[3] < compareArea[2]) {
                        return true;
                     }

                } else {

                    if (nowArea[2] > compareArea[3]) {
                        return true;
                    }

                }
            }
        } else if (nowArea[2] == compareArea[2] || nowArea[3] == compareArea[3] || nowArea[2] == compareArea[3] || nowArea[3] == compareArea[2]) {
            // y축 비교
            if (nowArea[2] == compareArea[2] || nowArea[3] == compareArea[3]) {
                if (nowArea[0] == compareArea[1] || nowArea[1] == compareArea[0]) {
                    return true;
                }
            } else {
                if (nowArea[0] == compareArea[0] || nowArea[1] == compareArea[1]) {
                    return true;
                } else if (nowArea[0] > compareArea[0]) {
                    if (nowArea[0] < compareArea[1]) {
                        return true;
                    }
                } else {
                    if (nowArea[1] > compareArea[0]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 4;
        int[] x1 = {10,30,65,10};
        int[] y1 = {15,40,40,70};
        int[] x2 = {40,65,80,30};
        int[] y2 = {40,60,70,90};
        System.out.println(Arrays.toString(solution(n,x1,y1,x2,y2)));
    }
}
