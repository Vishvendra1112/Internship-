import javax.swing.tree.TreeNode;

public class DiameterofBinaryTree {
    public static int traversal(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftMax = traversal(root.left);
        int rightMax = traversal(root.right);

        int max = Math.max(leftMax, rightMax)+1;
        return max;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0 ;
        }
        int dia1 = diameterOfBinaryTree(root.left);
        int dia2 = diameterOfBinaryTree(root.right);
        int dia3 = traversal(root.left)+traversal(root.right);
        return Math.max(dia3,Math.max(dia1,dia2));
    }
}
