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
        for (int i = 0 ; i < skillArr.length ; i++){
            skillQue.add(skillArr[i]);
        }
        for (int i = 0 ; i <skill_trees.length ; i++){
            Boolean isPossible = true;
            String[] skillTreeArr = skill_trees[i].split("");
            Queue<String> que = new LinkedList<>(skillQue);
            int skillIndex = 0;
            while (que.size()!=0){
                String skillName = que.poll();
                for (int j = 0 ; j < skillTreeArr.length ; j++){
                    if (!isPossible){
                        break;
                    }
                    if (skillName.equals(skillTreeArr[j])){
                        if (j>=skillIndex){
                            skillIndex = j;
                            isPossible = true;
                            break;
                        }else {
                            isPossible = false;
                            break;
                        }
                    }
                }
                if (que.size()==0&&isPossible==true){
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