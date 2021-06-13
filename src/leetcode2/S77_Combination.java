package leetcode2;

import java.util.ArrayList;
import java.util.List;

public class S77_Combination {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();

        getCombination(1,n,k,new ArrayList<>(),ans);
        return ans;

    }
    public static void getCombination(int s,int d,int size,ArrayList<Integer> a,List<List<Integer>> ans)
    {
        if(a.size()>=size)
        {
            if(a.size()==size){
                ans.add(new ArrayList<>(a));
            }
            return ;
        }
        for(int i=s;i<=d;i++)
        {
            a.add(i);
            getCombination(i+1,d,size,a,ans);
            a.remove(a.size()-1);
        }
    }

    public static void main(String[] args) {

    }
}
/*
Input: n = 4, k = 2
Output:
[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]

Input: n = 1, k = 1
Output: [[1]]
 */