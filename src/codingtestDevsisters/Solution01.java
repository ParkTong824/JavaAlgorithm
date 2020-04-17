package codingtestDevsisters;

import java.util.*;

public class Solution01 {
    public static void main(String[] args) {
        String[] names = {"soda", "soda", "soda", "soda", "soda"};
        System.out.println(solution(names));
    }
    public static int solution(String[] names) {
        int answer = 0;
        Map<String,Integer> sameSpell = new HashMap<>();
        Set<String> spell = new HashSet<>();
        for(int i = 0 ; i<names.length ; i++){
            String startSpell = names[i].substring(0,1);
            spell.add(startSpell);
            if (sameSpell.containsKey(startSpell)){
                sameSpell.put(startSpell,sameSpell.get(startSpell)+1);
            }else {
                sameSpell.put(startSpell,1);
            }
        }
        Iterator<String> setIterater = spell.iterator();
        while (setIterater.hasNext()){
            int plus = 0;
            int count = sameSpell.get(setIterater.next());
            if (count<=2){
                continue;
            }
            for (int i = 2 ; i < count ; i++){
                if (i%2==0){
                    plus++;
                }
                answer=answer+plus;
            }
        }

        return answer;
    }
}
/*
names	result
[lemon, lime, werewolf, wizard, walnut]	1
[gingerbrave, gingerbright, gumball, salt, strawberry, soda, beet, blackberry]	2
[soda, soda, soda, soda, soda]	4
 */