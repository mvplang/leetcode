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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(root != null){
        	list.add(root.val);
        	if(root.right != null){
        		stack.add(root.right);
        	}
        	root = root.left;
        	if(root == null && !stack.isEmpty()){
        		root = stack.pop();
        	}
        }

        return list;
    }
} 
