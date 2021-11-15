package leetcode5;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class S414_ThirdMaximumNum {
    public static int thirdMax(int[] nums) {
        Set<Integer> sortSet = new TreeSet<>();
        for (int i = 0 ; i < nums.length ; i++) {
            sortSet.add(nums[i]);
        }
        Object[] resultArr = sortSet.toArray();
        if (resultArr.length<3) {
            return (int) resultArr[resultArr.length-1];
        } else {
            return (int) resultArr[resultArr.length-3];
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2};

        System.out.println(thirdMax(nums));
    }
}
