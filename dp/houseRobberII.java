public class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1)return nums[0];
        return Math.max(helper(nums, 0, nums.length - 2), helper(nums, 1, nums.length -1));
    }
    
    public int helper(int[] nums, int l, int h){
        int i = 0, e = 0;
        for(int k = l; k <= h; k++){
            int temp = i;
            i = nums[k] + e;
            e = Math.max(temp, e);
        }
        
        return Math.max(i,e);
    }
}