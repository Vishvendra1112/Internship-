import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class BinaryTreeLevelOrderTraversal {
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer> LevelNodes = new ArrayList<>();

            for(int i = 0;i<level;i++){
                TreeNode node = queue.poll();
                LevelNodes.add(node.val);

                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                     queue.offer(node.right);
                }
            }
            ans.add(LevelNodes);
        }
        return ans;
    }
}
