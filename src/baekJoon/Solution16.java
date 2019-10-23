package baekJoon;

import java.util.Scanner;

public class Solution16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		int count = 1;
		
		for(int i =0 ; i<num ; i++) {
			for(int j = 0 ; j<num-count ; j++) {
				System.out.print(" ");
			}
			for(int j = 0 ; j<count; j++) {
				System.out.print("*");
			}
			System.out.println("");
			count++;
		}
	}

}
