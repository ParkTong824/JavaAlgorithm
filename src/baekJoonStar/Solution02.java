package baekJoonStar;

import java.util.Scanner;

public class Solution02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int count = 0;
		
		
		for(int i = num ; i>0 ; i--) {
			for(int j = 0 ; j<count ; j++) {
				System.out.print(" ");
			}
			for(int j =num-count ;j>0 ; j--) {
			System.out.print("*");
			}
			System.out.println("");
			count++;
		}
	}

}
