package baekJoon;

import java.util.Scanner;

public class Solution22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numArr = new int[8];
		int a = sc.nextInt();
		boolean isAscend = false;
		numArr[0] = a;
		int count = 0;
		for(int i =1 ; i<8 ; i++) {
			int b = sc.nextInt();
			numArr[i] = b;
			if(numArr[i]-numArr[i-1]==-1){
				count++;
				continue;
			}
			else if(numArr[i]-numArr[i-1]!=-1 &&numArr[i]-numArr[i-1]!=1){
			}
			else {
				isAscend = true;
				count++;
				continue;
			}
		}
		if(isAscend && count==7) {
			System.out.println("ascending");
		}
		else if(isAscend==false && count==7){
			System.out.println("descending");
		}
		else {
			System.out.println("mixed");
		}
	}

}
