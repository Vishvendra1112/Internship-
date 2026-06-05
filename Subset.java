import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void subsetsFunc(int[] nums,List<List<Integer>> ans, int index, List<Integer> subList){
        ans.add(new ArrayList<>(subList));

        for(int i= index; i<nums.length;i++){
            // add data to the sublist
            subList.add(nums[i]);
            // move to next index
            subsetsFunc(nums,ans,i+1,subList);
            subList.remove(subList.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        subsetsFunc(nums,ans,0,new ArrayList<>());
        return ans;
    }
}
