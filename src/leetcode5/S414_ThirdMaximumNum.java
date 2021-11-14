package leetcode5;

public class S414_ThirdMaximumNum {
    public static int thirdMax(int[] nums) {
        int[] checkArr = new int[]{nums[0],nums[0],nums[0]};
        for (int i = 1 ; i < nums.length ; i++) {
            for (int j = 0 ; j < checkArr.length ; j++) {
                if (checkArr[j]<nums[i]) {
                    int tempNum = checkArr[j];
                    int changeNum = nums[i];
                    checkArr[j] = changeNum;
                    for (int k = j+1 ; k < checkArr.length ; k++) {
                        changeNum = checkArr[k];
                        checkArr[k] = tempNum;
                        tempNum = changeNum;
                    }
                }
            }
        }
        if (checkArr[0]==checkArr[1]){
            return checkArr[0];
        } else if (checkArr[1]==checkArr[2]) {
            return checkArr[0];
        } else {
            return checkArr[2];
        }
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1};
        System.out.println(thirdMax(nums));
    }
}
