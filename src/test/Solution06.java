package test;

public class Solution06 {
    public static int solution(String s, String t) {
        int result = 0;
        boolean isFinish = false;
        StringBuilder stringBuilder = new StringBuilder(s);
        while (!isFinish && stringBuilder.length()>0){
            for (int i = 0 ; i < stringBuilder.length() ; i++){
                if (stringBuilder.charAt(i)==t.charAt(0)){
                    int k = i+1;
                    boolean isSame = true;
                    for (int j = 1 ; j < t.length() ; j++){
                        if (stringBuilder.charAt(k)==t.charAt(j)){
                            k++;
                        } else {
                            isSame = false;
                            break;
                        }
                    }
                    if (isSame){
                        stringBuilder=new StringBuilder(stringBuilder.replace(i,i+t.length(),""));
                        result++;
                        break;
                    }
                }
                if (i > stringBuilder.length()-t.length()){
                    isFinish=true;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "aaaaabbbbb";
        String t = "ab";
        System.out.println(solution(s,t));
    }
}
/*
s	t	result
"aabcbcd"	"abc"	2
"aaaaabbbbb"	"ab"	5
 */