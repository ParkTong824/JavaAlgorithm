package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution05 {
    public static String[] solution(String s) {
        String[] answer = {};
        List<String> answerList = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder(s);
        StringBuilder substringBuilder = new StringBuilder();
        boolean isFinish = false;
        while (stringBuilder.length()>0 && !isFinish){
            substringBuilder = new StringBuilder();
            for (int i = 0 ; i < stringBuilder.length()/2 ; i++){
                substringBuilder.append(stringBuilder.charAt(i));
                if (substringBuilder.toString().equals(stringBuilder.substring(stringBuilder.length()-substringBuilder.length()).toString())){
                    answerList.add(substringBuilder.toString());
                    stringBuilder.replace(stringBuilder.length()-substringBuilder.length(),stringBuilder.length(),"");
                    stringBuilder.replace(0,substringBuilder.length(),"");
                    break;
                }
                if (i==stringBuilder.length()/2-1){
                    isFinish=true;
                }
            }
        }
        if (isFinish){
            answer= new String[answerList.size()*2+1];
            for (int i = 0 ; i<answerList.size() ; i++){
                answer[i]=answerList.get(i);
                answer[answer.length-1-i] = answerList.get(i);
            }
            answer[answer.length/2]=stringBuilder.toString();
        } else {
            answer= new String[answerList.size()*2];
            for (int i = 0 ; i <answerList.size() ; i++){
                answer[i]=answerList.get(i);
                answer[answer.length-1-i] = answerList.get(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "abcxyasdfasdfxyabc";
        System.out.println(Arrays.toString(solution(s)));
    }
}
/*
"abcxyasdfasdfxyabc"	["abc","xy","asdf","asdf","xy","abc"]
"abcxyqwertyxyabc"	["abc","xy","qwerty","xy","abc"]
"abcabcabcabc"	["abc","abc","abc","abc"]
"llttaattll"	["l","l","t","t","a","a","t","t","l","l"]
"zzzzzz"	["z","z","z","z","z","z"]
"abcdef"	["abcdef"]
 */