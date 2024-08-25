package leetcode4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class S195_TenthLine {
    public static void main(String[] args) {
        File file = new File("/Users/user/test.txt");
        int lineNum = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineNum++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Line "+lineNum);
    }
    /*
    sed -n '10p' file.txt
     */
}
