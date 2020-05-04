package programmersLevel1;

import java.util.HashMap;
import java.util.Map;

public class Solution04CompleteMan {
    public static void main(String[] args) {
        String[] participant = {"filipa","filipa","marina", "josipa", "ikola", "vinko"};
        String[] completion = {	"josipa", "filipa", "marina", "nikola","filipa"};

        System.out.println(solution(participant,completion));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String,Integer> completionMap = new HashMap<>();
        for (int i = 0 ; i < completion.length ; i++){
            if (completionMap.containsKey(completion[i])){
                completionMap.put(completion[i],completionMap.get(completion[i])+1);
                continue;
            }
            completionMap.put(completion[i],1);
        }
        for (int i = 0 ; i < participant.length ; i++){
            if (completionMap.containsKey(participant[i])&&completionMap.get(participant[i])>0){
                completionMap.put(participant[i],completionMap.get(participant[i])-1);
            }else {
                answer = participant[i];
                break;
            }
        }
        return answer;
    }
}
/*
participant	completion	return
[leo, kiki, eden]	[eden, kiki]	leo
[marina, josipa, nikola, vinko, filipa]	[josipa, filipa, marina, nikola]	vinko
[mislav, stanko, mislav, ana]	[stanko, ana, mislav]	mislav
 */