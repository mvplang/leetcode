public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        int[][] matrix = new int[numCourses][numCourses];
        int[] indegree = new int[numCourses];
        for(int i = 0; i < prerequisites.length; i++){
            if (matrix[pre][ready] == 0){
               indegree[ prerequisites[i][0] ]++;
            }
            matrix[ prerequisites[i][1] ][ prerequisites[i][0] ] = 1;
        }
        
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i = 0; i < numCourses; i++){
            if( indegree[i] == 0){
                queue.offer(i);
            }
        }
        int count = queue.size();
        while(!queue.isEmpty()){
            int index = queue.poll();
            for(int i = 0; i < numCourses; i++){
                if(matrix[index][i] == 1){
                    if( --indegree[i] == 0){
                        queue.offer(i);
                        count++;
                    }
                }
            }
        }

        return count == numCourses;

    }
}