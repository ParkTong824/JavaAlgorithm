package ntsCodingTest;

public class NTS01 {
    public static void main(String[] args) {
        int a = 3000;
        int b = 5000;
        int budget = 23000;
        System.out.println(solution(a,b,budget));
    }

    public static int solution(int a, int b, int budget) {
        int answer = 0;
        int numA = a>b? a:b;
        int numB = a<b? a:b;

        int numBudget = budget;
        int count = 0;
        while (true) {
            if (numA % 10 == 0 && numB % 10 == 0) {
                numA /= 10;
                numB /= 10;
                numBudget /= 10;
            } else {
                break;
            }
        }
        int orginB = numB;
        while(numA+numB<=numBudget){
            if((numBudget-numB)%numA==0){
                count++;
            }
            numB+=orginB;
        }

        answer = count;
        return answer;
    }
}
