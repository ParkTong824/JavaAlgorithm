package leetcode5;

public class S415_AddString {
    public static String addStrings(String num1, String num2) {
        int stringLength = Math.max(num1.length(), num2.length());
        StringBuilder result = new StringBuilder();
        int overNum = 0;
        int number1 = 0;
        int number2 = 0;
        for (int i = 0 ; i < stringLength ; i++) {
            try {
                number1 = Character.getNumericValue(num1.charAt(num1.length()-1-i));
            } catch (StringIndexOutOfBoundsException e) {
                number1 = 0;
            }
            try {
                number2 = Character.getNumericValue(num2.charAt(num2.length()-1-i));
            } catch (StringIndexOutOfBoundsException e) {
                number2 = 0;
            }
            result.insert(0,(number1+number2+overNum)%10);
            overNum = (number1+number2+overNum)/10;
        }
        if (overNum!=0){
            result.insert(0,overNum);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String num1 = "1259459";
        String num2 = "123";
        System.out.println(addStrings(num1,num2));
    }
}
