package test;

public class Solution15 {
    public static int solution(int[] grade) {
        int answer = 0;
        for (int i = 1 ; i < grade.length ; i++) {
            if (grade[i-1] > grade[i]) {
                int changeSum = changeNumber(i, grade);
                answer += changeSum;
            }
        }
        return answer;
    }
    public static int changeNumber(int index, int[] grade) {
        int changeSum = 0 ;
        for (int i = index-1 ; i >= 0 ; i--) {
            if (grade[i] > grade[i+1]) {
                changeSum += grade[i] - grade[i+1];
                grade[i] = grade[i+1];
            } else {
                break;
            }
        }
        return changeSum;
    }
    public static void main(String[] args) {
        int[] check = {3,2,3,6,4,5};
        System.out.println(solution(check));
    }
}
/*
2,1,3   1
1,2,3   0
3,2,3,6,4,5  3
 */