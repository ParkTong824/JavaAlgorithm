package baekJoon;

import java.util.Scanner;

public class Solution07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b &&a<c) {
			System.out.println(a);
		}
		else if(b>a &&b<c) {
			System.out.println(b);
		}
		else if(c>a &&c<b) {
			System.out.println(c);
		}
		else if(a>c &&a<b) {
			System.out.println(a);
		}
		else if(b>c &&b<a) {
			System.out.println(b);
		}
		else if(c>b &&c<a) {
			System.out.println(c);
		}
	}

}
