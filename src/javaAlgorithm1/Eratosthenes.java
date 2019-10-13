package javaAlgorithm1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//에라토스테네스의 체 (소수 알고리즘) 
public class Eratosthenes {
    public static boolean[] primeNum;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //StringTokenizer -> string 을 토큰단위로 나눠줌
        //buffered <> scanner 둘다 입력장치 큰데이터값은 buffered 가 효율적
        int startNum = Integer.parseInt(st.nextToken());
        int endNum = Integer.parseInt(st.nextToken());
        
        primeNum = new boolean[endNum+1];
        getPrimeNum();
        
        StringBuilder sb = new StringBuilder();
        //StringBuilder string 과 문자열을 더할때 사용 append()-> 문자열을 더할떄
        for(int i = startNum; i <= endNum; i++) {
            if(!primeNum[i]) {
                sb.append(i + "\n");
            }
        }
        
        System.out.println(sb.toString());
        
        br.close();
    }
    
    public static void getPrimeNum() {
        primeNum[1] = true;
        
        for(int i= 2; i < primeNum.length; i++) {
            for(int j = 2; i*j < primeNum.length; j++) {
                primeNum[i*j] = true;
            }
        }
    }
}