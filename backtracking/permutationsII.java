public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
		helper(list, new ArrayList<Integer>(), nums, new boolean[nums.length]);

		return list;
    }

    public void helper(List<List<Integer>> list, List<Integer> temp, int[] nums, boolean[] used){
		
		if(temp.size() == nums.length){
			list.add(new ArrayList<>(temp));
		}else{
			for(int i = 0; i < nums.length; i++){
				if(used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
				used[i] = true;
				temp.add(nums[i]);
				helper(list, temp, nums, used);
				used[i] = false;
				temp.remove(temp.size() - 1);
			}
		}
    }
}