package javaAlgorithm2;


import java.util.ArrayList;


public class Solution17 {
	public static void main(String[] args) {
		String number = "1277322314";
		int k = 5;
		System.out.println(solution(number , k));
		
	}
	 public static String solution(String number, int k) {
	        String answer = "";
	        String[] arrNumber = new String[number.length()];//number를 split 으로 한글자씩 저장할 배열.
	        arrNumber =number.split("");
	        int count = k;//지운 갯수 확인용
	        int countA = 0; //result 배열 순서
	        
	        ArrayList<Integer> arrNum = new ArrayList<Integer>();//가장큰수 구하는 리스트
	        int[] result = new int[arrNumber.length-k];
	        String[] toString = new String[result.length];//result int값 String으로 변환 후 저장
	        
	        for(int i = 0 ; i<number.length() ; i++) {
	        	arrNum.add(Integer.parseInt(arrNumber[i]));
	        }
	        while(count!=0) {
	        	int maxNum = 0; //가장 큰 자리 순번 확인용
	        	int max = 0;//가장 큰 자리 확인용
	        	for(int i = 0 ; i<count+1 ; i++) {
	        		maxNum = arrNum.get(i)>max ? i : maxNum;
	        		max = arrNum.get(i)>max ? arrNum.get(i) : max;        		
	        	}
	        	result[countA] = arrNum.get(maxNum);
	        	for(int i = 0 ; i<maxNum ; i++) {
	        		arrNum.remove(0);
	        		count--;
	        	}
	        	arrNum.remove(0);//사용한 숫자 리스트에서 제거
	        	countA++;
	        }
	        //남은 숫자들 배열에 저장
	        for(int i = 0 ; i<arrNum.size();i++) {
	        	result[countA+i]=arrNum.get(i);
	        }
	        for(int i = 0 ; i<result.length ; i++) {
	        	toString[i] = Integer.toString(result[i]);
	        	answer = String.join("",toString);
	        }
	        
	        return answer;
	    }

}

//
//어떤 숫자에서 k개의 수를 제거했을 때 얻을 수 있는 가장 큰 숫자를 구하려 합니다.
//
//예를 들어, 숫자 1924에서 수 두 개를 제거하면 [19, 12, 14, 92, 94, 24] 를 만들 수 있습니다. 이 중 가장 큰 숫자는 94 입니다.
//
//문자열 형식으로 숫자 number와 제거할 수의 개수 k가 solution 함수의 매개변수로 주어집니다.
//number에서 k 개의 수를 제거했을 때 만들 수 있는 수 중 가장 큰 숫자를 문자열 형태로 return 하도록 solution 함수를 완성하세요.
//
//제한 조건
//number는 1자리 이상, 1,000,000자리 이하인 숫자입니다.
//k는 1 이상 number의 자릿수 미만인 자연수입니다.
//입출력 예
//number	k	return
//1924	2	94
//1231234	3	3234
//4177252841	4	775841
/*
 * 384776234 4
 */