package programmersLevel2;

public class Solution08BigNumber {
    public static void main(String[] args) {
        String number = "1231234";
        int k = 3;

        System.out.println(solution(number,k));
    }
    public static String solution(String number, int k) {
        String answer = "";
        char[] numberArr = number.toCharArray();

        int bigNumberIndex = 0;
        int bigNumber = numberArr[bigNumberIndex];

        int startIndex = 0;
        int kCount = k+1;

        int count = 0;

        while (k>0){
            if (kCount==0){
                String bigNumberTrans = Character.toString(bigNumber);
                answer = answer + bigNumberTrans;
                count = bigNumberIndex - count;
                k= k - count;
                count++;
                if (k==0&&bigNumberIndex+1==startIndex){
                    continue;
                }
                bigNumberIndex = bigNumberIndex+1;
                bigNumber=numberArr[bigNumberIndex];
                startIndex=bigNumberIndex;
                kCount=k+1;
                continue;
            }
            bigNumberIndex = bigNumber>=numberArr[startIndex] ? bigNumberIndex : startIndex;
            bigNumber = bigNumber>=numberArr[startIndex] ? bigNumber : numberArr[startIndex];

            startIndex++;
            kCount--;

        }
        if (bigNumberIndex<numberArr.length){
            for (int i = bigNumberIndex+1; i < numberArr.length ; i++){
                String numberTrans = Character.toString(numberArr[i]);
                answer = answer + numberTrans;
            }
        }
        return answer;
    }
//    public static String solution(String number, int k) {
//        String answer = "";
//        char[] numberArr = number.toCharArray();
//        int bigNumberIndex = 0;
//        int bigNumber =0;
//
//        int startIndex = 0;
//        int kCount = k;
//
//        int count = 0;
//        while(k>0){
//            if (kCount==0){
//                String bigNumberTrans = Character.toString(bigNumber);
//                answer = answer + bigNumberTrans;
//                count = bigNumberIndex - count;
//                k= k - count;
//                startIndex = bigNumberIndex+1;
//                bigNumber=0;
//                bigNumberIndex = 0;
//                kCount=k;
//                continue;
//            }
//            if (k==1){
//                bigNumberIndex = numberArr[startIndex+1]>=numberArr[startIndex] ? startIndex+1 : startIndex;
//                bigNumber = numberArr[startIndex+1]>=numberArr[startIndex] ? numberArr[startIndex+1] : numberArr[startIndex];
//                String bigNumberTrans = Character.toString(bigNumber);
//                bigNumberIndex++;
//                answer = answer + bigNumberTrans;
//                break;
//            }
//            bigNumberIndex = bigNumber>=numberArr[startIndex] ? bigNumberIndex : startIndex;
//            bigNumber = bigNumber>=numberArr[startIndex] ? bigNumber : numberArr[startIndex];
//
//            startIndex++;
//            kCount--;
//        }
//
//        if (bigNumberIndex<numberArr.length){
//            for (int i = bigNumberIndex+1; i < numberArr.length ; i++){
//                String numberTrans = Character.toString(numberArr[i]);
//                answer = answer + numberTrans;
//            }
//        }
//        return answer;
//    }

//    public String solution(String number, int k) {
//        int idx = 0;
//        char max;
//        StringBuilder answer = new StringBuilder();
//
//        if(number.charAt(0) == '0') return "0";
//        for(int i = 0; i < number.length() - k; i++) {
//            max = '0';
//            for(int j = idx; j <= k + i; j++) {
//                if(max < number.charAt(j)) {
//                    max = number.charAt(j); idx = j + 1;
//                }
//            }
//            answer.append(max);
//        }
//        return answer.toString();
//    }
}
