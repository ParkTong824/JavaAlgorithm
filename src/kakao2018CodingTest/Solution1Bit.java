package kakao2018CodingTest;

public class Solution1Bit {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        solution(5,arr1,arr2);
    }
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0 ; i<n ; i++){
            int targetBit = 1;
            String result = "";
            int arr = arr1[i] | arr2[i];
            for (int j = 0 ; j<n ; j++){
                result = ((arr & targetBit)>0 ? "#" : " ") + result;
                targetBit = targetBit << 1;

            }
            answer[i] = result;
            System.out.println(answer[i]);
        }
        return answer;
    }
}
/*
n	5
arr1	[9, 20, 28, 18, 11]
arr2	[30, 1, 21, 17, 28]
출력	["#####","# # #", "### #", "# ##", "#####"]
 */