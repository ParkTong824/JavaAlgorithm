package leetcode;

public class Solution11ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int area = 0;

        for (int i = 0 ; i < height.length-1 ; i++){
            int headHeight = height[i];
            for (int j = i+1 ; j < height.length ; j++){
                int tailHeight = height[j];
                int nowArea = (tailHeight>=headHeight?headHeight:tailHeight)*(j-i);
                if (area<nowArea){
                    area = nowArea;
                }
            }
        }
        return area;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
/*
Input: [1,8,6,2,5,4,8,3,7]
Output: 49
 */