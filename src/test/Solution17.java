package test;

import java.util.*;

public class Solution17 {
    public String[] solution(String[][] C) {
        int nowIndex = 0;
        List<String> historyArr = new ArrayList();
        for (int i = 0 ; i < C.length ; i++) {
            if(C[i][0].equals("PUSH")) {
                if (nowIndex < historyArr.size()-1) {
                    historyArr.subList(nowIndex+1, historyArr.size()).clear();
                }
                historyArr.add(C[i][1]);
                nowIndex = historyArr.size()-1;
            } else if (C[i][0].equals("BACK")) {
                nowIndex-=Integer.parseInt(C[i][1]);
                if (nowIndex < 0 ) {
                    nowIndex = 0;
                }
            } else if (C[i][0].equals("NEXT")) {
                nowIndex+=Integer.parseInt(C[i][1]);
                if (nowIndex >= historyArr.size() ) {
                    nowIndex = historyArr.size()-1;
                }
            }
        }
        Set<String> duplicationCheckSet = new LinkedHashSet<>();
        for (String page : historyArr) {
            duplicationCheckSet.add(page);
        }
        return duplicationCheckSet.toArray(new String[duplicationCheckSet.size()]);
    }
}
