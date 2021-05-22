package leetcode2;

public class S55_JumpGame {
    public static boolean canJump(int[] nums) {
        int index = 0;
        if (nums.length==1){
            return true;
        }
        while (index < nums.length-1) {
            if (nums[index]==0) {
                return isZero(index+1,nums);
            } else {
                index+=nums[index];
            }
        }
        return true;
    }
    public static boolean isZero(int index, int[]nums){
        if (index==nums.length){
            return true;
        }
        if (nums[index]!=0){
            return false;
        }

        return isZero(index+1,nums);
    }

    public static void main(String[] args) {
        int nums[] = {3,2,1,0,4};
        System.out.println(canJump(nums));
    }
}
