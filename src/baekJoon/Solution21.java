package baekJoon;

import java.util.Scanner;

public class Solution21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numArr = new int[9];
		int max = 0;
		int maxNum = 0;
		
		for(int i = 0 ; i<9 ; i++) {
			int num = sc.nextInt();
			numArr[i] = num;
			maxNum = max>numArr[i] ? maxNum : i+1;
			max = max>numArr[i] ? max : numArr[i];
			
		}
		System.out.println(max);
		System.out.println(maxNum);
		
	}

}
