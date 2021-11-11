package leetcode5;

public class S405_ConvertANumberToHexa {
    public static void main(String[] args) {
        int num = 32;
        System.out.println(Integer.toHexString(num));
    }
    public static String toHex(int num) {
        int resultLength = 1;
        StringBuilder result = new StringBuilder();
        while (true) {
            if (num<Math.pow(16,resultLength)){
                break;
            } else {
                resultLength++;
            }
        }
        for (int i = 0 ; i < resultLength ; i++) {
            int indexNum = (int) (num/Math.pow(16,resultLength-i-1));
            result.append(convertIntToString(indexNum));
            num%=(int)(num/Math.pow(16,resultLength-i-1));
        }

        return result.toString();
    }
    public static StringBuilder convertIntToString(int num){
        StringBuilder convertString = new StringBuilder();
        switch (num){
            case 10:
                convertString.append("a");
                break;
            case 11:
                convertString.append("b");
                break;
            case 12:
                convertString.append("c");
                break;
            case 13:
                convertString.append("d");
                break;
            case 14:
                convertString.append("e");
                break;
            case 15:
                convertString.append("f");
                break;
            default:
                convertString.append(num);
                break;
        }
        return convertString;
    }
}
