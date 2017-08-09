public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(nums == null || nums.length == 0 || k <= 0 || t < 0){
            return false;
        }
        
        final TreeSet<Integer> set = new TreeSet<Integer>();
        for(int i = 0; i < nums.length; i++){
        	Integer floor = set.ceiling(nums[0] + t);
        	Integer ceil = set.floor(nums[0] - t);
        	if( (ceil != null && ceil <= nums[i]) || (floor != null && floor >= nums[i])){
        		return true;
        	}

        	set.add(nums[i]);
        	if(i > k){
        		set.remove(nums[i - k - 1]);
        	}
        }

        return false;
    }
}