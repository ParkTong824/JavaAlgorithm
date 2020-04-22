package codingtestDevMatching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution4BinaryTree {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println("Hello Groorm! Your input is " + input);

        solution(input);

    }

    public static void solution(String input){
        String answer = "";
        String[] inputSplit = input.split(" ");
        int nodeDepth = 0;
        int nodeSize = 0;

        while (inputSplit.length>nodeSize){
            nodeSize=nodeSize+(int)Math.pow(2,nodeDepth);
            nodeDepth++;
        }
        int start = nodeSize-(int)Math.pow(2,nodeDepth-1);
        int lastIndex = nodeSize-(int)Math.pow(2,nodeDepth-1);
        while (!inputSplit[0].equals("-1")) {
            answer = answer+inputSplit[start]+" ";
            inputSplit[start]="-1";
            if (start%2==0){
                start=start/2-1;
            }else {
                lastIndex++;
                start=lastIndex;
            }
        }

        System.out.println(answer);
    }

}
