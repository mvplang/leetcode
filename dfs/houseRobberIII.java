public class Solution {
    public int rob(TreeNode root) {
        int[] ans = helper(root);
        return Math.max(ans[0],ans[1]);
    }
    
    public int[] helper(TreeNode root){
        int[] res = new int[2];
        if(root == null){return res;};

        int[] left = helper(root.left);
        int[] right = helper(root.right);

        res[0] = root.val + left[1] + right[1];
        res[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

        return res;
    }
}