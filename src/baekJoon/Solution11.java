package baekJoon;

import java.io.*;

public class Solution11 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i<n ;i++) {
			int sum = 0;
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			
			bw.write(a+b);
		
		}
	}

}
