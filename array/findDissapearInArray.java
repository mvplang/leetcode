public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < nums.length; i++){
	        int val = Math.abs(nums[i]) - 1;
	        if(val > 0){
	        	nums[val] = -nums[val];
	        }
        }

        for(int i = 0; i < nums.length; i++){
        	if(nums[i] > 0){
        		list.add(i + 1);
        	}
        }

        return list;
    }
}