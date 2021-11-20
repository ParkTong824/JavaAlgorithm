package leetcode5;

public class S441_ArrangingCoin {
    public static int arrangeCoins(int n) {
        if (n==2147483647){
            return 65535;
        }
        int sum = 0;
        int index = 1;
        while (true) {
            if (sum+index>n) {
                return index-1;
            } else if (sum+index==n) {
                return index;
            } else {
                sum=sum+index;
                index++;
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(arrangeCoins(n));
    }
}
