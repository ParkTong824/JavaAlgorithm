package codingtestDevMatching;

public class Solution1 {
    public static void main(String[] args) {
        String p = "82195";
        String s = "64723";
        solution(p,s);
    }
    public static int solution(String p, String s) {
        int answer = 0;
        String[] pArr = p.split("");
        String[] sArr = s.split("");

        for (int i = 0 ; i < pArr.length ; i++){
            int pIndex = Integer.parseInt(pArr[i]);
            int sIndex = Integer.parseInt(sArr[i]);
            if (Math.abs(pIndex-sIndex)<=5){
                answer = answer+Math.abs(pIndex-sIndex);
            }else {
                answer = answer + 10-Math.abs(pIndex-sIndex);
            }
        }
        return answer;
    }
}
/*
P	S	result
82195	64723	13
00000000000000000000	91919191919191919191	20
 */