package leetcode;

import java.lang.reflect.Array;
import java.util.*;

public class S17_LetterCombination {
    public static void main(String[] args) {
        String digits = "";
        List<String> answer = letterCombinations(digits);
        System.out.println(answer.toString());
    }
    public static List<String> letterCombinations(String digits) {
        Map<Character, List<String>> map = new HashMap<Character, List<String>>();

        map.put('2',new ArrayList<>(Arrays.asList("a","b","c")));
        map.put('3',new ArrayList<>(Arrays.asList("d","e","f")));
        map.put('4',new ArrayList<>(Arrays.asList("g","h","i")));
        map.put('5',new ArrayList<>(Arrays.asList("j","k","l")));
        map.put('6',new ArrayList<>(Arrays.asList("m","n","o")));
        map.put('7',new ArrayList<>(Arrays.asList("p","q","r","s")));
        map.put('8',new ArrayList<>(Arrays.asList("t","u","v")));
        map.put('9',new ArrayList<>(Arrays.asList("w","x","y","z")));


        List<String> result = new ArrayList<>();
        if(digits.length() == 0)
            return result;

        List<String> list = map.get(digits.charAt(0));
        if(digits.length() == 1)
            return list;
        Queue<String> queue = new LinkedList<>();

        for(String st : list)
            queue.offer(st);
        int k=1;//index of digits it's 1 because 0 is parsed

        while(!queue.isEmpty()){

            String item = queue.poll();
            if(item.length() != k)
                k = item.length();
            List<String> ListForCurNum = map.get(digits.charAt(k));

            for(String st : ListForCurNum){
                String tempConcat = item + st;

                if(tempConcat.length() == digits.length())
                    result.add(tempConcat);
                else
                    queue.offer(tempConcat);
            }

        }
        return result;
    }
}
/*
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

Input: digits = ""
Output: []

Input: digits = "2"
Output: ["a","b","c"]
 */
