package javaAlgorithm2;

public class Solution2 {
	 public static void main(String[] args) {
		
	}
	 
	 public int[] solution(int[] progresses, int[] speeds) {
	        int[] answer = {};
	        int[] pro = new int[progresses.length];
	        int[] spe = new int[speeds.length];
	        int[] make = new int[progresses.length];
	        int day = 0;
	        while(make[0]<100) {
	        for(int i =0 ; i<progresses.length; i++) {
	        	
	        }
	        }
	        return answer;
	    }

}

//작업의 개수(progresses, speeds배열의 길이)는 100개 이하입니다.
//작업 진도는 100 미만의 자연수입니다.
//작업 속도는 100 이하의 자연수입니다.
//배포는 하루에 한 번만 할 수 있으며, 하루의 끝에 이루어진다고 가정합니다. 예를 들어 진도율이 95%인 작업의 개발 속도가 하루에 4%라면 배포는 2일 뒤에 이루어집니다.
//입출력 예
//progresses	speeds	return
//[93,30,55]	[1,30,5]	[2,1]
