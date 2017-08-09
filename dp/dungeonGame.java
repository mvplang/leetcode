public class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;

        int[][] dp = new int[m][n];

		for(int i = m - 1; i >= 0; i--){
			for(int j = n - 1; j >= 0; j--){

				if(i == m - 1 && j == n - 1){
					dp[i][j] = Math.max(-dungeon[m - 1][n - 1] + 1, 1);
					continue;
				}

				if(i == m -1){
					dp[i][j] = Math.max(-dungeon[i][j] + dp[i][j + 1], 1);
					continue;
				}

				if(j == n -1){
					dp[i][j] = Math.max(-dungeon[i][j] + dp[i + 1][j], 1);
					continue;
				}

				dp[i][j] = Math.max( Math.min(dp[i + 1][j], dp[i][j + 1]) - dungeon[i][j], 1);
			}
		}

		return dp[0][0];
    }
}