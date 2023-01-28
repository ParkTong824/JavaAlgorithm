package programmersLevel0;

public class Solution04 {
    public static int solution(int M, int N) {
        int answer = 0;
        answer= (M-1) + (N-1)*(M-1+1);
        return answer;
    }

    public static void main(String[] args) {
        int m = 1;
        int n = 1;

        System.out.println(solution(m, n));
    }
}

/*
정수 M, N이 매개변수로 주어질 때, M x N 크기의 종이를 최소로 가위질 해야하는 횟수를 return 하도록 solution 함수를 완성해보세요.

제한사항
0 < M, N < 100
종이를 겹쳐서 자를 수 없습니다.
입출력 예
M	N	result
2	2	3
2	5	9
1	1	0
 */