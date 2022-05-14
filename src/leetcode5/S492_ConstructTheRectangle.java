package leetcode5;

import java.util.Arrays;

public class S492_ConstructTheRectangle {
    public static void main(String[] args) {
        int a = 122122;
        System.out.println(Arrays.toString(constructRectangle(a)));
    }
    public static int[] constructRectangle(int area) {
        int middleNum = (int)Math.sqrt(area);
        while (area%middleNum!=0) {
            middleNum--;
        }

        return new int[]{area / middleNum, middleNum};
    }
}
