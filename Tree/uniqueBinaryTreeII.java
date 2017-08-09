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
    public List<TreeNode> generateTrees(int n) {
        return helper(1,n);
    }
    
    public List<TreeNode> helper(int start, int end){
        List<TreeNode> list = new ArrayList<TreeNode>();
        
        if(start > end){
            list.add(new TreeNode());
            return list;
        }
        
        if(start == end){
            list.add(new TreeNode(start));
            return list;
        }
        
        List<TreeNode> left,right;
        for(int i = start; i <= end; i++){
            left = helper(start, i-1);
            right = helper(i+1,end);
            
            for(TreeNode l: left){
                for(TreeNode r: right){
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    list.add(root);
                }
            }
        }
        
        return list;
    }
}