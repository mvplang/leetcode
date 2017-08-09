public class Solution {
    public int maximalSquare(char[][] matrix) {
    	if(matrix.length == 0)return 0;
    	int m = matrix.length;
    	int n = matrix[0].length;
    	int[][] size = new int[m][n];
        int max = 0;

        for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(i == 0 || j == 0){
					if(matirx[i][j] == '1'){
						size[i][j] == 1;
						max = Math.max(max, 1);
					}
				}else{
					if(matirx[i][j] == '1'){
						size[i][j] = Math.min()
					}
				}
			}
        }
    }
}