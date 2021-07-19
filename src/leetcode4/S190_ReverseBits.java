package leetcode4;

public class S190_ReverseBits {
    public static void main(String[] args) {
        int n = 43261596;
        System.out.println(reverseBits(n));
    }
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
        String nString = String.format("%32s", Integer.toBinaryString(n)).replace(" ", "0");
        char[] nArr = nString.toCharArray();
        StringBuilder tmpBuilder = new StringBuilder();
        for (int i = nArr.length-1 ; i>=0; i--){
            tmpBuilder.append(nArr[i]);
        }

        return Integer.parseInt(tmpBuilder.toString(),2);
    }
}
