package test;

import java.util.Arrays;

public class Solution14 {
    public static int solution(int N, int[][] relation, String[] dirname) {
        Arrays.sort(relation, ((o1, o2) -> {
            if (o1[0] == o2[0]){
                return Integer.compare(o1[1],o2[1]);
            } else {
                return Integer.compare(o1[0],o2[0]);
            }
        }));
        int[] lengthArr = new int[dirname.length];
        for (int i = 0 ; i < dirname.length ; i++) {
            lengthArr[i] = dirname[i].length();
        }
        for (int i = 0 ; i < relation.length ; i++) {
            lengthArr[relation[i][1]-1] += (lengthArr[relation[i][0]-1]+1);
        }
        Arrays.sort(lengthArr);

        return lengthArr[lengthArr.length-1];
    }

    public static void main(String[] args) {
        int N = 7;
        int[][] relation = {{1,2},{2,5},{2,6},{1,3},{1,4},{3,7}};
        String[] dirname = {"root","abcd","cs","hello","etc","hello","solution"};
        System.out.println(solution(N,relation,dirname));
    }
}
/*
relation	dirname	result
7	[[1,2],[2,5],[2,6],[1,3],[1,4],[3,7]]	["root","abcd","cs","hello","etc","hello","solution"]	16
7	[[1,2],[2,3],[3,4],[4,5],[1,6],[6,7]]	["root","a","b","c","d","efghij","k"]	13
 */