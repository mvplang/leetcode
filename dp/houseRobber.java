public class Solution {
    public int rob(int[] nums) {
        int i = 0;
        int e = 0;
        for(int k = 0; k <= nums.length - 1; k++){
            int tmp = i;
            i = nums[k] + e;
            e = Math.max(tmp,e);
        }
        
        return Math.max(i,e);
    }
}