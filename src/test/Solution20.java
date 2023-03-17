package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution20 {
    public static Map<Integer, HashSet<String>> erdosNum;
    public static int solution(int n, int m, String[] names, String[][] authors ) {
        int answer =0;
        erdosNum = new HashMap<>();
        HashSet<String> checkSet = new HashSet<>();
        checkSet.add("erdos");
        erdosNum.put(0,checkSet);
        for (int i = 1 ; i <= 6 ; i++) {
            checkSet = new HashSet<>();
            for (int j = 0 ; j < authors.length ; j++) {
                if (checkRelation(i-1, authors[j])) {
                    checkSet.add(erdosNum.get(i-1).contains(authors[j][0])? authors[j][1] : authors[j][0]);
                }
            }

            erdosNum.put(i, checkSet);
        }
        for (int i = 1 ; i < erdosNum.size() ; i ++) {
            answer += erdosNum.get(i).size() * (Math.pow(2,i+1));
        }
        return answer;
    }
    public static boolean checkRelation(int checkErdosNum, String[] author) {
        if ((erdosNum.get(checkErdosNum).contains(author[0])
                && !erdosNum.get(checkErdosNum).contains(author[1])) ||
            (erdosNum.get(checkErdosNum).contains(author[1])
                    && !erdosNum.get(checkErdosNum).contains(author[0]))) {

            String contain = erdosNum.get(checkErdosNum).contains(author[1])? author[1] : author[0];
            String checkName = erdosNum.get(checkErdosNum).contains(author[1])? author[0] : author[1];

            for (int i = 0 ; i < checkErdosNum ; i++) {
                if (erdosNum.get(i).contains(checkName)) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 8;
        int m = 8;
        String[] names = {"justi","cehui","jhnah","erdos","aaaaa","bbbbb","ccccc","ddddd"};
        String[][] authors = {
                {"erdos","justi"},
                {"justi","cehui"},
                {"cehui","jhnah"},
                {"jhnah","aaaaa"},
                {"aaaaa","bbbbb"},
                {"bbbbb","ccccc"},
                {"ccccc","ddddd"},
                {"ccccc","ddddd"}
                };

        System.out.println(solution(n, m, names, authors));
    }
}
