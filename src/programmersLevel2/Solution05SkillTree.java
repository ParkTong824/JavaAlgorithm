package programmersLevel2;

import java.util.LinkedList;
import java.util.Queue;

public class Solution05SkillTree {
    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};

        System.out.println(solution(skill,skill_trees));
    }
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        Queue<String> skillQue = new LinkedList<>();
        String[] skillArr = skill.split("");

        for (int i = 0 ; i < skill_trees.length ; i++){
            for (String skillString : skillArr){
                skillQue.add(skillString);
            }
            String[] skillTreeArr = skill_trees[i].split("");
            for (int j=0 ; j < skillTreeArr.length ; j++){
                if (skillQue.peek().equals(skillTreeArr[j])){
                    skillQue.poll();
                }else if (!skillQue.peek().equals(skillTreeArr[j])&&skillQue.contains(skillTreeArr[j])){
                    break;
                }

                if (j==skillTreeArr.length-1||skillQue.size()==0){
                    answer++;
                }
            }
        }
        return answer;
    }
}
/*
skill	skill_trees	return
"CBD"	["BACDE", "CBADF", "AECB", "BDA"]	2
 */