package baekJoon;

import java.util.Scanner;

public class Solution18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = -1;
		
		while(sum!=0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum = a+b;
			if(sum == 0) {
				break;
			}
			else {
			System.out.println(sum);
			}
		}
	}

}
