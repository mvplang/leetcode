/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        if(root == null){
            return list;
        }
        
        queue.offer(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            while(size-- > 0){
                TreeNode node = queue.poll();
                subList.add(node.val);
                if(node.left != null){queue.offer(node.left);}
                if(node.right != null){queue.offer(node.right);}        
            }
            list.add(subList);
        }
        
        return list;
    }
}