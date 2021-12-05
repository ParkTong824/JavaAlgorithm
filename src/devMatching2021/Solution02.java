package devMatching2021;

import java.util.HashMap;
import java.util.Map;

public class Solution02 {
    public int solution(int n, String[] recipes, String[] orders) {
        int answer = 0;
        Map<String, Integer> recipesMap = new HashMap<>();
        for (int i = 0 ; i < recipes.length ; i++) {
            String[] tempRecipes = recipes[i].split(" ");
            recipesMap.put(tempRecipes[0],Integer.parseInt(tempRecipes[1]));
        }

        int[] nArr = new int[n];

        for (int i = 0 ; i < orders.length ; i++) {

        }


        return answer;
    }
}
/*
n	recipes	orders	result
2	["A 3","B 2"]	["A 1","A 2","B 3","B 4"]	7
3	["SPAGHETTI 3", "FRIEDRICE 2", "PIZZA 8"]	["PIZZA 1", "FRIEDRICE 2", "SPAGHETTI 4", "SPAGHETTI 6", "PIZZA 7", "SPAGHETTI 8"]	12
1	["COOKIE 10000"]	["COOKIE 300000"]	310000
 */
