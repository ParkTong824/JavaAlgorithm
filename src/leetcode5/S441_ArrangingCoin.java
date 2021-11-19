package leetcode5;

public class S441_ArrangingCoin {
    public static int arrangeCoins(int n) {
        int sum = 0;
        int index = 1;
        while (sum<=n) {
            sum=sum+index;
            index++;
        }
        return index-1;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(arrangeCoins(n));
    }
}
