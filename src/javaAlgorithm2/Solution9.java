package javaAlgorithm2;

public class Solution9 {
	public static void main(String[] args) {
		
	}
	
	public int solution(int n, int a, int b)
    {
        int answer=0;
        int people = n;
        int match = n;
        int personA= (a<b) ? a : b;
        int personB =(a>b) ? a : b;
        int count =0;
        
        
       while(people !=0) {
    	   people=people/2;
    	   count++;
    	   if(people==1) {
    		   people=0;
    	   }
    	   
       }
       while(match!=0) {
    	   if(personA<=(match/2) &&personB>(match/2)) {
    		   answer = count;
    		   break;
    	   }
    	   else if(personA<=(match/2) && personB<=(match/2)) {
    		   match = match/2;
    		   count--;
    	   }
    	   else if(personA>(match/2) && personB>(match/2)) {
    		   personA = personA -(match/2);
    		   personB = personB -(match/2);
    		   match = match/2;
    		   count--;
    	   }
       }


        return answer;
    }

}


//토너먼
//N	A	B	answer
//8	4	7	3