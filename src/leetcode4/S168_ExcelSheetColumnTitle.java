package leetcode4;

public class S168_ExcelSheetColumnTitle {
    public static void main(String[] args) {
        int columnNumber = 5473578;
//"YYYYZ" 11881375
        //5473578
        System.out.println(convertToTitle(columnNumber));
    }

    public static String convertToTitle(int columnNumber) {
        int count = 26;
        StringBuilder stringBuilder = new StringBuilder();
        int answerLength = 0;

        double tempCheckNum = 0;
        while (columnNumber > tempCheckNum) {
            answerLength++;
            tempCheckNum += Math.pow(count, answerLength);
        }

        while (answerLength > 0) {
            int calculateNum = (int) Math.pow(count, answerLength-1);
            int charNum = columnNumber/calculateNum;
            if (answerLength == 1 && charNum == 0) {
                charNum = 26;
            } else if (charNum == 0 && columnNumber % calculateNum != 0) {
                charNum = 26;
            } else if (answerLength > 1 && columnNumber % calculateNum == 0) {
                charNum--;
            }
            stringBuilder.append((char)('A' +charNum-1));
            columnNumber = columnNumber % (calculateNum*charNum);
            answerLength--;
        }

        return stringBuilder.toString();
    }
}
/*
Example 1:

Input: columnNumber = 1
Output: "A"

Input: columnNumber = 28
Output: "AB"
                      40
C D E F G H I J K L M N O P Q R S T U V W X Y Z
Input: columnNumber = 701
Output: "ZY"
 */