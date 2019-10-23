package baekJoon;

import java.util.Scanner;

public class Solution19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =a + b;
		int x = a;
		int y = b;
		int z = c;
		
		while(y!=a && z !=b) {
			x =y;
			y =z;
			z =x+y;
			if(z>9) {
				z = z%10;
			}
			else {
				z =z;
			}
			count++;

		}
		System.out.println(count);
	}

}
