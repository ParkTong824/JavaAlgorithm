package javaAlgorithm2;

public class Solution8 {
	public static void main(String[] args) {
		
	}
	
	public int solution(int n) {
        int ans = 0;
        int leng = n;
        int count = 0;
        
        while(leng!=0) {
        	if(leng%2==0) {
        		leng = leng/2;
        	}
        	else if(leng%2==1) {
        		leng = (leng-1)/2;
        		count++;
        	}
        }
        ans = count;

        return ans;
    }
}

//N	result
//5	2
//6	2
//5000	5