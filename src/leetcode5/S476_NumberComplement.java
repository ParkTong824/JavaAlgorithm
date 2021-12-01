package leetcode5;

public class S476_NumberComplement {
    public static int findComplement(int num) {
        int index = 0;
        while (Math.pow(2,index)<=num) {
            index++;
        }
        index--;
        int[] resultArr = new int[index+1];
        while (num>0){
            if (num>=Math.pow(2,index)){
                num = (int) (num-Math.pow(2,index));
                resultArr[resultArr.length-1-index] = 0;
                index--;
            } else {
                resultArr[resultArr.length-1-index] = 1;
                index--;
            }
        }
        for (int i = resultArr.length-1 ; i >= index ; i--){
            resultArr[i]=1;
        }
        int answer = 0;
        for (int i = 0 ; i < resultArr.length ; i++) {
            if (resultArr[i]==1) {
                answer = answer + (int) Math.pow(2,resultArr.length-1-i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int num = 4;
        System.out.println(findComplement(num));
    }
}
