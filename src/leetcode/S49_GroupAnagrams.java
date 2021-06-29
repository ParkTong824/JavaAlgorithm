package leetcode;

import java.util.*;

public class S49_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        if(strs == null){
            return list;
        }
        Map<String, List<String>> hashMap = new HashMap<>();
        for(String each: strs){
            char c[] = each.toCharArray();
            Arrays.sort(c);
            String sorted = String.copyValueOf(c);
            if(hashMap.containsKey(sorted)){
                hashMap.get(sorted).add(each);
            }
            else{
                List<String> stringList = new ArrayList<>();
                stringList.add(each);
                hashMap.put(sorted, stringList);
            }
        }
        list.addAll(hashMap.values());
        return list;
    }
}
