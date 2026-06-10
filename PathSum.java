import javax.swing.tree.TreeNode;

public class PathSum {
     public boolean hasPathSum(TreeNode root, int targetSum) {
        //base condition 
        if(root == null){
            return false;
        }
        // base condition 
        if(root.left == null && root.right == null){
            return targetSum - root.val == 0;
        }
        targetSum = targetSum - root.val;
        return hasPathSum(root.left, targetSum)|| hasPathSum(root.right, targetSum);


        
    }
}
