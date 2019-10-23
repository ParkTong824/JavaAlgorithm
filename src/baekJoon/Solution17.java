package baekJoon;

import java.io.*;

//출력법 다시 확인


public class Solution17 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		for(int i = 0 ; i<n ;i++) {
			int a = Integer.parseInt(br.readLine());
			if(a<m) {
				bw.write(Integer.parseInt(br.readLine()));
			}
		}
	}

}
