package javaAlgorithm3;

import java.util.ArrayList;

public class Solution04Hun {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();

        list1.add(0);
        list1.add(8000);
        list1.add(7000);
        list1.add(6000);
        list1.add(2000);
        list1.add(1000);

        int def = 4000;
        int bitar = 0;
        for(int i = 1 ; i<list1.size() ; i++){
            if(list1.get(i)<=def){
                if(list1.get(i)<def){
                    boolean isBig = def-list1.get(i)>=list1.get(i-1)-def;
                    if(isBig){
                        bitar=list1.get(i-1);
                        break;
                    }else {
                        bitar=list1.get(i);
                        break;
                    }
                }else{
                    bitar = list1.get(i);
                    break;
                }

            }
        }

    }
}
