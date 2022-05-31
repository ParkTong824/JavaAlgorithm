package leetcode6;

public class S605_CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean checkStart = false;
        boolean beforeOne = false;
        int result = 0;
        for (int i = 0 ; i < flowerbed.length ; i++) {
            if (flowerbed[i]==1) {
                if (checkStart && !beforeOne) {
                    result++;
                } else if (!checkStart) {
                    checkStart = true;
                }

                beforeOne = true;
            } else {
                beforeOne = false;
            }
            if (result >= n) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] test = {1,0,0,0,1};
        System.out.println(canPlaceFlowers(test, 1));
    }
}
/*
Input: flowerbed = [1,0,0,0,1], n = 1
Output: true

Input: flowerbed = [1,0,0,0,1], n = 2
Output: false
 */