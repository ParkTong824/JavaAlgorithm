package leetcode5;

public class S461_HammingDistance {
    public int hammingDistance(int x, int y) {
        int xNum = 0 ;
        int yNum = 0 ;
        boolean xCheck = false;
        boolean yCheck = false;
        int index = 0 ;
        while (!xCheck && !yCheck) {
            if (!xCheck&&Math.pow(2,index)>=x){
                if (Math.pow(2,index)==x) {
                    xNum=index;
                    xCheck = true;
                } else {
                    xNum=index-1;
                    xCheck = true;
                }
            }
            if (!yCheck&&Math.pow(2,index)>=y) {
                if (Math.pow(2,index)==y) {
                    yNum=index;
                    yCheck = true;
                } else {
                    yNum = index-1;
                    yCheck = true;
                }
            }
        }
        return Math.abs(yNum-xNum);
    }

    public static void main(String[] args) {

    }
}
