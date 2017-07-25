public class Solution {
    public int numIslands(char[][] grid) {
    	int count = 0;
        int n = grid.length;
        if(n < 1)return count;
        int m = grid[0].length;
        for(int i = 0; i < n; i++){
        	for(int j = 0; j < m; j++){
        		if(grid[i][j] == '1'){
	        		helper(grid, i, j);
	        		count++;
        		}
        	}
        }
        return count;
    }

    public void helper(char[][] grid, int m, int n){
    	if(m < 0 || m >= grid.length || n < 0 || n>=grid[0].length || grid[m][n] == '0')return;
    	grid[m][n] = '0';
    	helper(grid, m + 1, n);
	    helper(grid, m - 1, n);
	    helper(grid, m, n + 1);
	    helper(grid, m, n - 1);
    }
}