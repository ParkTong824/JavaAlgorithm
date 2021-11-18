package leetcode5;

public class S434_NumberOfSegments {
    public static int countSegments(String s) {
        if (s.equals("")){
            return 0;
        }
        String[] answerArr = s.split(" ");
        int answer = 0;
        for (int i = 0 ; i < answerArr.length ; i++) {
            if (answerArr[i].equals("")) {
                continue;
            } else {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "\"Hello, my name is John\"";
        System.out.println(countSegments(s));
    }
}
