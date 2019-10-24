package baekJoonStar;

import java.util.Scanner;

public class Solution01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		
		for(int i = num ; i>0 ; i--) {
			for(int j =num ;j>0 ; j--) {
			System.out.print("*");
			}
			System.out.println("");
			num--;
		}
	}

}
