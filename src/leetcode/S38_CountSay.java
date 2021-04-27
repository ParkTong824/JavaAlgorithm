package leetcode;

public class S38_CountSay {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(countAndSay(n));
    }
    public static String countAndSay(int n) {
        StringBuffer answer = new StringBuffer();
        StringBuffer result = new StringBuffer();
        for (int i = 0 ; i < n ; i++ ){
            if (answer.length()==0){
                answer.append("1");
            } else {
                char index = '0';
                int indexCount = 0;
                result.setLength(0);
                for (int j = 0 ; j < answer.length() ; j++) {

                    if (index=='0'){
                        index = answer.charAt(j);
                        indexCount++;
                        continue;
                    }
                    if (answer.charAt(j)!=index){
                        result.append(indexCount);
                        result.append(index);
                        index=answer.charAt(j);
                        indexCount=1;
                    } else {
                        indexCount++;
                    }
                }
                result.append(indexCount);
                result.append(index);
                answer.setLength(0);
                answer.append(result);
            }
        }
        return answer.toString();
    }
}
/*
Input: n = 1
Output: "1"
Explanation: This is the base case.

Input: n = 4
Output: "1211"
Explanation:
countAndSay(1) = "1"
countAndSay(2) = say "1" = one 1 = "11"
countAndSay(3) = say "11" = two 1's = "21"
countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
 */