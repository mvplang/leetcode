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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        boolean flag = true;

        if(root == null)return list;
        queue.offer(root);

        while(!queue.isEmpty()){
			List<Integer> temp = new LinkedList<Integer>();
			int size = queue.size();
			for(int i = 0; i < size; i++){
				if(queue.peek().left != null){queue.offer(queue.peek().left);}
				if(queue.peek().right != null){queue.offer(queue.peek().right);}
				if(flag){
					temp.add(queue.poll().val);
				}else{
					temp.add(0,queue.poll().val);
				}
			}
			list.add(temp);
			flag = !flag;
        }

        return list;
    }
}