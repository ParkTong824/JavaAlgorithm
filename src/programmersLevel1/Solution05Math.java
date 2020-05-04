package programmersLevel1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Solution05Math {
    public static void main(String[] args) {
        int[] answers = {1,3,2,4,2};

        solution(answers);
    }

    public static int[] solution(int[] answers) {

        int personA = 0;

        int personB = 0;
        int[] bArr = {2,1,2,3,2,4,2,5};

        int personC = 0;
        int[] cArr = {3,3,1,1,2,2,4,4,5,5};

        for (int i = 0 ; i < answers.length ; i++){
            if (answers[i]%5==i%5+1){
                personA++;
            }
            if (answers[i]==bArr[i%8]){
                personB++;
            }
            if (answers[i]==cArr[i%10]){
                personC++;
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(1);

        if (personA<=personB){
            if (personA<personB){
                result.remove(0);
                result.add(2);
                if (personB<=personC){
                    if (personB<personC){
                        result.remove(0);
                        result.add(3);
                    }else {
                        result.add(3);
                    }
                }
            }else {
                result.add(personB);
                if (personB<personC){
                    result.remove(1);
                    result.remove(0);
                    result.add(3);
                }else if (personB==personC){
                    result.add(3);
                }
            }
        }else {
            if (personA<personC){
                result.remove(0);
                result.add(3);
            }else if (personA==personC){
                result.add(3);
            }
        }
        int[] answer = new int[result.size()];
        for (int i = 0 ; i < result.size() ; i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}

/*
1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
answers	return
[1,2,3,4,5]	[1]
[1,3,2,4,2]	[1,2,3]
 */