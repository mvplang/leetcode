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
    public boolean isValidBST(TreeNode root) {
        helper(root, Integer.MIN_VALUE , Integer.MAX_VALUE);
    }
    
    public boolean helper(TreeNode root, int left, int right){
        if(root == null)return true;
        if(root.val < left || root.val > right)return false;
        return helper(root.left, left, root.val) && helper(root.right, root.val, right);
        
    }
}