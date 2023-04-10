package programmersLevel0;

public class Solution59 {
    public static int solution(int[] box, int n) {
        int a = box[0]/n;
        int b = box[1]/n;
        int c = box[2]/n;
        int answer = a * b * c;
        return answer;
    }

    public static void main(String[] args) {
        int[] box = {10, 8, 6};
        int n = 3;
        solution(box, n);
    }
}
