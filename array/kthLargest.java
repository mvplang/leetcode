public class Solution {
    public int findKthLargest(int[] nums, int k) {
        return helper(0, nums.length - 1, nums, nums.length - k);
    }

    public int helper(int start, int end, int[] nums, int k){
    	int pivot = nums[end];
    	int left = start;
    	for(int i = start; i < end; i++){
    		if(nums[i] <= pivot){
				swap(nums,left++, i);
    		}
    	}
    	swap(nums, end, left);

    	if(k == left){
    		return nums[left];
    	}else if(k < left){
    		return helper(start, left - 1, nums, k);
    	}else{
    		return helper(left + 1, nums.length - 1, nums, k);
    	}

    }

    void swap(int[] nums, int i, int j){
    	int temp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = temp;
    }
}