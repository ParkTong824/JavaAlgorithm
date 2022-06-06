package leetcode6;

public class S657_ReturnOrigin {
    public static void main(String[] args) {
        System.out.println(judgeCircle("LL"));
    }
    public static boolean judgeCircle(String moves) {
        int horIndex = 0;
        int verIndex = 0;
        char[] moveArr = moves.toCharArray();
        for (int i = 0 ; i < moveArr.length ; i++) {
            switch (moveArr[i]){
                case 'U':
                    verIndex++;
                    break;
                case 'D':
                    verIndex--;
                    break;
                case 'L':
                    horIndex--;
                    break;
                case 'R':
                    horIndex++;
                    break;
            }
        }
        if (horIndex==0 && verIndex==0) {
            return true;
        } else {
            return false;
        }
    }
}
/*
Input: moves = "UD"
Output: true
Explanation: The robot moves up once, and then down once. All moves have the same magnitude,
 so it ended up at the origin where it started. Therefore, we return true.

Input: moves = "LL"
Output: false
Explanation: The robot moves left twice. It ends up two "moves" to the left of the origin.
 We return false because it is not at the origin at the end of its moves.
 */