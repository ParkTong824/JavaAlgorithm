package leetcode5;

public class S434_NumberOfSegments {
    public static int countSegments(String s) {
        if (s.equals("")){
            return 0;
        }
        String[] answerArr = s.split("");
        boolean isChar = false;
        int answer = 0;
        for (int i = 0 ; i < answerArr.length ; i++) {
            if (answerArr[i].matches("[\"!@#$%^&*()_+-=',.:]")) {
                continue;
            } else if (answerArr[i].equals(" ")){
                if (isChar){
                    answer++;
                    isChar = false;
                } else {
                    continue;
                }
            } else {
                isChar = true;
            }
        }
        if (isChar) {
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "\"Hello, my name is John\"";
        System.out.println(countSegments(s));
    }
}
