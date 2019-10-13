package javaAlgorithm1;

public class Solution8 {
	public static void main(String[] args) {
		solution8(12);
	}
	
	public static boolean solution8(int x) {
		boolean answer = true;
		int length = String.valueOf(x).length();
		
		int[] a = new int[length];
		int index = 0;
		int i =x;
		
		while(i/10!=0) {
			int b = i%10;
			i = i/10;
			
			a[index] = b;
			index++;
		}
		a[index] = i;
		
		int sum = 0;
	
		for(int nums : a) {
			sum +=nums;
		}
		
		if(x%sum==0) {
			answer = true;
		}
		else if(x%sum!=0) {
			answer = false;
		}
		
		return answer;
		
	}

}


//
//arr	return
//10	true
//12	true
//11	false
//13	false