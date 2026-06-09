import javax.swing.tree.TreeNode;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // base condition 
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        // logic
        if(p.val != q.val){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right, q.right);
        
    }
}
