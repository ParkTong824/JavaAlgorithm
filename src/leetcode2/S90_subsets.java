package leetcode2;

import java.util.*;

public class S90_subsets {
    public List<List<Integer>> subsetsWithDup(int[] arr) {
        //sorting helps us to get rid of duplicate subsets
        Arrays.sort(arr);
        int limit = (int)Math.pow(2,arr.length);
        List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0;i < limit;i++){
            List<Integer> lst = new ArrayList<>();
            int temp = i;
            //making binary numbers
            for(int j = arr.length - 1;j >= 0;j--){
                int r = temp % 2;
                temp = temp / 2;
                if(r != 0){
                    lst.add(arr[j]);
                }

            }
            if(!set.contains(lst)){
                res.add(new ArrayList<>(lst));
            }
            set.add(lst);
        }

        return res;
    }
}
