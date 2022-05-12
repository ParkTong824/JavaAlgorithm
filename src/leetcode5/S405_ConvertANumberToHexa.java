package leetcode5;

public class S405_ConvertANumberToHexa {
    public static void main(String[] args) {
        int num = 26;
        System.out.println(toHex(num));
    }
    public static String toHex(int num) {
        if (num < 0) {
            return "ffffffff";
        } else if (num == 0) {
            return  "0";
        }
        StringBuilder result = new StringBuilder();
        int leng = 0;
        while (Math.pow(16,leng)<=num) {
            leng++;
        }
        for (int i = leng ; i > 0 ; i--) {
            int tempNum = 0;
            if (i==1){
                tempNum = num;
            } else {
                tempNum = (int) (num/Math.pow(16,leng-1));
                num = (int)(num % Math.pow(16,leng-1));
            }

            result.append(convertString(tempNum));
        }

        return result.toString();
    }

    public static String convertString (int num) {
        switch (num) {
            case 10:
                return "a";
            case 11:
                return "b";
            case 12:
                return "c";
            case 13:
                return "d";
            case 14:
                return "e";
            case 15:
                return "f";
            default:
                return String.valueOf(num);
        }
    }
}
