import javax.swing.tree.TreeNode;

public class SymmetricTree {
    public static boolean symmetric(TreeNode left, TreeNode right) {
        // base condition 
        if(left == null && right == null) {
            return true;
        } 
        if(left == null || right == null) {
            return false;
        }
        if(left.val != right.val){
            return false;
        }
        // logic
        return symmetric(left.left, right.right) && symmetric(left.right, right.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return symmetric(root.left, root.right);
    }
}
