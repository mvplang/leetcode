public class Solution {
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        int[][] matrix = new int[numCourses][numCourses];
        int[] visited = new int[numCourses];
        for(int i = 0; i < prerequisites.length; i++){
            matrix[ prerequisites[i][1] ][ prerequisites[i][0] ] = 1;
        }

        for(int i = 0; i < numCourses; i++){
            if(!dfs(matrix, visited, i)){
                return false;
            }
        }

        return true;
    }

    public boolean dfs(int[][] matrix, int[] visited, int course){
        if(visited[course]){
            return false;
        }else{
            visited[course] = true;
        }

        for(int i = 0; i < numCourses; i++){
            if(matrix[course][i] == 1){
                if(!dfs(matrix, visited, i)){
                    return false
                }
            }
        }

        visited[course] = false;
        return true;
    } 
}



public class Solution {
        public boolean canFinish(int numCourses, int[][] prerequisites) {
            ArrayList[] graph = new ArrayList[numCourses];
            for(int i=0;i<numCourses;i++)
                graph[i] = new ArrayList();
                
            boolean[] visited = new boolean[numCourses];
            for(int i=0; i<prerequisites.length;i++){
                graph[prerequisites[i][1]].add(prerequisites[i][0]);
            }

            for(int i=0; i<numCourses; i++){
                if(!dfs(graph,visited,i))
                    return false;
            }
            return true;
        }

        private boolean dfs(ArrayList[] graph, boolean[] visited, int course){
            if(visited[course])
                return false;
            else
                visited[course] = true;;

            for(int i=0; i<graph[course].size();i++){
                if(!dfs(graph,visited,(int)graph[course].get(i)))
                    return false;
            }
            visited[course] = false;
            return true;
        }
    }