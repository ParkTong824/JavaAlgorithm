package leetcode2;

public class S74_SearchMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7},{10, 11, 16, 20},{23,30,34,60}};
        int target =13;
        System.out.println(searchMatrix(matrix,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int ver = matrix[0].length;
        for ( int i = 0 ; i < matrix.length ; i++){
            if (target>=matrix[i][0]&&target<=matrix[i][ver-1]){
                for (int j = 0 ; j < ver; j++){
                    if (matrix[i][j]<target){
                        continue;
                    } else if (matrix[i][j]==target){
                        return true;
                    } else {
                        return false;
                    }
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
/*
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
 */