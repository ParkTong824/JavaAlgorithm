package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S40_CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates); // important
        backtrack(0,target, new ArrayList<>(), candidates, ans);
        return ans;
    }

    private void backtrack(int index, int target, ArrayList<Integer> curr, int[] candidates, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }else if(target < 0){
            return;
        }

        for(int i = index; i < candidates.length; i++){
            if(i > index && candidates[i] == candidates[i-1]) continue; // important
            curr.add(candidates[i]);
            backtrack(i+1, target-candidates[i], curr, candidates, ans);
            curr.remove(curr.size()-1);
        }
    }
}
