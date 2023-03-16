package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution19 {
    public static String solution(String[] Dir, String[][] Cmd){
        StringBuilder nowDir = new StringBuilder(Dir[0]);
        Set<String> dirSet = new HashSet<>();
        Set<String> fileSet = new HashSet<>();

        for (int i =0 ; i < Dir.length ; i++) {
            StringBuilder checkDirString = new StringBuilder();
            String[] tempSplitArr = Dir[i].split("/");
            int checkLength = 0;
            if (Dir[i].split("\\.").length>1) {
                checkLength = tempSplitArr.length-1;
                fileSet.add(Dir[i]);
            } else {
                checkLength = tempSplitArr.length;
            }
            for (int j = 0 ; j < checkLength ; j++) {
                checkDirString.append(tempSplitArr[j]);
                dirSet.add(checkDirString.toString());
                if (j < checkLength-1) {
                    checkDirString.append("/");
                }
            }
        }
        for(int i = 0 ; i < Cmd.length ; i++) {
            StringBuilder checkDirString;
            if (Cmd[i][0].toUpperCase().equals("CD")) {
                if (Cmd[i][1].startsWith("C:/")) {
                    checkDirString = new StringBuilder(Cmd[i][1]);
                } else {
                    checkDirString = new StringBuilder(nowDir + "/" + Cmd[i][1]);
                }
                if (dirSet.contains(String.valueOf(checkDirString))) {
                    nowDir = new StringBuilder(checkDirString);
                }
            } else if (Cmd[i][0].toUpperCase().equals("MKDIR")) {
                if (Cmd[i][1].startsWith("C:/")) {
                    dirSet.add(Cmd[i][1]);
                } else {
                    checkDirString = new StringBuilder(nowDir + "/" + Cmd[i][1]);
                    dirSet.add(checkDirString.toString());
                }
            } else if (Cmd[i][0].toUpperCase().equals("RMDIR")) {
                if (Cmd[i][1].startsWith("C:/")) {
                    checkDirString = new StringBuilder(Cmd[i][1]);
                } else {
                    checkDirString = new StringBuilder(nowDir + "/" + Cmd[i][1]);
                }
                if (checkDirString.equals(nowDir)) {
                    continue;
                } else {
                    boolean isContainFile = false;
                    for (String fileRoot : fileSet) {
                        if (fileRoot.startsWith(String.valueOf(checkDirString))) {
                            isContainFile = true;
                            break;
                        }
                    }
                    if (!isContainFile) {
                        dirSet.remove(String.valueOf(checkDirString));
                    }
                }
            }
            if (Cmd[i][1].split("\\.").length>1){
                continue;
            }
        }
        return nowDir.toString();
    }

    public static void main(String[] args) {
        String[] Dir = {"C:/root","C:/root/folder1","C:/root/folder2/file1.txt","C:/root/folder2/file2.txt"};
//        String[] Dir = {"C:/root/folder1","C:/root/folder2/file1.txt","C:/root/folder2/file2.txt"};
        String[][] cmd = {{"rmdir", "folder1"},{"cd", "folder1"}};
        System.out.println(solution(Dir,cmd));
//        System.out.println(Arrays.toString("C:/root/folder2/file1.txt".split("\\.")));
    }

}
