import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    
    public static void func(int[] candidates, int target ,int index , List<List<Integer>> ans , List<Integer> subList ){
        // base condition
        if(target == 0){
            ans.add(new ArrayList<>(subList));
            return;
        }
        if (index == candidates.length || target<0){
            return ;
        }
        // logic
        subList.add(candidates[index]);
        func( candidates, target-candidates[index],index,ans,subList);
        subList.remove(subList.size()-1);
        func( candidates, target, index+1, ans,subList);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList();
        func( candidates, target, 0,ans,new ArrayList<>());
        return ans;
    }
}
