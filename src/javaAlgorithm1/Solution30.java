package javaAlgorithm1;

import java.util.Arrays;

public class Solution30 {
	public static void main(String[] args) {
		
	}
	
	public int[] solution(int[] answers) {
		int[] answer = {};
        int[] personA = new int[answers.length];
        int[] personB = new int[answers.length];
        int[] personC = new int[answers.length];
        int a = 0;
        int b = 0;
        int c = 0;
        int[] count = {a,b,c};
        for(int i =0 ; i<answers.length ; i++) {
        	personA[i]= i%5+1;
        	if(i%2==0) {
        		personB[i]=2;
        		if(i%10==0) {
        			personC[i]=3;
        		}
        		else if(i%10==2) {
        			personC[i]=1;
        		}
        		else if(i%10==4) {
        			personC[i]=2;
        		}
        		else if(i%10==6) {
        			personC[i]=4;
        		}
        		else if(i%10==8) {
        			personC[i]=5;
        		}
        	}
        	else if(i%8==1) {
        		personB[i] =1;
        	}
        	else if(i%8==3) {
        		personB[i] =3;
        	}
        	else if(i%8==5) {
        		personB[i] =4;
        	}
        	else if(i%8==7) {
        		personB[i] =5;
        	}
        	else if(i%2!=0) {
        		personC[i]=personC[i-1];
        	}
        	else if(answer[i]==personA[i]) {
        		a++;
        	}
        	else if(answer[i]==personB[i]) {
        		b++;
        	}
        	else if(answer[i]==personC[i]) {
        		c++;
        	}
        
        }
        	int max = count[0];
        	for(int i:count) {
        		if(i>max) {
        			max = i;
        		}
        	}
        	int leng = 0;
        	for(int i = 0; i<3;i++) {
        		if(count[i]==max) {
        			leng++;
        		}
        	}
        	int who[] = new int[leng];
        	int j = 0;
        	for(int i =0; i<3 ; i++) {
        		if(count[i] == max) {
        			who[j] = i+1;
        		}
        	}
        	
        	return who;
	}
}
//
//1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...