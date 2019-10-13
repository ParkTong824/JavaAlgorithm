package javaAlgorithm2;

import java.util.Arrays;
import java.util.HashMap;

public class KaKao1 {
	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan","Change uid1234 Ryan"};
		String[] answer = solution(record);
	}
	
	public static String[] solution(String[] record) {
		String[] answer = {};
        int count = 0;
        String[][] spl = new String[record.length][3];
        HashMap<String,String> user = new HashMap<>();
        for(int i = 0; i<record.length ; i++) {
        	spl[i] = record[i].split(" ");
        	if(spl[i][0].equals("Enter")){
        		user.put(spl[i][1],spl[i][2]);
        		count++;
        	}
        	else if(spl[i][0].equals("Change")) {
        		user.put(spl[i][1], spl[i][2]);
        	}
        	else if(spl[i][0].equals("Leave")) {
        		count++;
        	}
        }
        String[] answerA = new String[count];
        int j = 0;
        for(int i = 0; i<record.length; i++) {
        	
        	if(spl[i][0].equals("Enter")) {
        		answerA[j] = user.get(spl[i][1])+"님이 들어왔습니다.";
        		j++;
        	}
        	else if(spl[i][0].equals("Leave")) {
        		answerA[j] = user.get(spl[i][1])+"님이 나갔습니다.";
        		j++;
        	}
        	
        }
        answer = answerA;
        for(int i=0; i < record.length; i++) {
        	
        }
        return answer;
    }

}
