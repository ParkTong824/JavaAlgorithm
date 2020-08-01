package toss2020CodingTest;

public class Solution01 {
    public boolean solution(String num){
        String[] numArr = num.split("");
        boolean isTogether = false;

        for (int i = 0 ; i < numArr.length-1 ; i++){
            if (numArr[numArr.length-1].equals("1")){
                return false;
            }
            if (numArr[i].equals("1")){
                if (numArr[i+1].equals("2")){
                    isTogether = true;
                }else{
                    isTogether = false;
                }
            }else {
                continue;
            }
        }

        return isTogether;
    }
}
