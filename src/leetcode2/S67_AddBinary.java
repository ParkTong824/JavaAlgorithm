package leetcode2;

public class S67_AddBinary {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a,b));
    }
    public static String addBinary(String a, String b) {
        char up = '0';
        StringBuffer answer = new StringBuffer();
        int aIndex = a.length()-1;
        int bIndex = b.length()-1;
        while (aIndex>=0 || bIndex>=0) {
            char aChar = aIndex>=0? a.charAt(aIndex):0;
            char bChar = bIndex>=0? b.charAt(bIndex):0;
            if (aChar=='1' && bChar=='1'){
                if (up =='1'){
                    answer.insert(0,'1');
                } else {
                    answer.insert(0,'0');
                }
                up = '1';
            } else if (aChar=='1' || bChar=='1') {
                if (up =='1'){
                    answer.insert(0,'0');
                    up='1';
                } else {
                    answer.insert(0,'1');
                    up='0';
                }
            } else {
                if (up=='1'){
                    answer.insert(0,'1');
                } else {
                    answer.insert(0,'0');
                }
                up='0';
            }
            aIndex--;
            bIndex--;
        }
        if (up=='1'){
            answer.insert(0,'1');
        }
        return answer.toString();
    }
}
