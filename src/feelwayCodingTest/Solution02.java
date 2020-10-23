package feelwayCodingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution02 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arraySize = br.readLine();
        String arrayIndex = br.readLine();
        String findNum = br.readLine();

        System.out.println(solution(arraySize,arrayIndex,findNum));
    }

    public static String solution(String arraySize,String arrayIndex,String findNum){
        int size = Integer.parseInt(arraySize);
        String answer = "";
        int find = Integer.parseInt(findNum);
        String[] indexArray = arrayIndex.split(" ");
        int[] array = new int[indexArray.length];
        for (int i = 0 ; i < array.length ; i++){
            array[i]=Integer.parseInt(indexArray[i]);
        }
        int compareIndex = size/2;
        boolean isBig = false;
        if (array[compareIndex]>find){
            compareIndex--;
            isBig=false;
        }else if (array[compareIndex]<find){
            compareIndex++;
            isBig=true;
        }

        while (true){
            if (array[compareIndex]>find){
                if (isBig){
                    return "X";
                }
                compareIndex--;
            }else if (array[compareIndex]<find){
                if (!isBig){
                    return "X";
                }
                compareIndex++;
            }else if (array[compareIndex]==find){
                answer=String.valueOf(compareIndex+1);
                break;
            }
        }

        return answer;
    }
}
