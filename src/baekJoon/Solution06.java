package baekJoon;

import java.util.Scanner;

public class Solution06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		if(min<45) {
			hour = hour -1;
			min = (60-(45-min));
			System.out.println(hour + " " + min);
		}
		else {
			System.out.println(hour +" "+(min-45));
		}
	}

}