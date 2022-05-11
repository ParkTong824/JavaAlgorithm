package leetcode5;

public class S405_ConvertANumberToHexa {
    public static void main(String[] args) {
        int num = 16*16;
        System.out.println(toHex(num));
    }
    public static String toHex(int num) {
        int leng = 0;
        while (Math.pow(16,leng)<=num) {
            leng++;
        }

        return String.valueOf(leng);
    }
}
