package leetcode2;

import java.util.Arrays;
import java.util.Stack;

public class S71_SimplifyPath {
    public static void main(String[] args) {
        String a = "/a/./b/../../c/";
        System.out.println(simplifyPath(a));

    }
    public static String simplifyPath(String path) {
        String[] pathSpilt = path.split("/");
        Stack<String> pathStack = new Stack<>();
        for (int i = 1 ; i<pathSpilt.length; i++) {
            if (pathSpilt[i].equals("") || pathSpilt[i].equals(".")){
                continue;
            } else if (pathSpilt[i].equals("..")) {
                if (pathStack.empty()){
                    continue;
                } else {
                    pathStack.pop();
                }
            } else {
                pathStack.push(pathSpilt[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        if (pathStack.empty()){
            return "/";
        }
        while (!pathStack.empty()){
            sb.insert(0,pathStack.pop());
            sb.insert(0,"/");
        }
        return sb.toString();
    }
}
/*
Input: path = "/home/"
Output: "/home"
Explanation: Note that there is no trailing slash after the last directory name.

Input: path = "/../"
Output: "/"
Explanation: Going one level up from the root directory is a no-op, as the root level is the highest level you can go.

Input: path = "/home//foo/"
Output: "/home/foo"
Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.

Input: path = "/a/./b/../../c/"
Output: "/c"
 */