package test;

import java.util.*;

public class Solution08 {
    public static int[] solution(int[] fees, String[] records) {
        Map<Integer,Integer> tempMap = new HashMap<>();
        Map<Integer,Integer> timeMap = new HashMap<>();
        for(int i = 0 ; i < records.length ; i++){
            String[] carSplit = records[i].split(" ");
            int parkingTime = Integer.parseInt(carSplit[0].substring(0,2))*60+Integer.parseInt(carSplit[0].substring(3));
            int carNumber = Integer.parseInt(carSplit[1]);
            if(tempMap.containsKey(carNumber)){
                tempMap.get(carNumber);
                if (timeMap.containsKey(carNumber)){
                    timeMap.put(carNumber,parkingTime-tempMap.get(carNumber)+timeMap.get(carNumber));
                }else {
                    timeMap.put(carNumber,parkingTime-tempMap.get(carNumber));
                }
                tempMap.remove(carNumber);
            } else {
                tempMap.put(carNumber,parkingTime);
            }
        }
        if (!tempMap.isEmpty()){
            int endTime = 23*60+59;
            Iterator<Integer> iterator = tempMap.keySet().iterator();
            while (iterator.hasNext()) {
                int carNumber = iterator.next();
                if (timeMap.containsKey(carNumber)){
                    timeMap.put(carNumber,endTime-tempMap.get(carNumber)+timeMap.get(carNumber));
                }else {
                    timeMap.put(carNumber,endTime-tempMap.get(carNumber));
                }
            }
        }
        List<Integer> keyList = new ArrayList<>(timeMap.keySet());
        Collections.sort(keyList);
        int[] answer = new int[keyList.size()];
        for (int i = 0 ; i < keyList.size() ; i++){
            boolean isPlus = (timeMap.get(keyList.get(i))-fees[0])>=0;
            int overTime =0;
            if (isPlus){
                overTime = (timeMap.get(keyList.get(i))-fees[0])/fees[2];
                overTime = (timeMap.get(keyList.get(i))-fees[0])%fees[2]>0 ? overTime+1 : overTime;
            }
            int fee = fees[1]+(overTime*fees[3]);
            answer[i] = fee;
        }

        return answer;
    }

    public static void main(String[] args) {
        int fees[] = {180,5000,10,600};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 IN"};
        System.out.println(Arrays.toString(solution(fees,records)));
    }
}
