package leetcode6;

public class S551_StudentAttendance {
//    502458
//    1406917
    public static void main(String[] args) {
        long checkStart = System.nanoTime();
        String test = "LLLLL";
        System.out.println(checkRecord(test));
        long finishTime = System.nanoTime();
        System.out.println((finishTime-checkStart));
    }
    public static boolean checkRecord(String s) {
        char[] splitArr = s.toCharArray();
        int absentCount = 0;
        int lateCount = 0;
        for (int i = 0 ; i < splitArr.length ; i++) {
            switch (splitArr[i]) {
                case 'A':
                    absentCount++;
                    lateCount = 0;
                    break;
                case 'L':
                    lateCount++;
                    break;
                default:
                    lateCount = 0;
            }
            if (lateCount == 3) {
                return false;
            }
            if (absentCount >= 2) {
                return false;
            }
        }

        return true;
    }
//    public static boolean checkRecord(String s) {
//        String[] splitArr = s.split("");
//        int absentCount = 0;
//        int lateCount = 0;
//        for (int i = 0 ; i < splitArr.length ; i++) {
//            if (splitArr[i].equals("A")) {
//                absentCount++;
//            } else if (splitArr[i].equals("L")) {
//                lateCount++;
//            }
//            if (lateCount == 3) {
//                absentCount++;
//            }
//            if (absentCount >= 2) {
//                return false;
//            }
//        }
//
//        return true;
//    }
}
/*
Input: s = "PPALLP"
Output: true
Explanation: The student has fewer than 2 absences and was never late 3 or more consecutive days.

Input: s = "PPALLL"
Output: false
Explanation: The student was late 3 consecutive days in the last 3 days, so is not eligible for the award.
 */