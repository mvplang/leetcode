public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        helper(list, new ArrayList<>(), target, candidates, 0);

        return list;
    }
    
    public void helper(List<List<Integer>> list, List<Integer> temp, int diff, int[] nums, int start){
    	if(diff < 0) return;
		else if(diff == 0){list.add(new ArrayList<>(temp));}
		else{
			for(int i = start; i < nums.length; i++){
				temp.add(nums[i]);
				helper(list, temp, diff - nums[i], nums, i);
				temp.remove(temp.size() - 1);
			}
		}
    }
}