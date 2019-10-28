package baekJoon;

import java.util.Scanner;

public class Solution23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		for(int i = 0 ; i<10 ; i++) {
			int a = sc.nextInt();
			num[0] = a%42;
		}
		
		for(int i = 0 ; i<10 ; i++) {
			boolean isOverlap = false;
			for(int j = i ; j<10 ;j++) {
				if(num[i]==num[j]) {
					isOverlap = true;
				}
			}
		}
		
		
		
	}

}
