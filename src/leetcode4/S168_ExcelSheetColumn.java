package leetcode4;

public class S168_ExcelSheetColumn {
    public static String convertToTitle(int columnNumber) {
        int resultLength = 1;
        StringBuilder stringBuilder = new StringBuilder();
        while (true){
            int lengthCheck = 0;
            for (int i = 0 ; i <= resultLength; i++){
                lengthCheck+=Math.pow(26,i);
            }
            if (lengthCheck>=columnNumber){
                break;
            }
            resultLength++;
        }
        for (int i = resultLength ; i>=1 ; i--){
            int tempNum = 0;
            for (int j = 1 ; j <= i ; j++){
                tempNum+=Math.pow(26,j);
            }
            int headNum = columnNumber/tempNum;
            char headChar = (char) ('A'+headNum-1);
            stringBuilder.append(headChar);
            columnNumber=columnNumber%tempNum;
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        int columnNumber = 28;
        System.out.println(convertToTitle(columnNumber));
    }
}
/*
Input: columnNumber = 1
Output: "A"

Input: columnNumber = 28
Output: "AB"

Input: columnNumber = 701
Output: "ZY"

Input: columnNumber = 2147483647
Output: "FXSHRXW"
 */
