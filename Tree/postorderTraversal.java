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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
        while(!stack.isEmpty() || cur != null){
			if(cur != null){
	            stack.add(cur);
	            res.add(0, cur.val);  // Reverse the process of preorder
	            cur = cur.right;             // Reverse the process of preorder
	        }else{
	            TreeNode node = stack.poll();
	            cur = node.left;           // Reverse the process of preorder
	        }
        }

        return res;
    }
}