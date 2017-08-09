public class Solution {
    public boolean howManyRoles(int sum) {
    	// 0 1 2 3 4 5 6 7 8 9
        int[] zeros = [1,0,0,0,1,0,1,0,2,1];
        int res = 0;
        while(num > 0){
        	int digit = num % 10;
        	res += zeros[digit]; 
        	num /= 10;
        }
        return res;
    }
}