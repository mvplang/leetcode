public class Solution {
    public int trap(int[] height) {
        
        if(height == null || height.length == 0){return 0;}
        int ans = 0;
        int[] max_left = new int[height.length];
        int[] max_right = new int[height.length];
        
        max_left[0] = height[0];
        
        for(int i = 1; i < height.length; i++){
            max_left[i] = Math.max(max_left[i - 1], height[i]);
        }
        
        max_right[height.length - 1] = height[height.length - 1];
        for(int i = height.length - 2; i >= 0; i--){
            max_right[i] = Math.max(max_right[i + 1], height[i]);
        }
                    
        for(int i = 0; i < height.length; i++){
            ans += Math.min(max_left[i],max_right[i]) - height[i];
        }
        
        return ans;
    }
}

public class Solution {
    public int trap(int[] height) {
        
        int ans = 0;
        int cur = 0;
        Stack<Integer> stack = new Stack<Integer>();
        
        while(cur < height.length){
            while(!stack.isEmpty() && height[cur] > height[stack.peek()]){
                int tmp = stack.pop();
                if(stack.isEmpty()){
                    break;
                }
                int dis = cur - stack.peek() - 1;
                int h = Math.min(stack.peek(), height[cur]);
                ans += dis * (h - height[tmp]);
            }
            stack.push(cur++);
        }

        return ans;
    }
}