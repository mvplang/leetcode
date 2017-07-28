public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int ans = 0;
        int n = s.length();
        Set<Character> set = new HashSet<>();
        while(j < n){
        	if (!set.contains(s.charAt(j))){
				set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
        	}else{
        		set.remove(s.charAt(i++));
        	}
        }

        return ans;
    }
}