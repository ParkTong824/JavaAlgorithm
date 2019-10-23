package baekJoon;

import java.util.Scanner;

public class Solution12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int a = sc.nextInt();
		
		for(int i =1 ; i<a+1 ; i++) {
			num++;
			System.out.println(num);
		}
	}

}
