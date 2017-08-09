public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<String>();
        int n = nums.length;

        for(int i = 0; i < nums.length; i++){
			int tmp = nums[i];
			while(i + 1 < nums.length && nums[i + 1] - nums[i] == 1){
				i++;
			}

			if(tmp != nums[i]){
				list.add(tmp + "->" + nums[i]);
			}else{
				list.add(tmp + "");
			}
        }

        return list;
    }
}