package test;

import java.util.*;

public class Solution02 {
    public static void main(String[] args) {
        int n = 4;
        int[] v1 = {1,3};
        int[] v2 = {2,4};
        int[] num = {2,2};
        int[] amount = {1,-2};

        System.out.println(solution(n,v1,v2,num,amount));
    }
    public static int solution(int n, int[] v1, int[] v2, int[] num, int[] amount) {
        int answer = 0;
        Map<Integer, HashSet> teamMap = new HashMap<>();
        int teamIndex =0;
        teamMap.put(0,new HashSet(Arrays.asList(v1[0],v2[0])));
        teamIndex++;
        for (int i = 1 ; i< v1.length ; i++){
            for (int j = 0 ; j < teamIndex ; j++){
                if(teamMap.get(j).contains(v1[i])||teamMap.get(j).contains(v2[i])){
                    teamMap.get(j).add(v1[i]);
                    teamMap.get(j).add(v2[i]);
                } else {
                    teamMap.put(teamIndex,new HashSet(Arrays.asList(v1[i],v2[i])));
                    teamIndex++;
                }
            }
        }
        while (true){
            boolean isRetain = false;
            boolean isFinish = false;
            for (int i = 0 ; i < teamIndex-1 ; i++) {
                if (teamMap.containsKey(i)){
                    for (int j = i+1 ; j < teamIndex ; j++) {
                        if (teamMap.containsKey(j)){
                            Iterator<Integer> iterSet = teamMap.get(j).iterator();
                            while (iterSet.hasNext()){
                                if (teamMap.get(i).contains(iterSet.next())){
                                    teamMap.get(i).addAll(teamMap.get(j));
                                    teamMap.remove(j);
                                    isRetain=true;
                                    break;
                                }
                            }
                        }
                        if (i==teamIndex-2 && j ==teamIndex-1){
                            isFinish=true;
                        }
                    }
                    if (isRetain){
                        break;
                    }
                }

            }
            if (isFinish){
                break;
            }
        }
        Map<Integer,Integer> scoreMap = new HashMap<>();
        for(int key : teamMap.keySet()){
            scoreMap.put(key,0);
        }
        for (int i = 0 ; i < num.length ; i++){
            boolean isTeam = false;
            for (int key : teamMap.keySet()){
                if (teamMap.get(key).contains(num[i])){
                    if (scoreMap.containsKey(key)){
                        scoreMap.put(key,scoreMap.get(key)+amount[i]);
                        isTeam = true;
                    } else {
                        scoreMap.put(key,amount[i]);
                        isTeam = true;
                    }
                }
            }
            if (!isTeam){
                scoreMap.put(teamIndex,amount[i]);
                teamMap.put(teamIndex,new HashSet(Arrays.asList(num[i])));
                teamIndex++;
            }
        }
        int score =-100001;
        Set<Integer> sameScoreTeam = new HashSet<>();
        for (int key : scoreMap.keySet()){
            if (scoreMap.get(key)>score){
                score=scoreMap.get(key);
                sameScoreTeam.clear();
                sameScoreTeam.add(key);
            } else if(scoreMap.get(key)==score){
                sameScoreTeam.add(key);
            }
        }
        if (sameScoreTeam.size()==1){
            List<Integer> teamList = new ArrayList<>(teamMap.get(sameScoreTeam.iterator().next()));
            Collections.sort(teamList);
            return teamList.get(0);
        } else {
            Iterator<Integer> iterSet = sameScoreTeam.iterator();
            while (iterSet.hasNext()){
                List<Integer> teamList = new ArrayList<>(teamMap.get(iterSet.next()));
                Collections.sort(teamList);
                if (answer==0){
                    answer=teamList.get(0);
                } else {
                    if (answer>teamList.get(0)){
                        answer=teamList.get(0);
                    }
                }
            }
        }
        return answer;
    }
}
/*
n	v1	v2	num	amount	answer
10	[1, 10, 6, 5, 6, 9]	[3, 7, 2, 8, 7, 3]	[3, 4, 5, 1, 8, 7, 9, 2]	[10, 5, 6, -6, -8, 2, -2, 5]	2
10	[8, 4, 4, 1]	[1, 10, 9, 4]	[2, 5, 8, 6, 4, 1, 3, 10, 7, 4]	[3, -1, 3, 3, 1, -2, -4, 1, 2, -5]	2
4	[1, 3]	[2, 4]	[2, 2]	[1, -2]	3
6	[1, 5, 3, 6, 2]	[5, 4, 6, 2, 3]	[1, 5, 4, 3, 6, 2]	[3, 6, -2, 2, 2, 2]	1
 */