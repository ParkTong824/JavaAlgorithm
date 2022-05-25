package leetcode6;

public class S551_StudentAttendance {
    public static void main(String[] args) {
        long checkStart = System.currentTimeMillis();
        String test = "PPALLL";
        System.out.println(checkRecord(test));
        long finishTime = System.currentTimeMillis();
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
                    break;
                case 'L':
                    lateCount++;
                    break;
            }
            if (lateCount == 3) {
                absentCount++;
            }
            if (absentCount >= 2) {
                return false;
            }
        }

        return true;
    }
}
/*
Input: s = "PPALLP"
Output: true
Explanation: The student has fewer than 2 absences and was never late 3 or more consecutive days.

Input: s = "PPALLL"
Output: false
Explanation: The student was late 3 consecutive days in the last 3 days, so is not eligible for the award.
 */