package programmersLevel2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

public class Solution06Candidate {
    public int solution(String[][] relation) {
        int answer = 0;
        Map<String,String> relationMap = new HashMap<>();
        int index = 0;
        boolean isFinsh = false;
        int count = 0;
        while (!isFinsh){
            Stack<String> relationStack = new Stack<>();
            if (relationMap.isEmpty()){
                for (int j = 0 ; j < relation[0].length ; j++){
                    if (!relationStack.add(relation[j][index])){
                        relationMap.put(relation[j][index],j+"");
                        for (int k = j-1 ; k>=0; k--){
                            if (relation[j][index].equals(relation[k][index])){
                                relationMap.put(relation[j][index],relationMap.get(relation[j][index])+","+k);
                                break;
                            }
                        }
                    }
                }
            }

            if (relationStack.isEmpty()){
                answer++;
                index++;
            }else {

                index++;
            }

        }
        return answer;
    }
}
/*
relation	result
[["100","ryan","music","2"],
["200","apeach","math","2"],
["300","tube","computer","3"],
["400","con","computer","4"],
["500","muzi","music","3"],
["600","apeach","music","2"]]	    2
 */