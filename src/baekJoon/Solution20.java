package baekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Solution20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] numArr = new int[a];
		for(int i = 0 ;i<a ; i++) {
			int b = sc.nextInt();
			numArr[i] = b;
		}
		sc.close();
		Arrays.sort(numArr);
		
		System.out.println(numArr[0]);
		System.out.println(numArr[numArr.length-1]);
	}

}
