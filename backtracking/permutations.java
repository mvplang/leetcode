public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
		helper(list, new ArrayList<Integer>(), nums, 0);

		return list;
    }

    public void helper(List<List<Integer>> list, List<Integer> temp, int[] nums){
		
		if(temp.size() == nums.length){
			list.add(new ArrayList<>(temp));
		}else{
			for(int i = 0; i < nums.length; i++){
				if(temp.contains(nums[i])) continue;
				temp.add(nums[i]);
				helper(list, temp, nums);
				temp.remove(temp.size() - 1);
			}
		}
    }
}