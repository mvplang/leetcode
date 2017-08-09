public class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start < end){
			int mid = start + (end - start)/2;

			if(nums[mid] > nums[end]){
				start = mid + 1;
			}else{
				end = mid;
			}
        }

        int index = start;
        start = 0;
        end = nums.length - 1;

        while(start <= end){
        	int mid = (start + end)/2;
			int realMid = (mid + index)%nums.length;

			if(nums[realMid] == target){
				return realMid;
			}else if(nums[realMid] < target){
				start = mid + 1;
			}else{
				end = mid - 1;
			}
        }

        return -1;
    }
}