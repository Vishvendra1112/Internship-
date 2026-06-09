import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class TreePreorderTraversal {
    public static void traversal(TreeNode root,List<Integer> ans) {
        if(root == null){
            return; 
        }
        ans.add(root.val);
        traversal(root.left,ans);
        traversal(root.right,ans);
        
    }
     public List<Integer> preorderTraversal(TreeNode root) {
      List<Integer> ans = new ArrayList<>();
      traversal(root,ans);
      return ans;
     }
}
